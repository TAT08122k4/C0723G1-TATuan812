package case_study.khu_nghi_duong_furama.view;

import case_study.khu_nghi_duong_furama.controller.CustomerController;
import case_study.khu_nghi_duong_furama.controller.EmployeeController;
import case_study.khu_nghi_duong_furama.model.person.Customer;
import case_study.khu_nghi_duong_furama.model.person.Employee;
import case_study.khu_nghi_duong_furama.repository.impl.EmployeeRepoImpl;
import case_study.khu_nghi_duong_furama.utils.Regex;

import java.util.List;
import java.util.Scanner;

public class FuramaView {
    Scanner sc = new Scanner(System.in);
    EmployeeController employeeController = new EmployeeController();
    EmployeeRepoImpl employeeRepo = new EmployeeRepoImpl();
    CustomerController customerController = new CustomerController();

    public void runProgramming() {
        int choose;
        do {
            try {
                do {
                    MainMenu();
                    System.out.println("Enter Management u wanna choose");
                    choose = Integer.parseInt(sc.nextLine());
                    switch (choose) {
                        case 1:
                            menuEmployee();
                            break;
                        case 2:
                            menuCustomer();
                            break;
                        case 3:
                            menuFacitity();
                            break;
                        case 4:
                            menuBooking();
                            break;
                        case 5:
                            menuPromotion();
                            break;
                        case 6:
                            System.exit(1);
                            break;
                        default:
                            System.out.println("Vui Lòng Chọn Chức Năng từ 1 -> 6");
                            break;
                    }
                } while (true);
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng chọn đúng chức năng như ở menu");
            }
        } while (true);
    }

    public void MainMenu() {
        System.out.println("==Menu==");
        System.out.println("1.Employee Management");
        System.out.println("2.Customer Management");
        System.out.println("3.Facility Management");
        System.out.println("4.Booking Management");
        System.out.println("5.Promotion Management");
        System.out.println("6.Exit");
    }

    // cái này và view của nhân viên
    public void menuEmployee() {
        int choose;
        do {
            try {
                System.out.println("==Menu Employee==");
                System.out.println("1. Display List Employee");
                System.out.println("2. Add Employee");
                System.out.println("3. Edit Employee");
                System.out.println("4. Delete Employee");
                System.out.println("5. Search Name Employee");
                System.out.println("6. Return Main Manu");
                System.out.println("Enter 1 -> 6");
                choose = Integer.parseInt(sc.nextLine());
                String findId = null;
                String deleteId = null;
                switch (choose) {
                    case 1:
                        System.out.println(employeeController.display());
                        break;
                    case 2:
                        employeeController.add(addEmployee());
                        break;
                    case 3:
                        employeeController.edit(editEmployee(inputIdEdit()));
                        break;
                    case 4:
                        System.out.println("Enter id u wanna delete");
                        deleteId = sc.nextLine();
                        employeeController.delete(deleteId);
                        break;
                    case 5:
                        System.out.println("Enter Id u wanna find out");
                        findId = sc.nextLine();
                        employeeController.search(findId);
                        break;
                    case 6:
                        return;
                    default:
                        System.out.println("Enter 1->6");
                }
            } catch (NumberFormatException e) {
                System.err.println("Please Enter the numbers");
            }
        } while (true);
    }

    public Employee editEmployee(String id) {
        int choosenEdit = 0;
        String name = null;
        String dob = null;
        String gender = null;
        String indentityCardNumbers = null;
        String phoneNumbers = null;
        String email = null;
        String academiclevel = null;
        String position = null;
        String salary = null;
        Employee employee = null;
        do {
            System.out.println("Enter wat is the information u wanna edit:");
            System.out.println("1.Name");
            System.out.println("2.Dob");
            System.out.println("3.Gender");
            System.out.println("4.IndentityCardNumbers");
            System.out.println("5.Phone Numbers");
            System.out.println("6.Email");
            System.out.println("7.AcademicLevel");
            System.out.println("8.Position");
            System.out.println("9.Salary");
            System.out.println("10.Exit");
            System.out.println("Enter wat infor u wanna change:");
            choosenEdit = Integer.parseInt(sc.nextLine());
            switch (choosenEdit) {
                case 1:
                    name = inputName();
                    break;
                case 2:
                    dob = inputDOB();
                    break;
                case 3:
                    gender = inputGender();
                    break;
                case 4:
                    indentityCardNumbers = inputIndentityCard();
                    break;
                case 5:
                    phoneNumbers = inputPhone();
                    break;
                case 6:
                    email = inputEmail();
                    break;
                case 7:
                    academiclevel = inputAcademicLevel();
                    break;
                case 8:
                    position = inputPosition();
                    break;
                case 9:
                    salary = inputSalary();
                    break;
                default:
                    break;
            }
        } while (choosenEdit > 0 && choosenEdit < 10);
        return new Employee(id, name, dob, gender, indentityCardNumbers, phoneNumbers, email, academiclevel, position, salary);
    }

