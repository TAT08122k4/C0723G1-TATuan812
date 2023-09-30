package case_study.khu_nghi_duong_furama.model.person;

public class Employee extends Person{
    private String academicLevel;
        private String position;
    private float salary;
    public Employee(){}

    public Employee(String academicLevel, String position, float salary) {
        this.academicLevel = academicLevel;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String id, String name, String dOB, String gender, int soCMND, int phoneNumbers, String email, String academicLevel, String position, float salary) {
        super(id, name, dOB, gender, soCMND, phoneNumbers, email);
        this.academicLevel = academicLevel;
        this.position = position;
        this.salary = salary;
    }

    public String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(String academicLevel) {
        this.academicLevel = academicLevel;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "academicLevel=" + academicLevel +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", id=" + getId() +
                ", name='" + getName() + '\'' +
                ", dOB='" + getdOB() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", IndentityCardNumber=" + getIdentityCardNumber()+
                ", phoneNumbers=" + getPhoneNumbers() +
                ", email='" + getEmail() + '\'' +
                '}';
    }
}
