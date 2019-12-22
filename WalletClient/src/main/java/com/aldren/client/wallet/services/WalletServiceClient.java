package com.aldren.client.wallet.services;

import com.aldren.client.wallet.constants.CurrencyConstants;
import com.aldren.wallet.grpc.*;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Slf4j
@Service
public class WalletServiceClient {

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

    @Async
    public void roundA(String user) {
        log.info(String.format("Round A::Executing for user %s.", user));

        log.info(String.format("Round A(%s): Depositing USD 100.", user));
        deposit(user, 100d, CurrencyConstants.CURRENCY_USD);

        log.info(String.format("Round A(%s): Withdrawing USD 200.", user));
        withdraw(user, 200d, CurrencyConstants.CURRENCY_USD);

        log.info(String.format("Round A(%s): Depositing EUR 100.", user));
        deposit(user, 100d, CurrencyConstants.CURRENCY_EUR);

        checkBalance(user);
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
            log.info(String.format("Round A(%1s): %2s", user, e.getLocalizedMessage()));
        }
    }

    private void deposit(String user, double amount, String currency) {
        walletService.deposit(WalletRequest.newBuilder()
                .setUser(User.newBuilder()
                        .setUserId(user)
                        .build())
                .setMoney(Money.newBuilder()
                        .setAmount(amount)
                        .setCurrency(currency)
                        .build())
                .build());
    }

    private void checkBalance(String user) {
        Balance balance1 = walletService.checkBalance(User.newBuilder().setUserId(user).build());
        log.info(String.format("Round A(%1s): Checking balance \n%2s", user, balance1.toString()));
    }

}
