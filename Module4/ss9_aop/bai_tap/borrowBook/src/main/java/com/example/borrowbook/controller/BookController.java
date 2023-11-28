package com.example.borrowbook.controller;


import com.example.borrowbook.model.Book;
import com.example.borrowbook.service.IBookService;
import com.example.borrowbook.service.IIdOfBorrowBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private IBookService iBookService;

    @Autowired
    private IIdOfBorrowBook iIdOfBorrowBook;
    @GetMapping("")
    public String showBook(Model model){
        model.addAttribute("books",iBookService.bookList());
        return "index";
    }
    @GetMapping("/details{bookId}")
    public String showDetail(@PathVariable int bookId,Model model){
        Book book = iBookService.findById(bookId);
        model.addAttribute("book",book);
        return "detail";
    }
    @PostMapping("/borrow")
    public String borrow(@ModelAttribute Book book , Model model){
        iBookService.borrowABook(book);
        model.addAttribute("idOfBorrowBook",iIdOfBorrowBook.createCode());
        return "borrow";
    }
}
