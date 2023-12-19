package com.example.danh_sach_khach_hang.repository;

import com.example.danh_sach_khach_hang.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepository implements ICustomerRepository
{
    private static List<Customer> customerList = new ArrayList<>();
    static {
        customerList.add(new Customer(1,"Toại","Toại@Gmail.com","Nghệ An"));
        customerList.add(new Customer(2,"Tưởng","Tuong@Gmail.com","Quảng Bình"));
        customerList.add(new Customer(3,"Quyền","Quyen@Gmail.com","Quảng Ngãi"));
        customerList.add(new Customer(4,"Kiệt","Kiet@Gmail.com","Đồng Hới"));
    }
    @Override
    public List<Customer> getAll() {
    return customerList;
    }

    @Override
    public void FindById() {

    }
}
