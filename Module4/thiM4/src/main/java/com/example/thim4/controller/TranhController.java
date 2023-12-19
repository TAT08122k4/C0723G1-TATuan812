package com.example.demo.controller;

import com.example.demo.model.Tranh;
import com.example.demo.service.ITranhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("tranh")
public class TranhController {
    @Autowired
    ITranhService iTranhService;

    @GetMapping("")
    public String hienThi(Model model){
        List<Tranh> tranhList = iTranhService.hienThiTacPham();
        model.addAttribute("tranhs",tranhList);
        return "home";
    }

}
