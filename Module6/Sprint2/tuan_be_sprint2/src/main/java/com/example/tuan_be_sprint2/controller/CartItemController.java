package com.example.tuan_be_sprint2.controller;


import com.example.tuan_be_sprint2.dto.DetailBuyBookDTO;
import com.example.tuan_be_sprint2.model.Account;
import com.example.tuan_be_sprint2.model.BookProduct;
import com.example.tuan_be_sprint2.model.CartItems;
import com.example.tuan_be_sprint2.model.DetailBuyBook;
import com.example.tuan_be_sprint2.service.IAccountService;
import com.example.tuan_be_sprint2.service.ICartItemsService;
import com.example.tuan_be_sprint2.service.IDetailBuyBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/cart")
public class CartItemController {
    @Autowired
    ICartItemsService cartItemsService;
    @Autowired
    IDetailBuyBookService detailBuyBookService;
    @Autowired
    IAccountService accountService;
    @GetMapping("checkAddToCart/{accountId}/{bookId}")
    ResponseEntity<Boolean> addProductToCart(@PathVariable int accountId,@PathVariable int bookId){
     CartItems cartItems = cartItemsService.checkCartItem(bookId);
     if (cartItems == null){
         detailBuyBookService.addCartItems(bookId);

     }
     CartItems cartItems1 = cartItemsService.checkCartItem(bookId);
     DetailBuyBook detailBuyBook = detailBuyBookService.checkItemsInCartIsExit(accountId,cartItems1.getId());
     if (detailBuyBook != null){
         return new ResponseEntity<>(false, HttpStatus.OK);
     }else {
         detailBuyBookService.addInCart(accountId,cartItems1.getId());
         return new ResponseEntity<>(true, HttpStatus.OK);
     }


    }
    @GetMapping("/list/{id}")
    ResponseEntity<?> listCartItems(@PathVariable int id){
        List<DetailBuyBookDTO> detailBuyBookList = detailBuyBookService.displayListItemsInCart(id);
        Integer sizeOfCart = detailBuyBookList.size();
        if (detailBuyBookList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }else {
            return new ResponseEntity<>(detailBuyBookList,HttpStatus.OK);
        }
    }
    @PatchMapping("updateQuanlity/{quantity}/{idCart}")
    ResponseEntity<?> updateQuantity(@PathVariable int quantity , @PathVariable int idCart){
                 detailBuyBookService.updateQuantity(quantity,idCart);
                 return new ResponseEntity<>(HttpStatus.OK);
    }
    @DeleteMapping("deleteItemInCart/{id}")
    ResponseEntity<?> deleteItemInCartById(@PathVariable int id){
        detailBuyBookService.deleteProductInCart(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("showSumMoney/{accountId}")
    ResponseEntity<?> showSumMoney(@PathVariable int accountId ){
        List<DetailBuyBookDTO> detailBuyBookDTOS = detailBuyBookService.displayListItemsInCart(accountId);
        long sum = 0;
        for (DetailBuyBookDTO detailBuyBookDTO: detailBuyBookDTOS){
            sum += detailBuyBookDTO.getQuantity() * detailBuyBookDTO.getPrice();
        }
        return new ResponseEntity<>(sum,HttpStatus.OK);
    }
    @GetMapping("/historyBooking")
    ResponseEntity<?> displayHistoryBookingBook(@RequestParam(defaultValue = "0") int page,
                                                @RequestParam(defaultValue = "0") int id,
                                                @RequestParam(defaultValue = "") String nameBook,
                                                @RequestParam(defaultValue = "") String startDayStr,
                                                @RequestParam(defaultValue = "") String endDayStr) {

        Date startDay = null;
        Date endDay = null;

        if (!startDayStr.isEmpty()) {
            try {
                startDay = Date.valueOf(startDayStr);
            } catch (IllegalArgumentException e) {
                // Handle invalid date format
            }
        }

        if (!endDayStr.isEmpty()) {
            try {
                endDay = Date.valueOf(endDayStr);
            } catch (IllegalArgumentException e) {
                // Handle invalid date format
                // tăt
            }
        }
        Pageable pageable = PageRequest.of(page, 2);
        Page<DetailBuyBookDTO> detailBuyBookDTOPage = detailBuyBookService.displayHistoryBooking(id, startDay, endDay, nameBook, pageable);

        if (detailBuyBookDTOPage.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(detailBuyBookDTOPage, HttpStatus.OK);
        }
    }



}
