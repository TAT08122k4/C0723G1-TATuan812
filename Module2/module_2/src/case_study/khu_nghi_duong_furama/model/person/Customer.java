package case_study.khu_nghi_duong_furama.model.person;

public class Customer extends Person{
    private String typeOfCustomer;
    private String address;
    public Customer(){}

    public Customer(String typeOfCustomer, String address) {
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public Customer(String id, String name, String dOB, String gender, int identityCardNumber, int phoneNumbers, String email, String loaiKhach, String diaChi) {
        super(id, name, dOB, gender, identityCardNumber, phoneNumbers, email);
        this.typeOfCustomer = loaiKhach;
        this.address = diaChi;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString() + "typeOfCustomer = " + this.typeOfCustomer + "address = " + this.address;
    }
}
