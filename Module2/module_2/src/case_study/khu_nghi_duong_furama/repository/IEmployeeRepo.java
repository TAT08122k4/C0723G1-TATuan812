package case_study.khu_nghi_duong_furama.repository;

import case_study.khu_nghi_duong_furama.model.person.Employee;

public interface IEmployeeRepo extends IFuramaRepo<Employee>{
    void edit(Employee employee);
    void delete(Employee employee);
    void search(Employee employee);
}
