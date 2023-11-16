package com.example.template;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping("/tuan")
public class CalculatorController {
    @GetMapping(value = "/show")
    public String showCalculator(){
        return "index";
    }
    @PostMapping(value = "calculator")
    public String calculator(@RequestParam(required = true,defaultValue = "0") int firstNumber , @RequestParam(required = true,defaultValue = "0") int secondNumber , @RequestParam String cal, Model model){
        String result = "";
    switch (cal){
        case "+":
            result = String.valueOf(firstNumber + secondNumber);
            break;
        case "-":
            result = String.valueOf(firstNumber - secondNumber);
            break;
        case "/":
            if (secondNumber == 0){
                result = "Can not divide with 0";
                break;
            }
            result = String.valueOf(firstNumber / secondNumber);
            break;
        case "*":
            result = String.valueOf(firstNumber * secondNumber);
            break;
    }
    model.addAttribute("result",result);
        return "index";
    }
}
