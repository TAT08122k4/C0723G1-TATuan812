package com.example.quan_ly_cau_thu.controller;

import com.example.quan_ly_cau_thu.service.IPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/player")
public class PlayerController {
    @Autowired
    private IPlayerService iPlayerService;
    @GetMapping("")
    public String home(){
        return "home";
    }
}