    public boolean checkId(String id) {
        List<Employee> employeeList = employeeController.display();
        for (Employee employee : employeeList) {
            if (employee.getId().equals(id)) {
                System.out.println("Id already exists");
                return false;
            }
        }
        return true;
    }

    public String inputIdEdit() {
        String id = null;
        do {
            System.out.println("Enter Id Of Employee");
            id = sc.nextLine();
            if (!Regex.checkRegexId(id)) {
                System.err.println("Please enter the correct format Id NV-YYYY");
            }
        } while (!Regex.checkRegexId(id) || checkId(id));
        return id;
    }

    public String inputId() {
        String id = null;
        do {
            System.out.println("Enter Id Of Employee (NV-XXXX)");
            id = sc.nextLine();
            if (!Regex.checkRegexId(id)) {
                System.err.println("Please enter the correct format Id NV-XXXX");
            }
        } while (!Regex.checkRegexId(id) || !checkId(id));
        return id;
    }

    public String inputName() {
        String name = null;
        do {
            System.out.println("Enter Name Of Employee (Trần Anh Tuấn)");
            name = sc.nextLine();
            if (!Regex.checkRegexName(name)) {
                System.err.println("Please enter the correct format Name");
            }
        } while (!Regex.checkRegexName(name));
        return name;
    }

    public String inputDOB() {
        String doB = null;
        do {
            System.out.println("Enter Dob Of Employee dd/mm/yyyy");
            doB = sc.nextLine();
            if (!Regex.checkRegexDOB(doB)) {
                System.err.println("Please enter the correct format Dob dd/mm/yyyy");
            } else {
                if (!Regex.is18YearsOld(doB)){
                    System.err.println("Your Age must large than 18");
                } else {
                    break;
                }
            }

        } while (true);
        return doB;
    }

    public String inputGender() {
        String gender = null;
        do {
            System.out.println("Enter Gender Of Employee Male/Female");
            gender = sc.nextLine();
            if (!Regex.checkRegexGender(gender)) {
                System.err.println("Please enter the correct format Gender");
            }
        } while (!Regex.checkRegexGender(gender));
        return gender;
    }

    public String inputIndentityCard() {
        String indentityCard = null;
        do {
            System.out.println("Enter indentityCard Of Employee xxxxxxxxxx");
            indentityCard = sc.nextLine();
            if (!Regex.checkRegexIndentitycardnumber(indentityCard)) {
                System.err.println("Please enter the correct format IndentityCard");
            }
        } while (!Regex.checkRegexIndentitycardnumber(indentityCard));
        return indentityCard;
    }

    public String inputPhone() {
        String phone = null;
        do {
            System.out.println("Enter Phone Of Employee 0xxxxxxxxxx");
            phone = sc.nextLine();
            if (!Regex.checkPhoneNumbers(phone)) {
                System.err.println("Please enter the correct format Phone numbers");
            }
        } while (!Regex.checkPhoneNumbers(phone));
        return phone;
    }

    public String inputEmail() {
        String email = null;
        do {
            System.out.println("Enter Email Of Employee tuan@gmail.com");
            email = sc.nextLine();
            if (!Regex.checkEmail(email)) {
                System.err.println("Please enter the correct format Email");
            }
        } while (!Regex.checkEmail(email));
        return email;
    }

    public String inputAcademicLevel() {
        String academicLevel = null;
        do {
            System.out.println("Enter academicLevel Of Employee (Intermediate Level|College|University)");
            academicLevel = sc.nextLine();
            if (!Regex.checkAcademicLevel(academicLevel)) {
                System.err.println("Please enter the correct format AcademicLevel");
            }
        } while (!Regex.checkAcademicLevel(academicLevel));
        return academicLevel;
    }

    public String inputPosition() {
        String position = null;
        do {
            System.out.println("Enter Position Of Employee (Receptionist|Serve|Expert|Supervisor|Manager|Direction)");
            position = sc.nextLine();
            if (!Regex.checkPosition(position)) {
                System.err.println("Please enter the correct format Position");
            }
        } while (!Regex.checkPosition(position));
        return position;
    }

    public String inputSalary() {
        String salary = null;
        do {
            System.out.println("Enter Salary Of Employee (The first number is non-zero 1-9xxxxxxx)");
            salary = sc.nextLine();
            if (!Regex.checkSalary(salary)) {
                System.err.println("Please enter the correct format Salary");
            }
        } while (!Regex.checkSalary(salary));
        return salary;
    }

    public Employee addEmployee() {
        return new Employee(inputId(), inputName(), inputDOB(), inputGender(), inputIndentityCard(), inputPhone(), inputEmail(), inputAcademicLevel(), inputPosition(), inputSalary());
    }


