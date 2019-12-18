package com.aldren.server.wallet;

import com.aldren.server.wallet.services.WalletService;
import com.aldren.wallet.grpc.Empty;
import com.aldren.wallet.grpc.Money;
import com.aldren.wallet.grpc.User;
import com.aldren.wallet.grpc.WalletRequest;
import io.grpc.internal.testing.StreamRecorder;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class AppTest {

    @Autowired
    private WalletService service;

    @Test
    @Order(1)
    public void firstTestCase() {
        WalletRequest request = WalletRequest.newBuilder()
                .setUser(User.newBuilder()
                        .setUserId("1")
                        .build())
                .setMoney(Money.newBuilder()
                        .setAmount(200d)
                        .setCurrency("USD")
                        .build())
                .build();

        StreamRecorder<Empty> responseObserver = StreamRecorder.create();

        service.withdraw(request, responseObserver);
        assertEquals("NOT_FOUND: User doesn't have USD account", responseObserver.getError().getMessage());
    }

}
