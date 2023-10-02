package case_study.khu_nghi_duong_furama.service.Impl;

import case_study.khu_nghi_duong_furama.model.person.Employee;
import case_study.khu_nghi_duong_furama.repository.impl.EmployeeRepoImpl;
import case_study.khu_nghi_duong_furama.service.IEmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {
    EmployeeRepoImpl employeeRepo = new EmployeeRepoImpl();
    @Override
    public List<Employee> display() {
        return employeeRepo.display();
    }

    @Override
    public void add(Employee employee) {
        employeeRepo.add(employee);
    }

    @Override
    public void edit(Employee employee) {
        employeeRepo.edit(employee);
    }

    @Override
    public boolean delete(String id) {
        return employeeRepo.delete(id);
    }

    @Override
    public Employee search(String id) {
      return employeeRepo.search(id);
    }
}
