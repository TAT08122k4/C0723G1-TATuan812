package com.example.template;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class EmailController {
 private static final String EMAIL_REGEX =  "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
 private static Pattern pattern;

 public EmailController(){
     pattern = Pattern.compile(EMAIL_REGEX);
 }
 @GetMapping(value = "/")
    public String email(){
     return "index";
 }
    private boolean validate(String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
 @PostMapping(value = "/validate")
    public String user(@RequestParam(value = "email" , required = true , defaultValue = "tatuan08122k4@gmail.com")String email, ModelMap modelMap){
     boolean isValid = this.validate(email);
     if (!isValid){
         modelMap.addAttribute("mess","Email is invalid");
         return "index";
     }
     modelMap.addAttribute("email",email);
     return "success";
 }


}
