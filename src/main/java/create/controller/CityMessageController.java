package create.controller;

import hello.CityMessage;
import hello.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class CityMessageController {
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public CityMessage cityMessage(HelloMessage message) throws Exception {
        return new CityMessage("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }

}
