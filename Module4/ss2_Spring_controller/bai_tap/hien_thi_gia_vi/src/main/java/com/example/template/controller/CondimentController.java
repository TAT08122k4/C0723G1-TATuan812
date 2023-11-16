package com.example.template.controller;

import com.example.template.service.ICondimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CondimentController {
    @Autowired
    private ICondimentService condimentService;


    @GetMapping(value = "")
    public String showForm(@RequestParam(required = false) String[] condiment, Model model) {
        model.addAttribute("condiments", condiment);
        return "index";
    }

    @GetMapping(value = "/create")
    public String showCreateForm() {
        return "create";
    }

    @PostMapping(value = "create")
    public String createCondiment(@RequestParam(required = false) String[] condiment, Model model) {
        model.addAttribute("condiments", condiment);
        return "index";
    }

}
