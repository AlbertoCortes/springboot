package com.cortex.discovery_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//mvn spring-boot:run to run the app
@SpringBootApplication
public class DiscoveryServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(DiscoveryServiceApplication.class, args);
  }

}
