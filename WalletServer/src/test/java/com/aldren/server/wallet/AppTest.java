package com.aldren.server.wallet;

import com.aldren.server.wallet.services.WalletService;
import com.aldren.wallet.grpc.*;
import io.grpc.internal.testing.StreamRecorder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.concurrent.ExecutionException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AppTest {

    @Autowired
    private WalletService service;

    @Test
    @Order(1)
    public void firstTestCase() {
        StreamRecorder<Empty> responseObserver = StreamRecorder.create();

        service.withdraw(WalletRequest.newBuilder()
                .setUser(User.newBuilder()
                        .setUserId("1")
                        .build())
                .setMoney(Money.newBuilder()
                        .setAmount(200d)
                        .setCurrency("USD")
                        .build())
                .build(), responseObserver);

        assertEquals("NOT_FOUND: User doesn't have USD account", responseObserver.getError().getMessage());
    }

    @Test
    @Order(2)
    public void secondTestCase() {
        StreamRecorder<Empty> responseObserver = StreamRecorder.create();

        service.deposit(WalletRequest.newBuilder()
                .setUser(User.newBuilder()
                        .setUserId("1")
                        .build())
                .setMoney(Money.newBuilder()
                        .setAmount(100d)
                        .setCurrency("USD")
                        .build())
                .build(), responseObserver);

        assertNull(responseObserver.getError());
        assertEquals(Empty.newBuilder().build(), responseObserver.getValues().get(0));
    }

    @Test
    @Order(3)
    public void thirdTestCase() throws ExecutionException, InterruptedException {
        StreamRecorder<Balance> responseObserver = StreamRecorder.create();

        service.checkBalance(User.newBuilder().setUserId("1").build(), responseObserver);

        assertNull(responseObserver.getError());
        assertEquals("USD", responseObserver.firstValue().get().getMoney(0).getCurrency());
        assertEquals(100d, responseObserver.firstValue().get().getMoney(0).getAmount());
    }

    @Test
    @Order(4)
    public void fourthTestCase() {
        StreamRecorder<Empty> responseObserver = StreamRecorder.create();

        service.withdraw(WalletRequest.newBuilder()
                .setUser(User.newBuilder()
                        .setUserId("1")
                        .build())
                .setMoney(Money.newBuilder()
                        .setAmount(200d)
                        .setCurrency("USD")
                        .build())
                .build(), responseObserver);

        assertEquals("INVALID_ARGUMENT: Insufficient Fund", responseObserver.getError().getMessage());
    }

    @Test
    @Order(5)
    public void fifthTestCase() {
        StreamRecorder<Empty> responseObserver = StreamRecorder.create();

        service.deposit(WalletRequest.newBuilder()
                .setUser(User.newBuilder()
                        .setUserId("1")
                        .build())
                .setMoney(Money.newBuilder()
                        .setAmount(100d)
                        .setCurrency("EUR")
                        .build())
                .build(), responseObserver);

        assertNull(responseObserver.getError());
        assertEquals(Empty.newBuilder().build(), responseObserver.getValues().get(0));
    }

    @Test
    @Order(6)
    public void sixthTestCase() throws ExecutionException, InterruptedException {
        StreamRecorder<Balance> responseObserver = StreamRecorder.create();

        service.checkBalance(User.newBuilder().setUserId("1").build(), responseObserver);

        assertNull(responseObserver.getError());
        assertEquals("USD", responseObserver.firstValue().get().getMoney(0).getCurrency());
        assertEquals(100d, responseObserver.firstValue().get().getMoney(0).getAmount());
        assertEquals("EUR", responseObserver.firstValue().get().getMoney(1).getCurrency());
        assertEquals(100d, responseObserver.firstValue().get().getMoney(1).getAmount());
    }

    @Test
    @Order(7)
    public void seventhTestCase() {
        StreamRecorder<Empty> responseObserver = StreamRecorder.create();

        service.withdraw(WalletRequest.newBuilder()
                .setUser(User.newBuilder()
                        .setUserId("1")
                        .build())
                .setMoney(Money.newBuilder()
                        .setAmount(200d)
                        .setCurrency("USD")
                        .build())
                .build(), responseObserver);

        assertEquals("INVALID_ARGUMENT: Insufficient Fund", responseObserver.getError().getMessage());
    }

    @Test
    @Order(8)
    public void eighthTestCase() {
        StreamRecorder<Empty> responseObserver = StreamRecorder.create();

        service.deposit(WalletRequest.newBuilder()
                .setUser(User.newBuilder()
                        .setUserId("1")
                        .build())
                .setMoney(Money.newBuilder()
                        .setAmount(100d)
                        .setCurrency("USD")
                        .build())
                .build(), responseObserver);

        assertNull(responseObserver.getError());
        assertEquals(Empty.newBuilder().build(), responseObserver.getValues().get(0));
    }

    @Test
    @Order(9)
    public void ninthTestCase() throws ExecutionException, InterruptedException {
        StreamRecorder<Balance> responseObserver = StreamRecorder.create();

        service.checkBalance(User.newBuilder().setUserId("1").build(), responseObserver);

        assertNull(responseObserver.getError());
        assertEquals("USD", responseObserver.firstValue().get().getMoney(0).getCurrency());
        assertEquals(200d, responseObserver.firstValue().get().getMoney(0).getAmount());
        assertEquals("EUR", responseObserver.firstValue().get().getMoney(1).getCurrency());
        assertEquals(100d, responseObserver.firstValue().get().getMoney(1).getAmount());
    }

    @Test
    @Order(10)
    public void tenthTestCase() {
        StreamRecorder<Empty> responseObserver = StreamRecorder.create();

        service.withdraw(WalletRequest.newBuilder()
                .setUser(User.newBuilder()
                        .setUserId("1")
                        .build())
                .setMoney(Money.newBuilder()
                        .setAmount(200d)
                        .setCurrency("USD")
                        .build())
                .build(), responseObserver);

        assertNull(responseObserver.getError());
        assertEquals(Empty.newBuilder().build(), responseObserver.getValues().get(0));
    }

    @Test
    @Order(11)
    public void eleventhTestCase() throws ExecutionException, InterruptedException {
        StreamRecorder<Balance> responseObserver = StreamRecorder.create();

        service.checkBalance(User.newBuilder().setUserId("1").build(), responseObserver);

        assertNull(responseObserver.getError());
        assertEquals("USD", responseObserver.firstValue().get().getMoney(0).getCurrency());
        assertEquals(0d, responseObserver.firstValue().get().getMoney(0).getAmount());
        assertEquals("EUR", responseObserver.firstValue().get().getMoney(1).getCurrency());
        assertEquals(100d, responseObserver.firstValue().get().getMoney(1).getAmount());
    }

    @Test
    @Order(12)
    public void twelfthTestCase() {
        StreamRecorder<Empty> responseObserver = StreamRecorder.create();

        service.withdraw(WalletRequest.newBuilder()
                .setUser(User.newBuilder()
                        .setUserId("1")
                        .build())
                .setMoney(Money.newBuilder()
                        .setAmount(200d)
                        .setCurrency("USD")
                        .build())
                .build(), responseObserver);

        assertEquals("INVALID_ARGUMENT: Insufficient Fund", responseObserver.getError().getMessage());
    }

}
