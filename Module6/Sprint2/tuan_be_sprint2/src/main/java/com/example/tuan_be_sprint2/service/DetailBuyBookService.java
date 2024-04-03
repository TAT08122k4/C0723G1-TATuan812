package com.example.tuan_be_sprint2.service;

import com.example.tuan_be_sprint2.dto.DetailBuyBookDTO;
import com.example.tuan_be_sprint2.model.CartItems;
import com.example.tuan_be_sprint2.model.DetailBuyBook;
import com.example.tuan_be_sprint2.repository.DetailBuyBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailBuyBookService implements IDetailBuyBookService{
    @Autowired
    DetailBuyBookRepository detailBuyBookRepository;
    @Override
    public void saveToCart(DetailBuyBook detailBuyBook) {
        detailBuyBookRepository.save(detailBuyBook);
    }

    @Override
    public List<DetailBuyBookDTO> displayListItemsInCart(int id) {
        return detailBuyBookRepository.displayListItemsInCart(id);
    }

    @Override
    public void updateQuantity(int quantity, int id) {
        detailBuyBookRepository.updateQuantity(quantity,id);
    }

    @Override
    public void addInCart(int accountId, int cartId) {
        detailBuyBookRepository.addInCart(accountId,cartId);
    }

//    @Override
//    public CartItems checkCartItem(int bookId) {
//        return detailBuyBookRepository.checkCartItems(bookId);
//    }

    @Override
    public void addCartItems(int bookId) {
        detailBuyBookRepository.addCartItems(bookId);
    }

    @Override
    public DetailBuyBook checkItemsInCartIsExit(int accountId, int cartId) {
        return detailBuyBookRepository.checkItemsInCartIsExit(accountId,cartId);
    }

    @Override
    public void deleteProductInCart(int id) {
        detailBuyBookRepository.deleteItemInCart(id);
    }


}
