package case_study.khu_nghi_duong_furama.service;

import case_study.khu_nghi_duong_furama.model.person.Customer;

import java.util.List;

public interface ICustomerService extends IFuramaService<Customer>{
    @Override
    List<Customer> display();

    @Override
    void add(Customer customer);

    @Override
    void edit(Customer customer);
    void delete(String id);
    Customer search(String id);
}
