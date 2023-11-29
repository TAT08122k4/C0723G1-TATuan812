package com.example.sava_username.controller;


import com.example.sava_username.model.User;
import org.springframework.boot.web.server.Cookie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("user")
public class LoginController {
    @ModelAttribute("user")
    public User setUpUserForm(){
        return new User();
    }
//    @RequestMapping("/login")
//    public String Index(@CookieValue(value = "setUser",defaultValue = "")String setUser, Model model){
//        Cookie cookie = new Cookie("setUser",setUser);
//        model.addAttribute("cookieValue",cookie);
//        return "/login";
//    }
}
