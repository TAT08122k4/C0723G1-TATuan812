package com.example.template2.controller;

import com.example.template2.model.Product;
import com.example.template2.service.IProductService;
import com.example.template2.service.Impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("")
    public String showList(Model model){
        List<Product> productList = productService.getAll();
        model.addAttribute("products",productList);
        return "/list";
    }
    @GetMapping("/create")
    public String create (Model model){
        model.addAttribute("product",new Product());
        return "/create";
    }
    @PostMapping("/create")
    public String create(Product product){
        product.setId((int) (Math.random() * 100000000));
        productService.save(product);
        return "redirect:/product";
    }
    @GetMapping("/edit/{id}")
    public String update(@PathVariable int id , Model model){
        model.addAttribute("product",productService.findById(id));
        return "/update";
    }
    @PostMapping("/update")
    public String update(Product product){
        productService.update(product.getId(),product);
        return "redirect:/product";

    }
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable int id,Model model){
        model.addAttribute("product",productService.findById(id));
        return "/detail";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        productService.remove(id);
        return "redirect:/product";
    }
    @GetMapping("/search")
    public String search(@RequestParam(name = "searchName") String searchName , Model model){
       List<Product> products = productService.searchByName(searchName);
        model.addAttribute("products",products);
        return "/list";
}

}
