package com.aldren.server.wallet.services;

import com.aldren.server.wallet.entities.EMoney;
import com.aldren.server.wallet.entities.ETransactions;
import com.aldren.server.wallet.grpc.UserRequest;
import com.aldren.server.wallet.grpc.UserResponse;
import com.aldren.server.wallet.grpc.WalletServiceGrpc;
import com.aldren.server.wallet.repositories.CurrenciesRepository;
import com.aldren.server.wallet.repositories.MoneyRepository;
import com.aldren.server.wallet.repositories.TransactionsRepository;
import com.aldren.server.wallet.repositories.UsersRepository;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GrpcService
public class WalletService extends WalletServiceGrpc.WalletServiceImplBase {

    @Autowired
    private CurrenciesRepository currencies;

    @Autowired
    private MoneyRepository money;

    @Autowired
    private TransactionsRepository transactions;

    @Autowired
    private UsersRepository users;

    private static final String CREDIT = "CR";
    private static final String DEBIT = "DR";

    @Override
    public void deposit(UserRequest request, StreamObserver<UserResponse> responseObserver) {
        currencies.findByCurrencyCode(request.getMoney().getCurrency()).ifPresentOrElse(currency -> {
            users.findByUserId(request.getUser().getUserId()).ifPresentOrElse(user -> {
                money.findByUserIdAndCurrencyId(user.getId(), currency.getId()).ifPresentOrElse(amount -> {
                    updateBalance(request.getMoney().getAmount(), CREDIT, amount);
                    insertTransaction(request.getMoney().getAmount(), CREDIT, amount);
                }, () -> {
                    EMoney newAmount = new EMoney();
                    newAmount.setUserId(user.getId());
                    newAmount.setCurrencyId(currency.getId());
                    newAmount.setAmount(0d);
                    updateBalance(request.getMoney().getAmount(), CREDIT, newAmount);
                    insertTransaction(request.getMoney().getAmount(), CREDIT, newAmount);
                });
                sendResponse("", responseObserver);
            }, () -> sendResponse("Unknown user", responseObserver));
        }, () -> sendResponse("Unknown Currency", responseObserver));
    }

    @Override
    public void withdraw(UserRequest request, StreamObserver<UserResponse> responseObserver) {
        currencies.findByCurrencyCode(request.getMoney().getCurrency()).ifPresentOrElse(currency -> {
            users.findByUserId(request.getUser().getUserId()).ifPresentOrElse(user -> {
                money.findByUserIdAndCurrencyId(user.getId(), currency.getId()).ifPresentOrElse(amount -> {
                    if(amount.getAmount() >= request.getMoney().getAmount()) {
                        updateBalance(request.getMoney().getAmount(), DEBIT, amount);
                        insertTransaction(request.getMoney().getAmount(), DEBIT, amount);
                        sendResponse("", responseObserver);
                    } else {
                        sendResponse("Insufficient funds", responseObserver);
                    }
                }, () -> sendResponse(String.format("User doesn't have %s account", request.getMoney().getCurrency()), responseObserver));
            }, () -> sendResponse("Unknown user", responseObserver));
        }, () -> sendResponse("Unknown Currency", responseObserver));
    }

    private void sendResponse(String message, StreamObserver<UserResponse> responseObserver) {
        responseObserver.onNext(UserResponse.newBuilder().setError(message).build());
        responseObserver.onCompleted();
    }

    private void updateBalance(double amount, String action, EMoney money) {
        double newAmount = 0;
        switch(action) {
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

}
