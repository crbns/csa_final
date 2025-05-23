package com.example.messaging_stomp_websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {


  @MessageMapping("/hello")
  @SendTo("/topic/greetings")
  public MessageContent greeting(HelloMessage message) throws Exception {
    // Thread.sleep(1000); // simulated delay
    return new MessageContent("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!" + "You are " + HtmlUtils.htmlEscape(message.getAge()) + " years old.");
  }

}