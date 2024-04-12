package com.example.tuan_be_sprint2.controller;


import com.example.tuan_be_sprint2.dto.AccountDto;
import com.example.tuan_be_sprint2.dto.ApiResponse;
import com.example.tuan_be_sprint2.model.*;
import com.example.tuan_be_sprint2.service.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin("*")
@RequestMapping("/book")
public class BookRestController {
    @Autowired
    IBookService iBookService;
    @Autowired
    IGenreService iGenreService;
    @Autowired
    ILanguageService iLanguageService;
    @Autowired
    IAuthorService iAuthorService;
    @Autowired
    IAccountService accountService;

    @GetMapping("/list")
    ResponseEntity<?> displayAllBooks(@RequestParam(defaultValue =  "0") int page ,
                                      @RequestParam(defaultValue = "")String nameBook ,
                                      @RequestParam(defaultValue = "0") int authorId,
                                      @RequestParam(defaultValue = "0") int languageId,
                                      @RequestParam(defaultValue = "0") int genreId ){
        Pageable pageable = PageRequest.of(page,6);
        Page<BookProduct> bookProductPage = iBookService.searchAndDisplayProducts(nameBook,authorId,languageId,genreId,pageable);
        if (bookProductPage.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(bookProductPage,HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    ResponseEntity<?> findBookById(@PathVariable int id){
       BookProduct bookProduct =  iBookService.findBookById(id);
       if (bookProduct == null){
           return new ResponseEntity<>(HttpStatus.NO_CONTENT);
       }else {
           return new ResponseEntity<>( bookProduct,HttpStatus.OK);
       }
    }


    @GetMapping("/listAuthor")
    ResponseEntity<?> displayAuthor(){
        List<Author> authorList = iAuthorService.getAll();
        if (authorList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
            return new ResponseEntity<>(authorList,HttpStatus.OK);
        }

    }
    @GetMapping("/listGenre")
    ResponseEntity<?> displayGenre(){
        List<Genre> genreList = iGenreService.getAll();
        if (genreList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
            return new ResponseEntity<>(genreList,HttpStatus.OK);
        }
    }
    @GetMapping("/listLanguage")
    ResponseEntity<?> displayLanguage(){
        List<LanguageBook> languageList = iLanguageService.getAll();
        if (languageList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
            return new ResponseEntity<>(languageList,HttpStatus.OK);
        }
    }
    @GetMapping("/topBooks")
    ResponseEntity<?> displayTopBookLike(){
        List<BookProduct> bookProductList = iBookService.topBookLikeMost();
        if (bookProductList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else {
            return  new ResponseEntity<>( bookProductList,HttpStatus.OK);
        }
    }
}
