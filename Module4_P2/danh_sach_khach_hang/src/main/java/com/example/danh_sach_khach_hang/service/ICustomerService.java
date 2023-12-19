package com.example.danh_sach_khach_hang.service;

import com.example.danh_sach_khach_hang.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ICustomerService {
    List<Customer> getAll();
    void FindById();
}
