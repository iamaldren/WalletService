FROM java:9

VOLUME /tmp

EXPOSE 8761

RUN mkdir /app

ADD /build/libs/WalletEurekaServer-1.0.0.jar /app/WalletEurekaServer-1.0.0.jar

COPY . /home/WalletEurekaServer

RUN curl -L https://services.gradle.org/distributions/gradle-5.6.3-bin.zip -o gradle-5.6.3-bin.zip
RUN apt-get install -y unzip
RUN unzip gradle-5.6.3-bin.zip -d /app

ENV GRADLE_HOME=/app/gradle-5.6.3
ENV PATH=$PATH:$GRADLE_HOME/bin

ENTRYPOINT ["java", "-jar", "/app/WalletEurekaServer-1.0.0.jar"]