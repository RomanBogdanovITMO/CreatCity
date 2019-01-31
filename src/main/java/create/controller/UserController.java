//package create.controller;
//
//import create.entity.Maps;
//import create.entity.User;
//import create.repositories.UserRepositories;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import java.util.List;
//
//
////@Controller
////public class UserController {
////
////    @Autowired
////    private UserRepositories userRepositories;
////
////    @RequestMapping("/")
////    public String index(){
////        return "text";
////    }
////
////    @RequestMapping(value = "/user/create",method = RequestMethod.GET)
////    public String showFrom(@ModelAttribute User user, Model model){
////        model.addAttribute("user",new User());
////        return "user_add";
////    }
////    @RequestMapping(value = "/user/create",method = RequestMethod.POST)
////    public String submitfrom(@ModelAttribute User user,Model model){
////        userRepositories.save(user);
////        List<User> users = (List<User>) userRepositories.findAll();
////        model.addAttribute("users", users);
////        return "user_list";
////    }
////
//////    @GetMapping("/")
//////    public  String index(){
//////
//////        return "text";
//////    }
//////    @GetMapping("/load")
//////    public String load(){
//////       return "index";
//////    }
////
////}
