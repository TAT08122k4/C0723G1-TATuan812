package com.example.borrowbook.service;

import com.example.borrowbook.model.Book;

import java.util.List;

public interface IBookService {
      public void borrowABook(Book book);
      public List<Book> bookList();
      public void deleteBook(int id);
      public Book findById(int id);
}
