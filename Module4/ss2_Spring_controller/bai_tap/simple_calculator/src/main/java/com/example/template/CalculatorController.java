package com.example.template;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class CalculatorController {
    @GetMapping(value = "")
    public String showCalculator(){
        return "index";
    }
    @PostMapping(value = "calculator")
    public String calculator(@RequestParam(required = true,defaultValue = "0") int firstNumber , @RequestParam(required = true,defaultValue = "0") int secondNumber , @RequestParam String cal, Model model){
        float result = 0;
    switch (cal){
        case "+":
            result = firstNumber + secondNumber;
            break;
        case "-":
            result = firstNumber - secondNumber;
            break;
        case "/":
            if (secondNumber == 0){
                result = 0;
                break;
            }
            result = firstNumber / secondNumber;
            break;
        case "*":
            result = firstNumber * secondNumber;
            break;
    }
    model.addAttribute("result",result);
        return "index";
    }
}
