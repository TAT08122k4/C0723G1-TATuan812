package case_study.khu_nghi_duong_furama.controller;

import case_study.khu_nghi_duong_furama.model.person.Employee;
import case_study.khu_nghi_duong_furama.service.IEmployeeService;
import case_study.khu_nghi_duong_furama.service.Impl.EmployeeServiceImpl;

import java.util.List;

public class EmployeeController {
    private final IEmployeeService employeeService = new EmployeeServiceImpl();
    public void edit(Employee employee){
        employeeService.edit(employee);
    }
    public boolean delete(String id){
        return employeeService.delete(id);
    }
    public Employee search(String id){
      return employeeService.search(id);
    }
    public void add(Employee employee){
        employeeService.add(employee);
    }
    public List<Employee> display(){
        return employeeService.display();
    }
}
