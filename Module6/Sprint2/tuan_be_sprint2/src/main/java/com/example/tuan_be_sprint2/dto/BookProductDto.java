package com.example.tuan_be_sprint2.dto;


import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookProductDto {
    int id;
    String nameBook;
    String introduceBook;
    String yearOfPublication;
    int amountBook;
    Boolean isDelete;
    String publisher;
    int price;
    int likeBook;
    String imageOfBook;
    int genreId;
    int authorId;
    int languageId;
}
