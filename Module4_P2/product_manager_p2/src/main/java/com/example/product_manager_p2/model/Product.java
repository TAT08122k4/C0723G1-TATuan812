package com.example.product_manager_p2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nameProduct;
    @Column(columnDefinition = "longtext")
    private String detail;
    private int price;
    @Column(columnDefinition = "longtext")
    private String img;
    private String Manufacturer;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
