package com.example.tuan_be_sprint2.model;


import jakarta.persistence.*;
import lombok.*;


@NoArgsConstructor
@Getter
@Setter
@Entity
public class BookProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    String nameBook;
    String introduceBook;
    String yearOfPublication;
    int amountBook;
    @Column(columnDefinition = "boolean default false")
    Boolean isDelete;
    String publisher;
    int price;
    int likeBook;
    @ManyToOne
    @JoinColumn(name = "genre_id",referencedColumnName = "id")
    private Genre genre;

    @ManyToOne
    @JoinColumn(name = "language_id",referencedColumnName = "id")
    private Language language;

    @ManyToOne
    @JoinColumn(name = "author_id",referencedColumnName = "id")
    private Author author;
//
//    public Book() {
//    }
//
//    public Book(int id, String nameBook, String introduceBook, String yearOfPublication, int amountBook, boolean isDelete, String publisher, int like, Genre genre, Language language, Author author) {
//        this.id = id;
//        this.nameBook = nameBook;
//        this.introduceBook = introduceBook;
//        this.yearOfPublication = yearOfPublication;
//        this.amountBook = amountBook;
//        this.isDelete = isDelete;
//        this.publisher = publisher;
//        this.like = like;
//        this.genre = genre;
//        this.language = language;
//        this.author = author;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getNameBook() {
//        return nameBook;
//    }
//
//    public void setNameBook(String nameBook) {
//        this.nameBook = nameBook;
//    }
//
//    public String getIntroduceBook() {
//        return introduceBook;
//    }
//
//    public void setIntroduceBook(String introduceBook) {
//        this.introduceBook = introduceBook;
//    }
//
//    public String getYearOfPublication() {
//        return yearOfPublication;
//    }
//
//    public void setYearOfPublication(String yearOfPublication) {
//        this.yearOfPublication = yearOfPublication;
//    }
//
//    public int getAmountBook() {
//        return amountBook;
//    }
//
//    public void setAmountBook(int amountBook) {
//        this.amountBook = amountBook;
//    }
//
//    public boolean isDelete() {
//        return isDelete;
//    }
//
//    public void setDelete(boolean delete) {
//        isDelete = delete;
//    }
//
//    public String getPublisher() {
//        return publisher;
//    }
//
//    public void setPublisher(String publisher) {
//        this.publisher = publisher;
//    }
//
//    public int getLike() {
//        return like;
//    }
//
//    public void setLike(int like) {
//        this.like = like;
//    }
//
//    public Genre getGenre() {
//        return genre;
//    }
//
//    public void setGenre(Genre genre) {
//        this.genre = genre;
//    }
//
//    public Language getLanguage() {
//        return language;
//    }
//
//    public void setLanguage(Language language) {
//        this.language = language;
//    }
//
//    public Author getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(Author author) {
//        this.author = author;
//    }
}
