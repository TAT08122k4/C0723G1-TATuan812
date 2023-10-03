package case_study.khu_nghi_duong_furama.service.Impl;

import case_study.khu_nghi_duong_furama.model.person.Customer;
import case_study.khu_nghi_duong_furama.repository.ICustomerRepo;
import case_study.khu_nghi_duong_furama.repository.impl.CustomerRepoImpl;
import case_study.khu_nghi_duong_furama.service.ICustomerService;

import java.util.List;

public class CustomerServiceImpl implements ICustomerService {
    ICustomerRepo customerRepo = new CustomerRepoImpl();
    @Override
    public List<Customer> display() {
        return  customerRepo.display();
    }

    @Override
    public void add(Customer customer) {
        customerRepo.add(customer);
    }
    @Override
    public void edit(Customer customer) {
        customerRepo.editCustomer(customer);
    }

    @Override
    public void delete(String id) {
        customerRepo.delete(id);

    }

    @Override
    public List<Customer> search(String name) {
        return customerRepo.searchCustomer(name);
    }
}
