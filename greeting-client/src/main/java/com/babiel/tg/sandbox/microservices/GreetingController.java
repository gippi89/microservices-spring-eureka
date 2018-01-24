package com.babiel.tg.sandbox.microservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

/**
 * @author t.gippert
 */
@Controller
public class GreetingController {

  @Autowired
  private GreetingClient greetingClient;

  @RequestMapping("/get-greeting-german")
  public String germanGreeting(Model model) {
    model.addAttribute("greeting", greetingClient.greeting(Locale.GERMAN));
    return "greeting-view";
  }

  @RequestMapping("/get-greeting-french")
  public String frenchGreeting(Model model) {
    model.addAttribute("greeting", greetingClient.greeting(Locale.FRANCE));
    return "greeting-view";
  }

  @RequestMapping("/get-greeting-english")
  public String englishGreeting(Model model) {
    model.addAttribute("greeting", greetingClient.greeting(Locale.ENGLISH));
    return "greeting-view";
  }

}
