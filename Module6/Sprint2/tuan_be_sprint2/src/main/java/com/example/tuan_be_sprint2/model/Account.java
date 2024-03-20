package com.example.tuan_be_sprint2.model;


import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
    String accountName;
    String fullName;
    String passWord;
    String avatarUser;
    boolean gender;
    String phoneNumber;
    String email;
    String idCard;
    Date birthday;
    @ManyToOne
    @JoinColumn(name = "role_id",referencedColumnName = "id")
    private Role role;

//    public Account() {
//    }
//
//    public Account(int id, String accountName, String fullName, String passWord, String avatarUser, boolean gender, String phoneNumber, String email, String idCard, Date birthday, Role role) {
//        this.id = id;
//        this.accountName = accountName;
//        this.fullName = fullName;
//        this.passWord = passWord;
//        this.avatarUser = avatarUser;
//        this.gender = gender;
//        this.phoneNumber = phoneNumber;
//        this.email = email;
//        this.idCard = idCard;
//        this.birthday = birthday;
//        this.role = role;
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
//    public String getAccountName() {
//        return accountName;
//    }
//
//    public void setAccountName(String accountName) {
//        this.accountName = accountName;
//    }
//
//    public String getFullName() {
//        return fullName;
//    }
//
//    public void setFullName(String fullName) {
//        this.fullName = fullName;
//    }
//
//    public String getPassWord() {
//        return passWord;
//    }
//
//    public void setPassWord(String passWord) {
//        this.passWord = passWord;
//    }
//
//    public String getAvatarUser() {
//        return avatarUser;
//    }
//
//    public void setAvatarUser(String avatarUser) {
//        this.avatarUser = avatarUser;
//    }
//
//    public boolean isGender() {
//        return gender;
//    }
//
//    public void setGender(boolean gender) {
//        this.gender = gender;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getIdCard() {
//        return idCard;
//    }
//
//    public void setIdCard(String idCard) {
//        this.idCard = idCard;
//    }
//
//    public Date getBirthday() {
//        return birthday;
//    }
//
//    public void setBirthday(Date birthday) {
//        this.birthday = birthday;
//    }
//
//    public Role getRole() {
//        return role;
//    }
//
//    public void setRole(Role role) {
//        this.role = role;
//    }
}
