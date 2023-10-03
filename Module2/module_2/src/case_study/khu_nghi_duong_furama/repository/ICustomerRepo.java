package case_study.khu_nghi_duong_furama.repository;

import case_study.khu_nghi_duong_furama.model.person.Customer;

import java.util.List;

public interface ICustomerRepo extends IFuramaRepo<Customer>{
    void editCustomer (Customer customer);
    List<Customer> searchCustomer (String name);
    boolean delete(String id);
}
