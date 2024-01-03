package com.example.product_manager_p2.controller;

import com.example.product_manager_p2.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("category")
public class CategoryController {
    @Autowired
    ICategoryService iCategoryService;
    @GetMapping("")
    public String displayAll(){

        return "category";
    }
}
