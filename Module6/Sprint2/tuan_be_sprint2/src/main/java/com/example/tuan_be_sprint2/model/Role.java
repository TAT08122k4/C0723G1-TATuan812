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
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    String nameRole;

//    public Role() {
//    }
//
//    public Role(int id, String nameRole) {
//        this.id = id;
//        this.nameRole = nameRole;
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
//    public String getNameRole() {
//        return nameRole;
//    }
//
//    public void setNameRole(String nameRole) {
//        this.nameRole = nameRole;
//    }
}
