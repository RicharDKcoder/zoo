#!/bin/zsh
mvn clean package spring-boot:repackage
java -jar zoo-server-eureka/target/zoo-server-eureka-1.0-SNAPSHOT.jar
java -jar zoo-server-config/target/zoo-server-config-1.0-SNAPSHOT.jar
java -jar zoo-server-zuul/target/zoo-server-zuul-1.0-SNAPSHOT.jar

