package com.babiel.tg.sandbox.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author t.gippert
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class GreetingClientApplication {

  public static void main(String[] args) {
    SpringApplication.run(GreetingClientApplication.class, args);
  }
}
