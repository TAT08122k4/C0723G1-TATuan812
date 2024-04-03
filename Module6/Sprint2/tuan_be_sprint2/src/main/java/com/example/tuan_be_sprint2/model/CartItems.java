package com.example.tuan_be_sprint2.model;


import jakarta.persistence.*;

@Entity
public class CartItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int totalPrice;
    int totalQuantity;
    @ManyToOne
    @JoinColumn(name = "book_id",referencedColumnName = "id")
    private BookProduct book;

    public CartItems() {
    }

    public CartItems(Integer id, int totalPrice, int totalQuantity) {
        this.id = id;
        this.totalPrice = totalPrice;
        this.totalQuantity = totalQuantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }
}
