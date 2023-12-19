package com.example.danh_sach_khach_hang.controller;


import com.example.danh_sach_khach_hang.model.Customer;
import com.example.danh_sach_khach_hang.service.CustomerService;
import com.example.danh_sach_khach_hang.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CustomerController {
    private final ICustomerService iCustomerService = new CustomerService();
    @GetMapping("/customers")
    public String getAll(Model model){
        List<Customer> customerList = iCustomerService.getAll();
        model.addAttribute("customers",customerList);
        return "list";
    }
}
