package case_study.khu_nghi_duong_furama.service;

import case_study.khu_nghi_duong_furama.model.person.Customer;

import java.util.List;

public interface ICustomerService extends IFuramaService<Customer>{
    @Override
    List<Customer> hienThi();

    @Override
    void them(Customer customer);

    @Override
    void sua(Customer customer);
    void delete(Customer customer);
    void search(Customer customer);
}
