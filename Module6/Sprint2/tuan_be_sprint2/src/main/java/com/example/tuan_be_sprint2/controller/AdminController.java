package com.example.tuan_be_sprint2.controller;


import com.example.tuan_be_sprint2.dto.BookProductDto;
import com.example.tuan_be_sprint2.model.Author;
import com.example.tuan_be_sprint2.model.BookProduct;
import com.example.tuan_be_sprint2.model.Genre;
import com.example.tuan_be_sprint2.model.LanguageBook;
import com.example.tuan_be_sprint2.service.IAuthorService;
import com.example.tuan_be_sprint2.service.IBookService;
import com.example.tuan_be_sprint2.service.IGenreService;
import com.example.tuan_be_sprint2.service.ILanguageService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    IBookService bookService;
    @Autowired
    IGenreService genreService;
    @Autowired
    ILanguageService languageService;
    @Autowired
    IAuthorService authorService;

    @PostMapping("/addBook")
    public ResponseEntity<?> addNewbook(@RequestBody @Valid BookProductDto bookProductDto , BindingResult bindingResult){
        Map<String , String> listError = new HashMap<>();
        if (bindingResult.hasFieldErrors()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }else {
            if (bookService.findBookByName(bookProductDto.getNameBook()) != null){
                listError.put("nameBook","Sách này đã tồn tại");
            }
            if (listError.size() > 0){
                return new ResponseEntity<>(listError,HttpStatus.BAD_REQUEST);
            }
            Genre genre = genreService.findGenreById(bookProductDto.getGenreId());
            LanguageBook languageBook = languageService.findLanguageById(bookProductDto.getLanguageId());
            Author author = authorService.findAuthorById(bookProductDto.getAuthorId());
            BookProduct bookProduct = new BookProduct();
            BeanUtils.copyProperties(bookProductDto,bookProduct);
            bookProduct.setGenre(genre);
            bookProduct.setAuthor(author);
            bookProduct.setLanguageBook(languageBook);
            bookService.save(bookProduct);
            return new ResponseEntity<>(HttpStatus.OK);
        }



    }
}
