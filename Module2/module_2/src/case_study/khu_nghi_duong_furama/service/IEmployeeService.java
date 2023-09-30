package case_study.khu_nghi_duong_furama.service;

import case_study.khu_nghi_duong_furama.model.person.Employee;

import java.util.List;

public interface IEmployeeService extends IFuramaService<Employee>{
    @Override
    List<Employee> hienThi();

    @Override
    void them(Employee employee);

    @Override
    void sua(Employee employee);
    void xoa(Employee employee);
    void search(Employee employee);
}
