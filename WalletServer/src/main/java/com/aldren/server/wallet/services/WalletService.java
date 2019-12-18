package com.aldren.server.wallet.services;

import com.aldren.server.wallet.entities.ECurrencies;
import com.aldren.server.wallet.entities.EMoney;
import com.aldren.server.wallet.entities.ETransactions;
import com.aldren.server.wallet.entities.EUsers;
import com.aldren.server.wallet.exceptions.CurrencyNotExistsException;
import com.aldren.server.wallet.exceptions.InsufficientFundsException;
import com.aldren.server.wallet.exceptions.UserDoesNotExistsException;
import com.aldren.server.wallet.exceptions.WalletException;
import com.aldren.server.wallet.repositories.CurrenciesRepository;
import com.aldren.server.wallet.repositories.MoneyRepository;
import com.aldren.server.wallet.repositories.TransactionsRepository;
import com.aldren.server.wallet.repositories.UsersRepository;
import com.aldren.wallet.grpc.*;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@GRpcService
public class WalletService extends WalletServiceGrpc.WalletServiceImplBase {

    private static final String CREDIT = "CR";
    private static final String DEBIT = "DR";
    @Autowired
    private CurrenciesRepository currencies;
    @Autowired
    private MoneyRepository money;
    @Autowired
    private TransactionsRepository transactions;
    @Autowired
    private UsersRepository users;

    @Override
    public void deposit(WalletRequest request, StreamObserver<Empty> responseObserver) {
        try {
            currencies.findByCurrencyCode(request.getMoney().getCurrency()).ifPresentOrElse(currency -> processByUser(request, currency, CREDIT), () -> {
                throw new CurrencyNotExistsException();
            });
            responseObserver.onNext(Empty.newBuilder().build());
            responseObserver.onCompleted();
        } catch (WalletException e) {
            responseObserver.onError(Status.NOT_FOUND.withDescription(e.getMessage()).withCause(e).asException());
        }
    }

    @Override
    public void withdraw(WalletRequest request, StreamObserver<Empty> responseObserver) {
        try {
            currencies.findByCurrencyCode(request.getMoney().getCurrency()).ifPresentOrElse(currency -> processByUser(request, currency, DEBIT), () -> {
                throw new CurrencyNotExistsException();
            });
            responseObserver.onNext(Empty.newBuilder().build());
            responseObserver.onCompleted();
        } catch (InsufficientFundsException e) {
            responseObserver.onError(Status.INVALID_ARGUMENT.withDescription(e.getMessage()).withCause(e).asException());
        } catch (WalletException e) {
            responseObserver.onError(Status.NOT_FOUND.withDescription(e.getMessage()).withCause(e).asException());
        }
    }

    @Override
    public void checkBalance(User userRequest, StreamObserver<Balance> balanceStreamObserver) {
        try {
            users.findByUserId(userRequest.getUserId()).ifPresentOrElse(user -> {
                Balance balance = Balance.newBuilder()
                        .setUser(User.newBuilder().setUserId(user.getUserId()))
                        .addAllMoney(getMoneyList(money.findByUserId(user.getId()).get()))
                        .build();

                balanceStreamObserver.onNext(balance);
                balanceStreamObserver.onCompleted();
            }, () -> {
                throw new UserDoesNotExistsException();
            });
        } catch (UserDoesNotExistsException e) {
            balanceStreamObserver.onError(Status.NOT_FOUND.withDescription(e.getMessage()).withCause(e).asException());
        }
    }

    private void processByUser(WalletRequest request, ECurrencies currency, String action) {
        users.findByUserId(request.getUser().getUserId()).ifPresentOrElse(user -> processByMoney(request, user, currency, action), () -> {
            throw new UserDoesNotExistsException();
        });
    }

    private void processByMoney(WalletRequest request, EUsers user, ECurrencies currency, String action) {
        double amountFromRequest = request.getMoney().getAmount();

        money.findByUserIdAndCurrencyId(user.getId(), currency.getId()).ifPresentOrElse(amount -> {
            if (action.equals(DEBIT) && amount.getAmount() < amountFromRequest) {
                throw new InsufficientFundsException();
            }
            updateBalance(amountFromRequest, action, amount);
            insertTransaction(amountFromRequest, action, amount);
        }, () -> {
            switch (action) {
                case CREDIT:
                    EMoney newAmount = new EMoney();
                    newAmount.setUserId(user.getId());
                    newAmount.setCurrencyId(currency.getId());
                    newAmount.setAmount(0d);
                    updateBalance(amountFromRequest, action, newAmount);
                    insertTransaction(amountFromRequest, action, newAmount);
                    break;
                case DEBIT:
                    throw new CurrencyNotExistsException(request.getMoney().getCurrency());
                default:
                    log.warn("Action not supported. Program will do nothing.");
            }
        });
    }

    private void updateBalance(double amount, String action, EMoney money) {
        double newAmount = 0;
        switch (action) {
            case CREDIT:
                newAmount = amount + money.getAmount();
                break;
            case DEBIT:
                newAmount = money.getAmount() - amount;
                break;
            default:
                newAmount = 0;
        }
        money.setAmount(newAmount);
        this.money.saveAndFlush(money);
    }

    private void insertTransaction(double amount, String action, EMoney money) {
        ETransactions transactions = new ETransactions();
        transactions.setUserId(money.getUserId());
        transactions.setCurrencyId(money.getCurrencyId());
        transactions.setAmount(amount);
        transactions.setTransactionType(action);
        this.transactions.saveAndFlush(transactions);
    }

    private List<Money> getMoneyList(List<EMoney> monies) {
        Map<Long, String> currencyMap = currencies.findAll().stream().collect(Collectors.toMap(ECurrencies::getId, ECurrencies::getCurrencyCode));
        return monies.stream().map(amount -> Money.newBuilder().setAmount(amount.getAmount()).setCurrency(currencyMap.get(amount.getCurrencyId())).build()).collect(Collectors.toList());
    }

}
