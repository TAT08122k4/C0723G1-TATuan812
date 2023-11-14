package com.example.controller.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CalculatorController {
    @GetMapping(value = "/calculator")
    public String showForm(){
        return "/calculator";
    }
@PostMapping(value = "/calculator")
    public String calculatorTheResult(Model model , @RequestParam int firstNumber,int convert){
   float result = 0;
    if (convert == 1){
         result = firstNumber / 23000;
    }else if (convert == 2){
        result = firstNumber * 23000;
    }else if (convert == 3){
        result = firstNumber * 200;
    } else {
        result = firstNumber / 200;
    }
 model.addAttribute("result",result);
    return "/calculator";
}
}
