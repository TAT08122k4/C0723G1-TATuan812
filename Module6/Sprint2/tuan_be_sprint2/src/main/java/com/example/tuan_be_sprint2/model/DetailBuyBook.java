package com.example.tuan_be_sprint2.model;


import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DetailBuyBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    Date buyDate;
    int priceOfProduct;
    int quantity;
    boolean statusPayment;
    @ManyToOne
    @JoinColumn(name = "account_id",referencedColumnName = "id")
    private Account account;
    @ManyToOne
    @JoinColumn(name = "cart_id" , referencedColumnName = "id")
    private CartItems cartItems;

//    public DetailBorrowCard() {
//    }

//    public DetailBorrowCard(int id, Date startDate, Date endDate, Book book, Account account) {
//        this.id = id;
//        this.startDate = startDate;
//        this.endDate = endDate;
//        this.book = book;
//        this.account = account;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public Date getStartDate() {
//        return startDate;
//    }
//
//    public void setStartDate(Date startDate) {
//        this.startDate = startDate;
//    }
//
//    public Date getEndDate() {
//        return endDate;
//    }
//
//    public void setEndDate(Date endDate) {
//        this.endDate = endDate;
//    }
//
//    public Book getBook() {
//        return book;
//    }
//
//    public void setBook(Book book) {
//        this.book = book;
//    }
//
//    public Account getAccount() {
//        return account;
//    }
//
//    public void setAccount(Account account) {
//        this.account = account;
//    }
}
