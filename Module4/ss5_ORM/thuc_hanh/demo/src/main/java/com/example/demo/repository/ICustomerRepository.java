package com.example.demo.repository;

import com.example.demo.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();
    void add(Customer customer);
    Customer findById(int id);
}
