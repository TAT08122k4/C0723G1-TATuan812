package com.example.product.controller;

import com.example.product.dto.ProductDto;
import com.example.product.model.Cart;
import com.example.product.model.Product;
import com.example.product.service.ICategoryService;
import com.example.product.service.IProductService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    private IProductService productService;
    @Autowired
    private ICategoryService categoryService;

    @ModelAttribute("cart")
    public Cart setupCart() {
        return new Cart();
    }

    @GetMapping("/shop")
    public ModelAndView showShop(Cart cart,
                                 @RequestParam(value = "page", defaultValue = "0") Integer page,
                                 @RequestParam(value = "size", defaultValue = "4") Integer size,
                                 @RequestParam(value = "content", required = false, defaultValue = "") String content,
                                 @RequestParam(value = "categoryId", required = false, defaultValue = "-1") Integer categoryId,
                                 @RequestParam(value = "sortBy", required = false, defaultValue = "id") String sortBy,
                                 @RequestParam(value = "sortDirection", required = false, defaultValue = "ASC") String sortDirection
    ) {
        Pageable pageable = PageRequest.of(page,size, Sort.Direction.valueOf(sortDirection),sortBy);
        Page<Product> products = productService.findAll(pageable,content,categoryId);
        ModelAndView modelAndView = new ModelAndView("/shop");
        modelAndView.addObject("products", products);
        modelAndView.addObject("content",content);
        modelAndView.addObject("categoryId",categoryId);
        modelAndView.addObject("categories",categoryService.displayAll());
        if (cart.countItemQuantity() != 0){
            modelAndView.addObject("itemsInCart",cart.countItemQuantity());
        }else {
            modelAndView.addObject("itemsInCart",0);
        }
        return modelAndView;
    }
    @GetMapping("/addNewProduct")
    public String showFormAddNewProduct(Model model){
        model.addAttribute("productDto",new ProductDto());
        model.addAttribute("categories",categoryService.displayAll());
        return "addProduct";
    }
    @PostMapping("/addNewProduct")
    public String addNewProduct(@Valid @ModelAttribute ProductDto productDto, BindingResult bindingResult, RedirectAttributes redirectAttributes , Model model){
        if (bindingResult.hasFieldErrors()){
            model.addAttribute("categories",categoryService.displayAll());
            return "addProduct";
        }else {
            Product product = new Product();
            BeanUtils.copyProperties(productDto,product);
            productService.saveProduct(product);
            redirectAttributes.addFlashAttribute("addSuccess","ok");
            return "redirect:/shop";
        }
    }
    @GetMapping("/deleteProduct")
    public String deleteProduct(@RequestParam Long idDelete,RedirectAttributes redirectAttributes){
        productService.deleteProduct(idDelete);
        return "redirect:/shop";
    }
    @GetMapping("editProduct/{id}")
    public String showFormEdit(@PathVariable long id,Model model){
        Product product = productService.findById(id);
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(product,productDto);
        model.addAttribute("productDto",productDto);
        model.addAttribute("categories",categoryService.displayAll());
        return "editProduct";
    }
    @PostMapping("editProduct")
    public String editProduct(@Valid @ModelAttribute ProductDto productDto , BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("categories",categoryService.displayAll());
            return "editProduct";
        }else {
            Product product = new Product();
            BeanUtils.copyProperties(productDto,product);
            productService.saveProduct(product);
            return "redirect:/shop";
        }
    }

    @GetMapping("/add/{id}")
    public String addToCart(@PathVariable Long id,
                            @ModelAttribute Cart cart,
                            @RequestParam("action") String action, Model model) {
        Optional<Product> productOptional = productService.findById(id);
        if (!productOptional.isPresent()) {
            return "/error_404";
        }
        if (action.equals("show")) {
            cart.addProduct(productOptional.get());
            return "redirect:/shopping-cart";
        }
        cart.addProduct(productOptional.get());
        return "redirect:/shop";
    }

    @GetMapping("/minus/{id}")
    public String deleteToCart(@PathVariable Long id,
                            @ModelAttribute Cart cart,
                            @RequestParam("action") String action) {
        Optional<Product> productOptional = productService.findById(id);
        if (!productOptional.isPresent()) {
            return "/error_404";
        }
        if (action.equals("show")) {
            cart.deleteProduct(productOptional.get());
            return "redirect:/shopping-cart";
        }
        cart.addProduct(productOptional.get());
        return "redirect:/shop";
    }
}
