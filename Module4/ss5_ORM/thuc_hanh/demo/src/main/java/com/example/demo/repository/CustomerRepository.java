package com.example.demo.repository;

import com.example.demo.model.Customer;
import com.mysql.cj.xdevapi.SessionFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.security.auth.login.Configuration;
import java.util.List;

public class CustomerRepository implements ICustomerRepository{
   @PersistenceContext
private EntityManager entityManager;

    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public void add(Customer customer) {
entityManager.persist(customer);

    }

    @Override
    public Customer findById(int id) {
        return null;
    }
}
