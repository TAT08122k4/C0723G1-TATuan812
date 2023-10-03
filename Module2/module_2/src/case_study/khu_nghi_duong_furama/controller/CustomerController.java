package case_study.khu_nghi_duong_furama.controller;

import case_study.khu_nghi_duong_furama.model.person.Customer;
import case_study.khu_nghi_duong_furama.service.ICustomerService;
import case_study.khu_nghi_duong_furama.service.Impl.CustomerServiceImpl;

import java.util.List;

public class CustomerController {
    ICustomerService customerService = new CustomerServiceImpl();

    public List<Customer> display() {
        return customerService.display();
    }

    public void add(Customer customer) {
        customerService.add(customer);
    }

    public void edit(Customer customer) {
        customerService.edit(customer);
    }

    public void delete(String id) {
        customerService.delete(id);
    }

    public List<Customer> search(String name) {
        return customerService.search(name);
    }
}
