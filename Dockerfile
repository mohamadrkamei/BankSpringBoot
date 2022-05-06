#define base docker image
FROM openjdk:11
LABEL maintainer ="mohamadrk"
ADD target/BankSpringBoot-0.0.1-SNAPSHOT.jar BankSpringBoot.jar
ENTRYPOINT ["java" ,"-jar","BankSpringBoot.jar"]