package com.example.tuan_be_sprint2.service;

import com.example.tuan_be_sprint2.dto.BookProductDto;
import com.example.tuan_be_sprint2.model.BookProduct;
import com.example.tuan_be_sprint2.repository.BookProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService {
    @Autowired
    BookProductRepository bookProductRepository;
    @Override
    public Page<BookProduct> searchAndDisplayProducts(String nameBook, int authorId, int languageId, int genreId, Pageable pageable) {
        return bookProductRepository.bookProductList( '%' + nameBook + '%',authorId,languageId,genreId,pageable);
    }

    @Override
    public BookProduct findBookById(int id) {
        return bookProductRepository.findById(id).get();
    }

    @Override
    public List<BookProduct> topBookLikeMost() {
        return bookProductRepository.topBookLikeMost();
    }

    @Override
    public void save(BookProduct bookProduct) {
        bookProductRepository.save(bookProduct);
    }

    @Override
    public BookProduct findBookByName(String nameBook) {
        return bookProductRepository.findBookByName(nameBook);
    }
}
