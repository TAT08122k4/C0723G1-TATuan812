package com.example.tuan_be_sprint2.service;

import com.example.tuan_be_sprint2.model.BookProduct;
import com.example.tuan_be_sprint2.model.CartItems;
import com.example.tuan_be_sprint2.repository.ICartItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartItemService implements ICartItemsService{
    @Autowired
    ICartItemsRepository cartItemsRepository;
    @Override
    public BookProduct checkItemsOnCart(int accountId, int bookId) {
        return cartItemsRepository.checkItemsOnCart(accountId,bookId);
    }

    @Override
    public CartItems checkCartIsExit(int accountId) {
        return cartItemsRepository.checkCartIsExit(accountId);
    }

    @Override
    public void saveCartItems(CartItems cartItems) {

    }

    @Override
    public CartItems checkCartItem(int bookId) {
        return cartItemsRepository.checkCartItems(bookId);
    }
}
