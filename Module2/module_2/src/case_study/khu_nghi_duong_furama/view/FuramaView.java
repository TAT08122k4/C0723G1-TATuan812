package case_study.khu_nghi_duong_furama.view;

import case_study.khu_nghi_duong_furama.controller.EmployeeController;
import case_study.khu_nghi_duong_furama.model.person.Employee;
import case_study.khu_nghi_duong_furama.repository.impl.EmployeeRepoImpl;
import case_study.khu_nghi_duong_furama.utils.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuramaView {
    Scanner sc = new Scanner(System.in);
    EmployeeController employeeController = new EmployeeController();
    EmployeeRepoImpl employeeRepo = new EmployeeRepoImpl();

    public void runProgramming() {
        int choose;
        do {
            hienThiMenuChinh();
            try {
                do {
                    System.out.println("Chọn Menu Quản Lý mà bạn muốn");
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
            } catch (Exception e) {
                System.err.println("Vui lòng chọn đúng chức năng như ở menu");
            }
        } while (true);
    }

    public void hienThiMenuChinh() {
        System.out.println("==Menu==");
        System.out.println("1.Quản Lý Nhân Viên");
        System.out.println("2.Quản Lý Khách Hàng");
        System.out.println("3.Quản Lý Cơ Sở");
        System.out.println("4.Quản Lý Booking");
        System.out.println("5.Quản lý Khuyến Mãi");
        System.out.println("6.Thoát");
    }

    // cái này và view của nhân viên
    public void menuEmployee() {
        int choose;
        do {
            try {
                System.out.println("==Quản Lý Nhân viên==");
                System.out.println("1. Hiển Thị Danh Sách Nhân Viên");
                System.out.println("2. Thêm Mới Nhân Viên");
                System.out.println("3. Sửa thông tin nhân viên");
                System.out.println("4. Xoá Nhân Viên");
                System.out.println("5. Tìm Kiếm Nhân Viên Bằng Tên");
                System.out.println("6. Quay Lại Menu Chính");
                System.out.println("Chọn Chức năng ở quản lý nhân viên");
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
                        System.out.println("Nhập Id Bạn muốn xoá");
                        deleteId = sc.nextLine();
                        employeeController.delete(deleteId);
                        break;
                    case 5:
                        System.out.println("Nhập Id bạn muốn tìm kiếm");
                        findId = sc.nextLine();
                        employeeController.search(findId);
                        break;
                    case 6:
                       return;
                    default:
                        break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập số");
            }
        } while (true);
    }
    public Employee editEmployee(String id){
        int choosenEdit = 0;
        String name = null;
        String dob= null;
        String gender = null;
        String indentityCardNumbers= null;
        String phoneNumbers= null;
        String email= null;
        String academiclevel= null;
        String position= null;
        String salary= null;
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
                    switch (choosenEdit){
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
        }while (choosenEdit > 0 && choosenEdit < 10);
        return new Employee(id,name,dob,gender,indentityCardNumbers,phoneNumbers,email,academiclevel,position, salary);
    }
    public boolean checkId(String id){
        List<Employee> employeeList = employeeController.display();
        for (Employee employee : employeeList){
            if (employee.getId().equals(id)){
                System.out.println("Id này đã tồn tại");
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
            if (!Regex.checkRegexId(id)){
                System.err.println("Vui lòng nhập đúng định dạng Id");
            }
            if (!checkId(id)){
                System.err.println("ID không tồn tại");
            }
        } while (!Regex.checkRegexId(id) || checkId(id));
        return id;
    }

    public String inputId() {
        String id = null;
        do {
            System.out.println("Enter Id Of Employee");
            id = sc.nextLine();
            if (!Regex.checkRegexId(id)){
                System.err.println("Vui lòng nhập đúng định dạng Id");
            }
        } while (!Regex.checkRegexId(id) ||!checkId(id));
        return id;
    }

    public String inputName() {
        String name = null;
        do {
            System.out.println("Enter Name Of Employee");
            name = sc.nextLine();
            if (!Regex.checkRegexName(name)){
                System.err.println("Vui lòng nhập đúng định dạng Name");
            }
        } while (!Regex.checkRegexName(name));
        return name;
    }

    public String inputDOB() {
        String doB = null;
        do {
            System.out.println("Enter Dob Of Employee");
            doB = sc.nextLine();
            if (!Regex.checkRegexDOB(doB)){
                System.err.println("Vui lòng nhập đúng định dạng Dob");
            }
        } while (!Regex.checkRegexDOB(doB));
        return doB;
    }

    public String inputGender() {
        String gender = null;
        do {
            System.out.println("Enter Gender Of Employee");
            gender = sc.nextLine();
            if (!Regex.checkRegexGender(gender)){
                System.err.println("Vui lòng nhập đúng định dạng Gender");
            }
        } while (!Regex.checkRegexGender(gender));
        return gender;
    }

    public String inputIndentityCard() {
        String indentityCard = null;
        do {
            System.out.println("Enter indentityCard Of Employee");
            indentityCard = sc.nextLine();
            if (!Regex.checkRegexIndentitycardnumber(indentityCard)){
                System.err.println("Vui lòng nhập đúng định dạng IndentityCard");
            }
        } while (!Regex.checkRegexIndentitycardnumber(indentityCard));
        return indentityCard;
    }

    public String inputPhone() {
        String phone = null;
        do {
            System.out.println("Enter Phone Of Employee");
            phone = sc.nextLine();
            if (!Regex.checkPhoneNumbers(phone)){
                System.err.println("Nhập đúng định dạng số điện thoại");
            }
        } while (!Regex.checkPhoneNumbers(phone));
        return phone;
    }

    public String inputEmail() {
        String email = null;
        do {
            System.out.println("Enter Email Of Employee");
            email = sc.nextLine();
            if (!Regex.checkEmail(email)){
                System.err.println("Vui lòng nhập đúng định dạng Email");
            }
        } while (!Regex.checkEmail(email));
        return email;
    }

    public String inputAcademicLevel() {
        String academicLevel = null;
        do {
            System.out.println("Enter academicLevel Of Employee");
            academicLevel = sc.nextLine();
            if (!Regex.checkAcademicLevel(academicLevel)){
                System.err.println("Vui lòng nhập đúng định dạng AcademicLevel");
            }
        } while (!Regex.checkAcademicLevel(academicLevel));
        return academicLevel;
    }

    public String inputPosition() {
        String position = null;
        do {
            System.out.println("Enter Position Of Employee");
            position = sc.nextLine();
            if (!Regex.checkPosition(position)){
                System.err.println("Vui lòng nhập đúng định dạng Position");
            }
        } while (!Regex.checkPosition(position));
        return position;
    }

    public String inputSalary() {
        String salary = null;
        do {
            System.out.println("Enter Salary Of Employee");
            salary = sc.nextLine();
            if (!Regex.checkSalary(salary)){
                System.err.println("Vui lòng nhập đúng định dạng Salary");
            }
        } while (!Regex.checkSalary(salary));
        return salary;
    }

    public Employee addEmployee() {
        return new Employee(inputId(), inputName(), inputDOB(), inputGender(), inputIndentityCard(), inputPhone(), inputEmail(), inputAcademicLevel(), inputPosition(), inputSalary());
    }


    // cái này là view của khách hàng
    public void menuCustomer() {
        System.out.println("==Quản Lý Khách Hàng==");
        System.out.println("1. Hiển Thị Danh Sách Khách Hàng");
        System.out.println("2. Thêm Mới Khách Hàng");
        System.out.println("3. Sửa thông tin Khách Hàng");
        System.out.println("4. Xoá Khách Hàng");
        System.out.println("5. Tìm Kiếm Khách Hàng Bằng Tên");
        System.out.println("6. Quay Lại Menu Chính");
    }

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
