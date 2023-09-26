package ss17_io_binary_file_serialization.bai_tap.mvc_product.model;

public class Product {
    private int id;
    private String name;
    private int price;
    private String brand;
    private String des;
    public Product(){

    }

    public Product(int id, String name, int price, String brand, String des) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.des = des;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", des='" + des + '\'' +
                '}';
    }
}
