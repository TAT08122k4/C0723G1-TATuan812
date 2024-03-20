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
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
    String nameLanguage;
//    public Language() {
//    }
//
//    public Language(int id, String nameLanguage) {
//        this.id = id;
//        this.nameLanguage = nameLanguage;
//    }
//
//
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getNameLanguage() {
//        return nameLanguage;
//    }
//
//    public void setNameLanguage(String nameLanguage) {
//        this.nameLanguage = nameLanguage;
//    }
}
