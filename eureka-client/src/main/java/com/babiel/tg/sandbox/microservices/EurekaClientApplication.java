package com.babiel.tg.sandbox.microservices;

import com.babiel.tg.sandbox.microservices.models.MessageModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author t.gippert
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClientApplication {

  public static void main(String[] args) {
    SpringApplication.run(EurekaClientApplication.class, args);
  }

  @RequestMapping("/greeting")
  public String geeting(@RequestParam("message") final MessageModel message) {
    return message.getMessage();
  }

}
