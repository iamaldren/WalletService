package com.aldren.client.wallet.dispatcher;

import com.aldren.client.wallet.services.WalletServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RoundDispatcher {

    @Autowired
    private WalletServiceClient walletServiceClient;

    private Random random = new Random();

    @Async
    public void executeRounds(String user, int roundNum) {
        for(int i = 0; i < roundNum; i++) {
            int score = random.nextInt(roundNum);

            switch(score) {
                case 1:
                    walletServiceClient.roundB(user);
                    break;
                case 2:
                    walletServiceClient.roundC(user);
                    break;
                default:
                    walletServiceClient.roundA(user);
            }
        }
    }

}
