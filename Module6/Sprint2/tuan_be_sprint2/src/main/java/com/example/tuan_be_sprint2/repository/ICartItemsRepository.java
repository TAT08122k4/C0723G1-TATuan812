package com.example.tuan_be_sprint2.repository;

import com.example.tuan_be_sprint2.model.BookProduct;
import com.example.tuan_be_sprint2.model.CartItems;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ICartItemsRepository extends JpaRepository<CartItems,Integer> {
    @Query(nativeQuery = true,value = "select * from cart_items ci join book_product bp on bp.id = ci.book_id join detail_buy_book dbb on dbb.cart_id = ci.id join account a on a.id = dbb.account_id where dbb.status_payment = false and a.id = :accountId and bp.id = :bookId")
    BookProduct checkItemsOnCart(@Param("accountId") int accountId , @Param("bookId") int bookId);
    @Query(nativeQuery = true,value = "select * from cart_items ci join book_product bp on bp.id = ci.book_id join detail_buy_book dbb on dbb.cart_id = ci.id join account a on a.id = dbb.account_id where dbb.status_payment = false and a.id = :accountId")
    CartItems checkCartIsExit(@Param("accountId") int accountId);

//    @Query(nativeQuery = true,value = "select * from cart_items where cart_items.book_id = :bookId");
//    CartItems checkCartIsExit;

    @Query(value = "select * from cart_items where cart_items.book_id = :bookId " ,nativeQuery = true)
    CartItems checkCartItems(@Param("bookId") int bookId);

    @Transactional
    @Modifying
    @Query(nativeQuery = true,value = "insert into cart_items (`total_price`,`total_quantity`,`book_id`) values(1,1,:bookId);")
    void addCartItems(@Param("bookId") int bookId);



}
