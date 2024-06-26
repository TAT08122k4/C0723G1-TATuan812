package com.example.tuan_be_sprint2.repository;

import com.example.tuan_be_sprint2.dto.DetailBuyBookDTO;
import com.example.tuan_be_sprint2.model.BookProduct;
import com.example.tuan_be_sprint2.model.CartItems;
import com.example.tuan_be_sprint2.model.DetailBuyBook;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;


@Repository
public interface DetailBuyBookRepository extends JpaRepository<DetailBuyBook, Integer> {

    @Query(value = "select  dbb.id as id , dbb.buy_date as buyDate , dbb.quantity as quantity ,dbb.mode_of_payment as modeOfPayment , dbb.price_of_product as priceOfProduct , dbb.status_payment as statusPayment , dbb.account_id as accountId , dbb.cart_id as cartId , bp.name_book as nameBook , ath.name_author as nameAuthor , g.name_genre as nameGenre , bp.price as price  , lg.name_language as nameLanguage , bp.image_of_book as imageOfBook , bp.amount_book as quantityBook\n" +
            " from detail_buy_book dbb join account a on a.id = dbb.account_id \n" +
            " join cart_items ci on ci.id = dbb.cart_id \n" +
            " join book_product bp on bp.id = ci.book_id \n" +
            " join author ath on ath.id = bp.author_id\n" +
            " join genre g on g.id = bp.genre_id  join language_book lg on lg.id = bp.language_book_id\n" +
            " where dbb.status_payment = false and dbb.account_id = :idAccount", nativeQuery = true)
    List<DetailBuyBookDTO> displayListItemsInCart(@Param("idAccount") int idAccount);

    @Query(value = "SELECT dbb.id AS id, dbb.buy_date AS buyDate, dbb.quantity AS quantity, dbb.mode_of_payment AS modeOfPayment, " +
            "dbb.price_of_product AS priceOfProduct, dbb.status_payment AS statusPayment, dbb.account_id AS accountId, dbb.cart_id AS cartId, " +
            "bp.name_book AS nameBook, ath.name_author AS nameAuthor, g.name_genre AS nameGenre, bp.price AS price, " +
            "lg.name_language AS nameLanguage, bp.image_of_book AS imageOfBook, bp.amount_book AS quantityBook " +
            "FROM detail_buy_book dbb " +
            "JOIN account a ON a.id = dbb.account_id " +
            "JOIN cart_items ci ON ci.id = dbb.cart_id " +
            "JOIN book_product bp ON bp.id = ci.book_id " +
            "JOIN author ath ON ath.id = bp.author_id " +
            "JOIN genre g ON g.id = bp.genre_id " +
            "JOIN language_book lg ON lg.id = bp.language_book_id " +
            "WHERE (dbb.status_payment = 1 )" +
            "AND (dbb.account_id = :idAccount) " +
            "AND (dbb.buy_date BETWEEN :startDay AND :endDay)" +
            "AND (bp.name_book LIKE  :nameBook)",
            nativeQuery = true)
    Page<DetailBuyBookDTO> displayHistoryBooking(@Param("idAccount") int idAccount,
                                                 @Param("startDay") Date startDay,
                                                 @Param("endDay") Date endDay,
                                                 @Param("nameBook") String nameBook,
                                                 Pageable pageable);


    @Query(value = "select * from detail_buy_book where account_id = :idAccount and status_payment = 0;", nativeQuery = true)
    List<DetailBuyBook> detailBuyBookDisplay(@Param("idAccount") int idAccount);

    @Transactional
    @Modifying
    @Query(value = "update detail_buy_book set quantity = :quantity where detail_buy_book.id = :id ", nativeQuery = true)
    void updateQuantity(@Param("quantity") int quantity, @Param("id") int id);

    @Transactional
    @Modifying
    @Query(value = "insert into detail_buy_book (`buy_date`,`price_of_product`,`quantity`,`mode_of_payment`,`status_payment`,`account_id`,`cart_id`) values (CURRENT_DATE,1,1,0,0,:accountId,:cartId)", nativeQuery = true)
    void addInCart(@Param("accountId") int accountId, @Param("cartId") int cartId);


    @Transactional
    @Modifying
    @Query(nativeQuery = true, value = "insert into cart_items (`total_price`,`total_quantity`,`book_id`) values(1,1,:bookId);")
    void addCartItems(@Param("bookId") int bookId);

    @Query(nativeQuery = true, value = "select dbb.* from detail_buy_book dbb  join cart_items ci on dbb.cart_id = ci.id join book_product bp on bp.id = ci.book_id join account a on a.id = dbb.account_id where dbb.status_payment = false and a.id = :accountId and ci.id = :cartId")
    DetailBuyBook checkItemsInCartIsExit(@Param("accountId") int accountId, @Param("cartId") int cartId);

    @Transactional
    @Modifying
    @Query(nativeQuery = true, value = "DELETE FROM detail_buy_book \n" +
            "WHERE id = :detailBookBuyId  \n")
    void deleteItemInCart(@Param("detailBookBuyId") int detailBookBuyId);


}
