FROM openjdk:11-jdk

VOLUME /tmp

EXPOSE 6565

RUN mkdir /app

ADD /build/libs/WalletServer-1.0.0.jar /app/WalletServer-1.0.0.jar

ENTRYPOINT ["java", "-jar", "/app/WalletServer-1.0.0.jar"]