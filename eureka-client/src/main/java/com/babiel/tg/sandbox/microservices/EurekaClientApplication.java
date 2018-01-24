package com.babiel.tg.sandbox.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

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
  public String geeting(@RequestParam("locale") final Locale locale) {
    if (Locale.GERMAN.equals(locale)) {
      return "Deutsches Hallo vom EurekaClient";
    } else if (Locale.FRANCE.equals(locale)) {
      return "French hello from EurekaClient";
    } else {
      return "Default hello from EurekaClient";
    }
  }

}
