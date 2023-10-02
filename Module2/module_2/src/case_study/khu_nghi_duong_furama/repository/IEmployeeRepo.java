package case_study.khu_nghi_duong_furama.repository;

import case_study.khu_nghi_duong_furama.model.person.Employee;

public interface IEmployeeRepo extends IFuramaRepo<Employee>{
    void edit(Employee employee);
    boolean delete(String id);
    Employee search(String id);

}
