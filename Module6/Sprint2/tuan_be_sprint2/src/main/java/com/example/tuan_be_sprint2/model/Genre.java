package com.example.tuan_be_sprint2.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
    String nameGenre;

//    public Genre() {
//    }
//
//    public Genre(int id, int nameGenre) {
//        this.id = id;
//        this.nameGenre = nameGenre;
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
//    public int getNameGenre() {
//        return nameGenre;
//    }
//
//    public void setNameGenre(int nameGenre) {
//        this.nameGenre = nameGenre;
//    }
}
