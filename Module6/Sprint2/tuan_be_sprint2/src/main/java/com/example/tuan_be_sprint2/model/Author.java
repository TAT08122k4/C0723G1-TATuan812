package com.example.tuan_be_sprint2.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    String nameAuthor;

//    public Author() {
//    }
//
//    public Author(int id, String nameAuthor) {
//        this.id = id;
//        this.nameAuthor = nameAuthor;
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
//    public String getNameAuthor() {
//        return nameAuthor;
//    }
//
//    public void setNameAuthor(String nameAuthor) {
//        this.nameAuthor = nameAuthor;
//    }
}
