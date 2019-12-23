package com.aldren.client.wallet.dispatcher;

import com.aldren.client.wallet.services.WalletServiceClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.Random;

@Slf4j
@Component
public class RoundDispatcher {

    @Autowired
    private WalletServiceClient walletServiceClient;

    private Random random = new Random();

    @Async
    public void executeRounds(String user, int roundNum) {
        for (int i = 0; i < roundNum; i++) {
            int score = random.nextInt(3);

            switch (score) {
                case 0:
                    walletServiceClient.roundA(user);
                    break;
                case 1:
                    walletServiceClient.roundB(user);
                    break;
                case 2:
                    walletServiceClient.roundC(user);
                    break;
                default:
                    log.info("Generated score not valid. Doing nothing.");
            }
        }
    }

}
