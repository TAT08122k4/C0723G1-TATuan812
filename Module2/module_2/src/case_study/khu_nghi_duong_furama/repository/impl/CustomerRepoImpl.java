package case_study.khu_nghi_duong_furama.repository.impl;

import case_study.khu_nghi_duong_furama.model.person.Customer;
import case_study.khu_nghi_duong_furama.repository.ICustomerRepo;
import case_study.khu_nghi_duong_furama.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CustomerRepoImpl implements ICustomerRepo {
    private static final String COMMS = ",";
    private static final String SOURCE_FILE_CUSTOMER = "E:\\CodeGym FullTime\\Module2\\module_2\\src\\data\\customer.csv";
    @Override
    public void editCustomer(Customer customer){
        List<Customer> customerList = display();
        for (Customer cus : customerList){
            if (cus.getId().equals(customer.getId())){
                cus.setName(customer.getName());
                cus.setdOB(customer.getdOB());
                cus.setGender(customer.getGender());
                cus.setIdentityCardNumber(customer.getIdentityCardNumber());
                cus.setPhoneNumbers(customer.getPhoneNumbers());
                cus.setEmail(customer.getEmail());
                cus.setTypeOfCustomer(customer.getTypeOfCustomer());
                cus.setAddress(customer.getAddress());
            }
        }
    }

    @Override
    public List<Customer> searchCustomer(String name) {
        List<Customer> customers = display();
        List<Customer> strings = new ArrayList<>();
        boolean flag = false;
        for (Customer cus: customers) {
            if (cus.getName().contains(name)){
                strings.add(cus);
                flag = true;
            }
        }
      return strings;
    }

    @Override
    public boolean delete(String id) {
        List<Customer> customers = display();
        for (Customer cus:customers) {
            if (cus.getId().equals(id)){
                customers.remove(cus);
                ReadAndWrite.writeFile(SOURCE_FILE_CUSTOMER,convertToString(customers));
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(Customer customer) {
    List<Customer> customerList = display();
    customerList.add(customer);
    ReadAndWrite.writeFile(SOURCE_FILE_CUSTOMER,convertToString(customerList));
    }
    public List<String> convertToString(List<Customer> customer){
        List<String> data = new ArrayList<>();
        for (Customer customer1 : customer){
            data.add(customer1.getId() + COMMS
            +customer1.getName() + COMMS + customer1.getdOB() + COMMS
            +customer1.getGender() + COMMS + customer1.getIdentityCardNumber() + COMMS
            + customer1.getPhoneNumbers() + COMMS + customer1.getEmail() + COMMS
            +customer1.getTypeOfCustomer() + COMMS + customer1.getAddress());
        }
        return data;
    }
    public List<Customer> convertToObject(List<String> str){
        List<Customer> customerList = new ArrayList<>();
        String [] data = null;
        for(String strings : str){
            data = strings.split(COMMS);
            customerList.add(new Customer(data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8]));
        }
        return customerList;
    }


    @Override
    public List<Customer> display() {
        return convertToObject(ReadAndWrite.readFile(SOURCE_FILE_CUSTOMER));
    }

    @Override
    public boolean checkId(String id) {
        return false;
    }
}
