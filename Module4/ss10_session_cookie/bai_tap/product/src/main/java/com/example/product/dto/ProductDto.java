package com.example.product.dto;

import com.example.product.model.Category;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Range;

public class ProductDto {

    private long id;
    @NotBlank(message = "Không được rỗng")
    private String name;
//    @NotBlank(message = "Không được để rỗng")
//    @Pattern(regexp = "^(0|[1-9][0-9]*)$" , message = "Chỉ Nhập Số")
@Range(min = (long) 0.0, max = (long) 10000.0)
    private double price;
    @NotBlank(message = "Không được rỗng")
    private String description;
    private String image;
    private Category category;

    public ProductDto() {
    }

    public ProductDto(long id, String name, double price, String description, String image, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.image = image;
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
