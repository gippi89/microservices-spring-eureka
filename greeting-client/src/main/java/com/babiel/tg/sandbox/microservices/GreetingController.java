package com.babiel.tg.sandbox.microservices;

import com.babiel.tg.sandbox.microservices.models.MessageModel;
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
    MessageModel message = getMessageForLocale(Locale.GERMAN);
    model.addAttribute("greeting", greetingClient.greeting(message));
    return "greeting-view";
  }

  @RequestMapping("/get-greeting-french")
  public String frenchGreeting(Model model) {
    MessageModel message = getMessageForLocale(Locale.FRANCE);
    model.addAttribute("greeting", greetingClient.greeting(message));
    return "greeting-view";
  }

  @RequestMapping("/get-greeting-english")
  public String englishGreeting(Model model) {
    MessageModel message = getMessageForLocale(Locale.ENGLISH);
    model.addAttribute("greeting", greetingClient.greeting(message));
    return "greeting-view";
  }

  private MessageModel getMessageForLocale(final Locale locale) {
    MessageModel model = new MessageModel();
    if (Locale.GERMAN.equals(locale)) {
      model.setMessage("Deutsche Message");
    } else if (Locale.FRANCE.equals(locale)) {
      model.setMessage("Französische Message");
    } else if (Locale.ENGLISH.equals(locale)) {
      model.setMessage("Englische Message");
    }

    return model;
  }

}
