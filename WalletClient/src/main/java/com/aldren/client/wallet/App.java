package com.aldren.client.wallet;

import com.aldren.client.wallet.dispatcher.RoundDispatcher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.concurrent.TimeUnit;

@Slf4j
@EnableEurekaClient
@SpringBootApplication
public class App {

    @Autowired
    private RoundDispatcher dispatcher;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @PostConstruct
    public void execute() throws InterruptedException {
        String user = System.getProperty("wallet.user");
        int threadNum = Integer.valueOf(System.getProperty("wallet.user.threads"));
        int roundNum = Integer.valueOf(System.getProperty("wallet.user.rounds"));

        for(int i = 0; i < threadNum; i++) {
            dispatcher.executeRounds(user, roundNum);
        }
    }

}
