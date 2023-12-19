package com.example.danh_sach_khach_hang.repository;

import com.example.danh_sach_khach_hang.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> getAll();
    void FindById();
}
