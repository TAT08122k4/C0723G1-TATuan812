package com.example.danh_sach_khach_hang.service;

import com.example.danh_sach_khach_hang.model.Customer;
import com.example.danh_sach_khach_hang.repository.CustomerRepository;
import com.example.danh_sach_khach_hang.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService{
//    @Autowired
    private final ICustomerRepository iCustomerRepository = new CustomerRepository();
    @Override
    public List<Customer> getAll() {
        return iCustomerRepository.getAll();
    }

    @Override
    public void FindById() {

    }
}
