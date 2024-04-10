package com.example.tuan_be_sprint2.dto;


import java.sql.Date;

public interface DetailBuyBookDTO {
int getId();
Date getBuyDate();
int getPriceOfProduct();
int getQuantity();
boolean getStatusPayment();
int getAccountId();
int getCartId();
int getPrice();
int getQuantityBook();
int getModeOfPayment();
String getImageOfBook();
String getNameBook();
String getNameAuthor();
String getNameGenre();
String getNameLanguage();


}
