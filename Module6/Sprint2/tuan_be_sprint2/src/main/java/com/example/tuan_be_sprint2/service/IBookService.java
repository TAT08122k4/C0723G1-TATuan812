package com.example.tuan_be_sprint2.service;


import com.example.tuan_be_sprint2.dto.BookProductDto;
import com.example.tuan_be_sprint2.model.BookProduct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBookService  {

    Page<BookProduct> searchAndDisplayProducts(String nameBook , int authorId , int languageId , int genreId , Pageable pageable);
   BookProduct findBookById(int id);
   List<BookProduct> topBookLikeMost();
   void save(BookProduct bookProduct);
   BookProduct findBookByName(String nameBook);


}
