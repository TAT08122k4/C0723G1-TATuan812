package com.example.product_manager_p2.controller;

import com.example.product_manager_p2.model.Product;
import com.example.product_manager_p2.service.ICategoryService;
import com.example.product_manager_p2.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("product")
public class ProductController {
    @Autowired
    IProductService iProductService;
    @Autowired
    ICategoryService iCategoryService;

    @GetMapping("")
    public String displayAll(Model model){
          model.addAttribute("products",iProductService.displayAll());
        return "product/home";
    }
    @GetMapping("/add")
    public String showFormAddNew(Model model){
        Product product = new Product();
    model.addAttribute("product",product);
    model.addAttribute("categories",iCategoryService.displayAll());
    return "product/add";
    }
    @PostMapping("/add")
    public String addNewProduct( Product product,RedirectAttributes redirectAttributes){
        System.out.println(product);
    iProductService.saveProduct(product);
    redirectAttributes.addFlashAttribute("addSuc","addSuccess");
        return "redirect:/product";
    }
    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id , RedirectAttributes redirectAttributes){
        iCategoryService.deleteCategory(id);
        redirectAttributes.addFlashAttribute("deleteSuc","deleteSuccess");
        return "redirect:/product";
    }
    @GetMapping("/edit/{id}")
    public String showFormEdit(@PathVariable int id,Model model){

    return "";
    }
}
