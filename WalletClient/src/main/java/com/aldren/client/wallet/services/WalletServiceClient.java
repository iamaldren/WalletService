package com.aldren.client.wallet.services;

import com.aldren.client.wallet.constants.CurrencyConstants;
import com.aldren.wallet.grpc.*;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class WalletServiceClient {

    @GrpcClient("walletService")
    private WalletServiceGrpc.WalletServiceBlockingStub walletService;

    @Async
    public void roundA(String user) {
        log.info(String.format("Round A::Executing for user %s.", user));

        log.info("Round A(%s): Depositing USD 100.");
        walletService.deposit(WalletRequest.newBuilder()
                .setUser(User.newBuilder()
                        .setUserId(user)
                        .build())
                .setMoney(Money.newBuilder()
                        .setAmount(100d)
                        .setCurrency(CurrencyConstants.CURRENCY_USD)
                        .build())
                .build());

        log.info("Round A(%s): Withdrawing USD 200.");
        walletService.withdraw(WalletRequest.newBuilder()
                .setUser(User.newBuilder().setUserId(user).build())
                .setMoney(Money.newBuilder()
                        .setAmount(200d)
                        .setCurrency(CurrencyConstants.CURRENCY_USD)
                        .build())
                .build());

        log.info("Round A(%s): Depositing EUR 100.");
        walletService.deposit(WalletRequest.newBuilder()
                .setUser(User.newBuilder()
                        .setUserId(user)
                        .build())
                .setMoney(Money.newBuilder()
                        .setAmount(100d)
                        .setCurrency(CurrencyConstants.CURRENCY_EUR)
                        .build())
                .build());

        Balance balance1 = walletService.checkBalance(User.newBuilder().setUserId(user).build());
        log.info("Round A(%s): Checking balance \n" + balance1.toString());
    }

}
