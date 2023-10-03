package case_study.khu_nghi_duong_furama.repository.impl;

import case_study.khu_nghi_duong_furama.model.person.Employee;
import case_study.khu_nghi_duong_furama.repository.IEmployeeRepo;
import case_study.khu_nghi_duong_furama.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepoImpl implements IEmployeeRepo {
    private static final  String COMMA = ",";
    private static final String SOURCEFILE = "E:\\CodeGym FullTime\\Module2\\module_2\\src\\data\\employee.csv";
    private static final String EMPLOYEE_DATA_PATH = "E:\\CodeGym FullTime\\Module2\\module_2\\src\\data\\employee.csv";
    @Override
    public void edit(Employee employee1) {
        List<Employee> employeeList = display();
        for (Employee employee : employeeList){
            if (employee.getId().equals(employee1.getId())){
                employee.setName(employee1.getName());
                employee.setdOB(employee1.getdOB());
                employee.setGender(employee1.getGender());
                employee.setIdentityCardNumber(employee1.getIdentityCardNumber());
                employee.setPhoneNumbers(employee1.getPhoneNumbers());
                employee.setEmail(employee1.getEmail());
                employee.setAcademicLevel(employee1.getAcademicLevel());
                employee.setPosition(employee1.getPosition());
                employee.setSalary(employee1.getSalary());
            }
        }
        ReadAndWrite.writeFile(SOURCEFILE , convertToString(employeeList));
    }
    public boolean checkId(String id){
        List<Employee> employeeList = new ArrayList<>();
        for (Employee employee : employeeList){
            if (id.equals(employee.getId())){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(String id) {
        List<Employee> employeeList = display();
        for (Employee employee1 : employeeList ){
            if (employee1.getId().equals(id)){
                employeeList.remove(employee1);
                ReadAndWrite.writeFile(SOURCEFILE,convertToString(employeeList));
                return true;
            }
        }
        return false;
    }

    @Override
    public Employee search(String id) {
        List<Employee> employeeList = display();
        for (Employee employee1 : employeeList){
            if (employee1.getId().equals(id)){
                return employee1;
            }
        }
        return null;
    }

    @Override
    public void add(Employee employee) {
        List<Employee>employeeList = display();
        employeeList.add(employee);
        ReadAndWrite.writeFile(SOURCEFILE,convertToString(employeeList));
    }
    public void writeEmployeeToFile(List<Employee> employeeList){
        List<String> data = convertToString(employeeList);
        ReadAndWrite.writeFile(SOURCEFILE,data);
    }
    public List<Employee> readEmployeeFromFile(){
        List<String> data = ReadAndWrite.readFile(SOURCEFILE);
        return convertToObject(data);
    }
    public List<Employee> convertToObject(List<String> str){
        List<Employee> employeeList = new ArrayList<>();
        String [] data = null;
        for(String strings : str){
            data = strings.split(",");
            employeeList.add(new Employee(data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9]));
        }
        return employeeList;
    }
    public List<String> convertToString(List<Employee> employee){
        List<String> data = new ArrayList<>();
        for (Employee employee1 : employee){
            data.add(employee1.getId() + COMMA + employee1.getName() + COMMA + employee1.getdOB() +
                    COMMA + employee1.getGender() +
                    COMMA + employee1.getIdentityCardNumber() +
                    COMMA + employee1.getPhoneNumbers() +
                    COMMA + employee1.getEmail() +
                    COMMA + employee1.getAcademicLevel() +
                    COMMA + employee1.getPosition() +
                    COMMA + employee1.getSalary()) ;
        }
        return data;
    }

    @Override
    public List<Employee> display() {
        return convertToObject(ReadAndWrite.readFile(EMPLOYEE_DATA_PATH));
    }
}
