package com.example.borrowbook.service;

import com.example.borrowbook.model.Book;
import com.example.borrowbook.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements IBookService {
    @Autowired
    private IBookRepository iBookRepository;

    @Override
    public void borrowABook(Book book) {
        book.setQuantity(book.getQuantity() - 1);
        iBookRepository.save(book);
    }

    @Override
    public List<Book> bookList() {
        return iBookRepository.findAll();
    }

    @Override
    public void deleteBook(int id) {
        iBookRepository.deleteById(id);
    }

    @Override
    public Book findById(int id) {
    return iBookRepository.findById(id).get();
    }


}
