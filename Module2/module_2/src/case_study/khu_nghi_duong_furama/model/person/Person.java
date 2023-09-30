package case_study.khu_nghi_duong_furama.model.person;

public abstract class Person {
    private String id;
    private String name;
    private String dOB;
    private String gender;
    private int identityCardNumber;
    private int phoneNumbers;
    private String email;

    public Person() {
    }

    public Person(String id, String name, String dOB, String gender, int identityCardNumber, int phoneNumbers, String email) {
        this.id = id;
        this.name = name;
        this.dOB = dOB;
        this.gender = gender;
        this.identityCardNumber = identityCardNumber;
        this.phoneNumbers = phoneNumbers;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getdOB() {
        return dOB;
    }

    public void setdOB(String dOB) {
        this.dOB = dOB;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(int identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    public int getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(int phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dOB='" + dOB + '\'' +
                ", gender='" + gender + '\'' +
                ", identityCardNumber=" + identityCardNumber +
                ", phoneNumbers=" + phoneNumbers +
                ", email='" + email + '\'' +
                '}';
    }
}
