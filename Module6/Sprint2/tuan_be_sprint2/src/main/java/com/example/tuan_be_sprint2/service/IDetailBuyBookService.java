package com.example.tuan_be_sprint2.service;

import com.example.tuan_be_sprint2.dto.DetailBuyBookDTO;
import com.example.tuan_be_sprint2.model.CartItems;
import com.example.tuan_be_sprint2.model.DetailBuyBook;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.sql.Date;
import java.util.List;

public interface IDetailBuyBookService {
    void saveToCart(DetailBuyBook detailBuyBook);
    List<DetailBuyBookDTO> displayListItemsInCart(int id);
    void updateQuantity(int quantity , int id);
    void addInCart(int accountId,int cartId);
//    CartItems checkCartItems(int bookId);
    void addCartItems(int bookId);
    DetailBuyBook checkItemsInCartIsExit(int accountId,int cartId);
    void deleteProductInCart(int id);
    List<DetailBuyBook> DetailBuyBookDisplay(int id);
    Page<DetailBuyBookDTO> displayHistoryBooking(int id , Date startDay , Date endDay , String nameBook,Pageable pageable );

}