    // cái này là view của khách hàng ================================================================
    public void menuCustomer() {
        int chosse = 0;
        do {
            try {
                System.out.println("==Customer Management==");
                System.out.println("1. Display list customers");
                System.out.println("2. Add new customer");
                System.out.println("3. Edit customer");
                System.out.println("4. Delete customer");
                System.out.println("5. Search by name customer");
                System.out.println("6. Return main menu");
                System.out.println("Enter 1->6");
                chosse = Integer.parseInt(sc.nextLine());
                switch (chosse) {
                    case 1:
                        System.out.println(customerController.display());
                        break;
                    case 2:
                        customerController.add(addCustomer());
                        break;
                    case 3:
                        customerController.edit(editCustomer(inputIdCustomer()));
                        break;
                    case 4:
                        customerController.delete(inputIdCustomer());
                        break;
                    case 5:
                        System.out.println(customerController.search(inputName()));
                        break;
                    case 6:
                        return;
                }
            } catch (NumberFormatException e) {
                System.err.println("Enter Integer Numbers plzzz");
            }
        } while (true);

    }

    public Customer editCustomer(String id) {
        int choosenEdit = 0;
        String name = null;
        String doB = null;
        String gender = null;
        String indentityCardNumbers = null;
        String phone = null;
        String email = null;
        String typeOfCustomer = null;
        String address = null;
        do {
            System.out.println("Enter wat is the information u wanna edit:");
            System.out.println("1.Name");
            System.out.println("2.Dob");
            System.out.println("3.Gender");
            System.out.println("4.IndentityCardNumbers");
            System.out.println("5.Phone Numbers");
            System.out.println("6.Email");
            System.out.println("7.Type Of Customer");
            System.out.println("8.Address");
            System.out.println("9.Exit");
            System.out.println("Enter wat infor u wanna change:");
            choosenEdit = Integer.parseInt(sc.nextLine());
            switch (choosenEdit) {
                case 1:
                    name = inputName();
                    break;
                case 2:
                    doB = inputDOB();
                    break;
                case 3:
                    gender = inputGender();
                    break;
                case 4:
                    indentityCardNumbers = inputIndentityCard();
                    break;
                case 5:
                    phone = inputPhone();
                    break;
                case 6:
                   email = inputEmail();
                    break;
                case 7:
                    typeOfCustomer = inputTypeOfCustomer();
                    break;
                case 8:
                   address = inputAddress();
                    break;
                default:
                    break;
            }
        } while (choosenEdit > 0 && choosenEdit < 9);
        return new Customer(id,name,doB,gender,indentityCardNumbers,phone,email,typeOfCustomer,address);
    }

    public String inputIdCustomer() {
        String id = null;
        do {
            System.out.println("Enter Id (KH-xxxx)");
            id = sc.nextLine();
            if (!Regex.checkCustomerId(id)) {
                System.err.println("Plz enter corret format Id (KH-xxxx)");
            }
        } while (!Regex.checkCustomerId(id));
        return id;
    }

    public String inputTypeOfCustomer() {
        String typeOfCustomer = null;
        int choose = 0;
        do {
            System.out.println("1.Diamond");
            System.out.println("2.Platinum");
            System.out.println("3.Gold");
            System.out.println("4.Silver");
            System.out.println("5.Member");
            System.out.println("plzz enter 1->5");
            try {
                choose = Integer.parseInt(sc.nextLine());
                if (choose == 1) {
                    typeOfCustomer = "Diamond";
                } else if (choose == 2) {
                    typeOfCustomer = "Platinum";
                } else if (choose == 3) {
                    typeOfCustomer = "Gold";
                } else if (choose == 4) {
                    typeOfCustomer = "Silver";
                } else if (choose == 5) {
                    typeOfCustomer = "Member";
                }


            } catch (NumberFormatException e) {
                System.err.println("plzz enter Integer Number");
            }
        } while (choose < 1 || choose > 5);
        return typeOfCustomer;
    }

    public String inputAddress() {
        System.out.println("Enter Customer's Address");
        String address = null;
        return address = sc.nextLine();
    }

    public Customer addCustomer() {
        return new Customer(inputIdCustomer(), inputName(), inputDOB(), inputGender(), inputIndentityCard(), inputPhone(), inputEmail(), inputTypeOfCustomer(), inputAddress());
    }


    // ================================== Kết thúc phần Customer============================================

    public void menuFacitity() {
        System.out.println("==Quản Lý Cơ Sở==");
        System.out.println("1. Hiển Thị Danh Sách Cơ Sở");
        System.out.println("2. Thêm Mới Cơ Sở");
        System.out.println("3. Hiển Thị Cơ Sở Bảo Trì");
        System.out.println("4. Xoá Cơ Sở");
        System.out.println("6. Quay Lại Menu Chính");
    }

    public void menuBooking() {
        System.out.println("==Quản Lý Booking==");
        System.out.println("1.Thêm Mới Booking ");
        System.out.println("2.Hiển Thị Danh sách Booking");
        System.out.println("3.Tạo Mới Hợp Đồng");
        System.out.println("4.Hiển Thị danh sách hợp đồng");
        System.out.println("5.Sửa hợp đồng");
        System.out.println("6. Quay Lại Menu Chính");

    }

    public void menuPromotion() {
        System.out.println("==Quản Lý Khuyến Mãi==");
        System.out.println("Hiển Thị danh sách khách hàng sử dụng dịch vụ");
        System.out.println("Hiển Thị danh sách khách hàng nhận voucher");
        System.out.println("Quay Lại Menu Chính");
    }
}
