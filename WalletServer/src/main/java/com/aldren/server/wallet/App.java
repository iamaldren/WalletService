package com.aldren.server.wallet;

import com.aldren.server.wallet.services.grpc.WalletService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.io.IOException;

@SpringBootApplication
public class App 
{
    @Autowired
    private WalletService walletService;

    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }

    @PostConstruct
    public void init() throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8081).addService(walletService).build();

        server.start();
        server.awaitTermination();
    }
}
