package case_study.khu_nghi_duong_furama.repository.impl;

import case_study.khu_nghi_duong_furama.model.person.Employee;
import case_study.khu_nghi_duong_furama.repository.IEmployeeRepo;
import case_study.khu_nghi_duong_furama.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepoImpl implements IEmployeeRepo {
    private static final String EMPLOYEE_DATA_PATH = "E:\\CodeGym FullTime\\Module2\\module_2\\src\\data\\employee.txt";
    @Override
    public void edit(Employee employee) {

    }

    @Override
    public void delete(Employee employee) {

    }

    @Override
    public void search(Employee employee) {

    }

    @Override
    public void add(Employee employee) {


    }
    public List<Employee> convertToObject(List<String> str){
        List<Employee> employeeList = new ArrayList<>();
        String [] data = null;
        for(String strings : str){
            data = strings.split(",");
            employeeList.add(new Employee(data[0],data[1],data[2],data[3],Integer.parseInt(data[4]),Integer.parseInt(data[5]),data[6],data[7],data[8],Float.parseFloat(data[9])));
        }
        return employeeList;
    }

    @Override
    public List<String> display() {
        return ReadAndWrite.readFile(EMPLOYEE_DATA_PATH);
    }
}
