package com.aldren.client.wallet.services.impl;

import com.aldren.client.wallet.constants.CurrencyConstants;
import com.aldren.client.wallet.exceptions.UserDoesNotExistsException;
import com.aldren.client.wallet.services.WalletServiceClient;
import com.aldren.wallet.grpc.*;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Slf4j
@Service
public class WalletServiceClientImpl implements WalletServiceClient {

    private static final String ROUND_A = "A";
    private static final String ROUND_C = "C";
    @Autowired
    private EurekaClient eurekaClient;
    private WalletServiceGrpc.WalletServiceBlockingStub walletService;

    @PostConstruct
    public void init() {
        final InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka("walletServerService", false);
        final ManagedChannel channel = ManagedChannelBuilder.forAddress(instanceInfo.getIPAddr(), instanceInfo.getPort())
                .usePlaintext()
                .build();

        walletService = WalletServiceGrpc.newBlockingStub(channel);
    }

    @Override
    public void roundA(String user) {
        try {
            log.info(String.format("Round A::Executing for user %s.", user));

            log.info(String.format("Round A(%s): Depositing USD 100.", user));
            deposit(user, 100d, CurrencyConstants.CURRENCY_USD);

            log.info(String.format("Round A(%s): Withdrawing USD 200.", user));
            withdraw(user, 200d, CurrencyConstants.CURRENCY_USD);

            log.info(String.format("Round A(%s): Depositing EUR 100.", user));
            deposit(user, 100d, CurrencyConstants.CURRENCY_EUR);

            checkBalance(user, ROUND_A);

            log.info(String.format("Round A(%s): Withdrawing USD 100.", user));
            withdraw(user, 100d, CurrencyConstants.CURRENCY_USD);

            checkBalance(user, ROUND_A);

            log.info(String.format("Round A(%s): Withdrawing USD 100.", user));
            withdraw(user, 100d, CurrencyConstants.CURRENCY_USD);
        } catch (UserDoesNotExistsException e) {
            log.info(String.format("Round A(%1s): %2s", user, e.getLocalizedMessage()));
            log.info("Exiting Round A.");
        }
    }

    @Override
    public void roundB(String user) {
        try {
            log.info(String.format("Round B::Executing for user %s.", user));

            log.info(String.format("Round B(%s): Depositing GBP 100.", user));
            withdraw(user, 100d, CurrencyConstants.CURRENCY_GBP);

            log.info(String.format("Round B(%s): Depositing GBP 300.", user));
            deposit(user, 300d, CurrencyConstants.CURRENCY_GBP);

            log.info(String.format("Round B(%s): Depositing GBP 100.", user));
            withdraw(user, 100d, CurrencyConstants.CURRENCY_GBP);

            log.info(String.format("Round B(%s): Depositing GBP 100.", user));
            withdraw(user, 100d, CurrencyConstants.CURRENCY_GBP);

            log.info(String.format("Round B(%s): Depositing GBP 100.", user));
            withdraw(user, 100d, CurrencyConstants.CURRENCY_GBP);
        } catch (UserDoesNotExistsException e) {
            log.info(String.format("Round B(%1s): %2s", user, e.getLocalizedMessage()));
            log.info("Exiting Round B.");
        }
    }

    @Override
    public void roundC(String user) {
        try {
            log.info(String.format("Round C::Executing for user %s.", user));

            checkBalance(user, ROUND_C);

            log.info(String.format("Round C(%s): Depositing USD 100.", user));
            deposit(user, 100d, CurrencyConstants.CURRENCY_USD);

            log.info(String.format("Round C(%s): Depositing USD 100.", user));
            deposit(user, 100d, CurrencyConstants.CURRENCY_USD);

            log.info(String.format("Round C(%s): Withdrawing USD 100.", user));
            withdraw(user, 100d, CurrencyConstants.CURRENCY_USD);

            log.info(String.format("Round C(%s): Depositing USD 100.", user));
            deposit(user, 100d, CurrencyConstants.CURRENCY_USD);

            checkBalance(user, ROUND_C);

            log.info(String.format("Round C(%s): Withdrawing USD 200.", user));
            withdraw(user, 200d, CurrencyConstants.CURRENCY_USD);

            checkBalance(user, ROUND_C);
        } catch (UserDoesNotExistsException e) {
            log.info(String.format("Round C(%1s): %2s", user, e.getLocalizedMessage()));
            log.info("Exiting Round C.");
        }
    }

    private void withdraw(String user, double amount, String currency) {
        try {
            walletService.withdraw(WalletRequest.newBuilder()
                    .setUser(User.newBuilder().setUserId(user).build())
                    .setMoney(Money.newBuilder()
                            .setAmount(amount)
                            .setCurrency(currency)
                            .build())
                    .build());
        } catch (StatusRuntimeException e) {
            if (e.getLocalizedMessage().contains("Unknown User")) {
                throw new UserDoesNotExistsException(e.getLocalizedMessage());
            } else {
                log.info(String.format("Round A(%1s): %2s", user, e.getLocalizedMessage()));
            }
        }
    }

    private void deposit(String user, double amount, String currency) {
        try {
            walletService.deposit(WalletRequest.newBuilder()
                    .setUser(User.newBuilder()
                            .setUserId(user)
                            .build())
                    .setMoney(Money.newBuilder()
                            .setAmount(amount)
                            .setCurrency(currency)
                            .build())
                    .build());
        } catch (StatusRuntimeException e) {
            if (e.getLocalizedMessage().contains("Unknown User")) {
                throw new UserDoesNotExistsException(e.getLocalizedMessage());
            } else {
                log.info(String.format("Round A(%1s): %2s", user, e.getLocalizedMessage()));
            }
        }
    }

    private void checkBalance(String user, String round) {
        Balance balance1 = walletService.checkBalance(User.newBuilder().setUserId(user).build());
        log.info(String.format("Round %1s(%2s): Checking balance \n%3s", round, user, balance1.toString()));
    }


}
