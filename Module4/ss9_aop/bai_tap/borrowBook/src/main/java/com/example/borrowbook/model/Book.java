package com.example.borrowbook.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;
    private String bookName;
    private String introduce;
    private String img;
    private String content;
    private int quantity;
    @OneToMany(mappedBy = "book")
    private Set<IdOfBorrowBook> idOfBorrowBooks;
}
