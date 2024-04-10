package com.example.product.controller;


import com.example.product.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    ICategoryService categoryService;
    @GetMapping("")
    public String displayAllCategory(Model model){
     model.addAttribute("categories",categoryService.displayAll());
     return "managerCategory";
    }



}
