package case_study.khu_nghi_duong_furama.service;

import case_study.khu_nghi_duong_furama.model.person.Employee;

import java.util.List;

public interface IEmployeeService extends IFuramaService<Employee>{
    @Override
    List<Employee> display();

    @Override
    void add(Employee employee);

    @Override
    void edit(Employee employee);
    boolean delete(String id);
    Employee search(String id);
}
