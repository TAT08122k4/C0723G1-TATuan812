package com.example.tuan_be_sprint2.model;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Account implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
    String accountName;
    String fullName;
    String password;
    String avatarUser;
    boolean gender;
    String phoneNumber;
    String address;
    String email;
    String idCard;
    Date birthday;
    String verificationCode;
    @ManyToOne
    @JoinColumn(name = "role_id",referencedColumnName = "id")
    private Role role;

 @Override
 public Collection<? extends GrantedAuthority> getAuthorities() {
  List<SimpleGrantedAuthority> authorityList = new ArrayList<>();
  authorityList.add(new SimpleGrantedAuthority("ROLE_" + getRole().getNameRole()));
  return authorityList;
 }

 @Override
 public String getUsername() {
  return accountName;
 }

 @Override
 public boolean isAccountNonExpired() {
  return true;
 }

 @Override
 public boolean isAccountNonLocked() {
  return true;
 }

 @Override
 public boolean isCredentialsNonExpired() {
  return true;
 }

 @Override
 public boolean isEnabled() {
  return true;
 }

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
