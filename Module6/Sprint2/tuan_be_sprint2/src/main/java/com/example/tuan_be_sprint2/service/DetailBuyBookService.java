package com.example.tuan_be_sprint2.service;

import com.example.tuan_be_sprint2.dto.DetailBuyBookDTO;
import com.example.tuan_be_sprint2.model.CartItems;
import com.example.tuan_be_sprint2.model.DetailBuyBook;
import com.example.tuan_be_sprint2.repository.DetailBuyBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class DetailBuyBookService implements IDetailBuyBookService {
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
        detailBuyBookRepository.updateQuantity(quantity, id);
    }

    @Override
    public void addInCart(int accountId, int cartId) {
        detailBuyBookRepository.addInCart(accountId, cartId);
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
        return detailBuyBookRepository.checkItemsInCartIsExit(accountId, cartId);
    }

    @Override
    public void deleteProductInCart(int id) {
        detailBuyBookRepository.deleteItemInCart(id);
    }

    @Override
    public List<DetailBuyBook> DetailBuyBookDisplay(int id) {
        return detailBuyBookRepository.detailBuyBookDisplay(id);
    }

    @Override
    public Page<DetailBuyBookDTO> displayHistoryBooking(int id, Date startDay, Date endDay, String nameBook, Pageable pageable) {
        return detailBuyBookRepository.displayHistoryBooking(id, startDay, endDay, '%' + nameBook + '%', pageable);
    }


}
