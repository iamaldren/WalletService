FROM openjdk:11-jdk

VOLUME /tmp

EXPOSE 8761

RUN mkdir /app

ADD /build/libs/WalletEurekaServer-1.0.0.jar /app/WalletEurekaServer-1.0.0.jar

COPY . /home/WalletEurekaServer

ENTRYPOINT ["java", "-jar", "/app/WalletEurekaServer-1.0.0.jar"]