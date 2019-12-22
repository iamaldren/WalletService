package com.aldren.client.wallet;

import com.aldren.client.wallet.services.WalletServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import javax.annotation.PostConstruct;

@EnableEurekaClient
@SpringBootApplication
public class App {

    @Autowired
    private WalletServiceClient client;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @PostConstruct
    public void execute() {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + System.getProperty("wallet.user"));
//        client.roundB("aldrenbobiles");
//        client.roundA("aldrenbobiles");
//        client.roundC("aldrenbobiles");
//        client.roundA("aldrenbobiles");
    }

}
