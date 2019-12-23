#WalletService

##Wallet Interface

This contains all the gRPC related classes generated from the proto file.

##Wallet Server

This project will be responsible for the actual transaction done by the user.

Currently it supports the following actions:
- withdraw
- deposit
- checkBalance

Tables:
- Users 
- Currencies
- Money
- Transactions

Default data:

Users:
- aldrenbobiles

Currencies:
- EUR
- SGD
- PHP
- GBP
- USD


##Wallet Client

This project will execute the methods from the Wallet server based from the given rounds.

The client has 3 rounds:
- Round A
- Round B
- Round C

It accepts 3 arguments:
- wallet.user = The user that will do transactions
- wallet.user.threads = No. of threads that will be executed per user
- wallet.user.rounds = No. of rounds that will be executed per thread

##Eureka Server

Used for Service Discovery.

##Getting Started

###Docker

The 3 services below can be run thru docker:
- MySQL
- Eureka Server
- Wallet Server

However, there seems to be an issue when running the Wallet Server in Docker. Once the client executes, it calls the server but it is not able to handle multithreading properly for some reason. Hence, a code change may be in placed.

`MySQL` and `Eureka Server` can be run via Docker, but Wallet Server I suggest to be run manually.

The docker images are already defined in the docker-compose.yml file.

####MySQL

The docker image for MySQL included in the compose file already contains all the necessary tables and default data needed.

The scripts can be found in `src\main\resources\db\migration`.

### Manual

### Eureka Server

If not running by docker, build the project by running the command below:
```shell script
gradle clean build
```

After successfully building the project, run by executing the command below:
```shell script
java -jar build\lib\WalletEurekaServer-1.0.0.jar
```

### Wallet Server

If using your own MySQL server, then the `application-local.yml` properties must be updated with the correct values.

Same goes for Eureka Server, if you are using your own update the yml file.

Execute the command below to build the project:
```shell script
gradle clean build
```

Run the command below to start the wallet server:
```shell script
java -jar build\lib\WalletSerer-1.0.0.jar --spring.profiles.active=local
```

### Wallet Client

If using your own Eureka Server, the `application.yml` must be updated.

Build the application by running the command below:
```shell script
gradle clean build
```

Run the application, via command below:
```shell script
java -jar -Dwallet.user=aldrenbobiles -Dwallet.user.threads=5 -Dwallet.user.rounds=6 build\lib\WalletClient-1.0.0.jar
```

## Transactions

For all transaction methods, when the user used doesn't exists in the database, the program will return a `Unknown user` error.

### Withdraw

1. When a user withdraws money with a Currency not existing in the currencies table, the program will return `Unknown Currency` error.
2. When a user withdraws money with a Currency he doesn't have an existing record with, the program will return a `User doesn't have %currency account` error.
3. When a user withdraws money with amount greater than the currently deposited amount for the given currency, the program will return a `Insufficient funds`.

### Deposit

1. When a user deposits money with a Currency not existing in the currencies table, the program will return `Unknown Currency` error.

### Check Balance

This will return all the balances per currency of the user.
