package com.babiel.tg.sandbox.microservices;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Locale;

/**
 * @author t.gippert
 */
@FeignClient("spring-cloud-eureka-client")
public interface GreetingClient {

  @RequestMapping("/greeting")
  String greeting(@RequestParam("locale") Locale locale);

}
