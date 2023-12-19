package com.example.may_tinh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
@GetMapping("")
    public String showCalculator(){
    return "/calculator";
}
@PostMapping("/conversion")
    public String conversion(Model model , @RequestParam int firstNum , int denominationOfMoney){
    String result = " ";
    switch (denominationOfMoney){
        case 1:
            result = String.valueOf(firstNum * 23000);
            result = result + "VNĐ";
            break;
        case 2:
            if (firstNum == 0){
                result = "Không Thể Chia Cho 0";
            }else {
                result = String.valueOf(firstNum / 23000);
                result = result + "$";
            }
            break;
        case 3:
            result = String.valueOf(firstNum * 200);
            result = result + "VNĐ";
            break;
        default:
            if (firstNum == 0){
                result = "Không Thể Chia Cho 0";
            }else {
                result = String.valueOf(firstNum / 200);
                result = result + "¥";
            }
            break;
    }
    model.addAttribute("result",result);
    return "/calculator";
}
}
