package com.example.tuan_be_sprint2.service;


import com.example.tuan_be_sprint2.model.Account;
import com.example.tuan_be_sprint2.model.Role;

public interface IAccountService {
    Account findAccountByEmail(String email);
    Account findAccountByPhone(String phone);
    Account findAccountByAccountName(String accountName);
    Account findAccountByPassword(String password);
    Account findAccountById (int id);
    void register(Account account , int roleId);

    String login(String nameAccount, String passWord) throws Exception;
    void save(Account account);



}
