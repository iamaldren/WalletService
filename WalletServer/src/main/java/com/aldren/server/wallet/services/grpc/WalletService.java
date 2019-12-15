package com.aldren.server.wallet.services.grpc;

import com.aldren.server.wallet.grpc.*;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

@Service
public class WalletService extends WalletServiceGrpc.WalletServiceImplBase {

    @Override
    public void deposit(UserRequest request, StreamObserver<UserResponse> responseObserver) {
        com.aldren.server.wallet.grpc.User user = request.getUser();
        com.aldren.server.wallet.grpc.Money money = request.getMoney();

        System.out.println("User::" + user.getUserId());
        System.out.println("Amount::" + money.getAmount());
        System.out.println("Currency::" + money.getCurrency());

        UserResponse response = UserResponse.newBuilder().build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
