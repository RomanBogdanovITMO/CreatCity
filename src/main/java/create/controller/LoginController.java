package create.controller;

import create.entity.Map;
import create.entity.Player;
import create.repositories.MapRepository;
import create.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class LoginController {
    @Autowired
    private PlayerService playerService;


    @RequestMapping(value={"/", "/name"}, method = RequestMethod.GET)
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("name");
        return modelAndView;
    }

    @RequestMapping(value="/registration", method = RequestMethod.GET)
    public ModelAndView registration(){
        ModelAndView modelAndView = new ModelAndView();
        Player player = new Player();
        modelAndView.addObject("player",player );
        modelAndView.setViewName("registration");
        return modelAndView;
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public ModelAndView createNewUser(@Valid Player player, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        Player playerExists = playerService.findPlayerByEmail(player.getEmail());
        if (playerExists != null) {
            bindingResult
                    .rejectValue("email", "error.player",
                            "There is already a player registered with the email provided");
        }
        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("registration");
        } else {
            playerService.savePlayer(player);
            modelAndView.addObject("successMessage", "Player has been registered successfully");
            modelAndView.addObject("player", new Player());
            modelAndView.setViewName("registration");

        }
        return modelAndView;
    }

    @RequestMapping(value="/user/home", method = RequestMethod.GET)
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        Player player = playerService.findPlayerByEmail(auth.getName());
        modelAndView.addObject("playerName", "Welcome " + player.getName() + " " +  " (" + player.getEmail() + ")");
        modelAndView.addObject("adminMessage","Content Available Only for Users with Admin Role");
        modelAndView.setViewName("user/home");
        return modelAndView;
    }
}
