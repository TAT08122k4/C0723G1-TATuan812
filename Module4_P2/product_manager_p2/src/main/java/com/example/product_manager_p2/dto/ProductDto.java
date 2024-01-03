package com.example.product_manager_p2.dto;

import com.example.product_manager_p2.model.Category;

public class ProductDto {
    private int id;
    private String nameProduct;
    private int price;
    private String detail;
    private String img;
    private String Manufacturer;
    private Category category;

    public ProductDto() {
    }

    public ProductDto(int id, String nameProduct, int price, String manufacturer, Category category) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        Manufacturer = manufacturer;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
