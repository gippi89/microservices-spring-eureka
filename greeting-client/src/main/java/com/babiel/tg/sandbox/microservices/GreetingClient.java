package com.babiel.tg.sandbox.microservices;

import com.babiel.tg.sandbox.microservices.models.MessageModel;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author t.gippert
 */
@FeignClient("spring-cloud-eureka-client")
public interface GreetingClient {

  @RequestMapping("/greeting")
  String greeting(@RequestParam("message") final MessageModel message);

}
