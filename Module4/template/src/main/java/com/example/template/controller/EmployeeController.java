package com.example.template.controller;

import com.example.template.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @GetMapping(value = "/showForm")
    public String showForm(Model model){
        model.addAttribute("employee",new Employee());
        return "/create";
        }

        @PostMapping(value = "/addEmployee")
    public String submit(@ModelAttribute Employee employee , Model model){
        model.addAttribute("employee" , employee);
        return "/info";
        }



}
