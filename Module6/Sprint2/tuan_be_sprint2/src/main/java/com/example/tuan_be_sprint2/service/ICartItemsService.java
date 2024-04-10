package com.example.tuan_be_sprint2.service;

import com.example.tuan_be_sprint2.model.BookProduct;
import com.example.tuan_be_sprint2.model.CartItems;
import com.example.tuan_be_sprint2.model.DetailBuyBook;

public interface ICartItemsService {
    BookProduct checkItemsOnCart(int accountId,int bookId);
    CartItems  checkCartIsExit(int accountId);

    void saveCartItems(CartItems cartItems);

    CartItems checkCartItem(int bookId);

}
