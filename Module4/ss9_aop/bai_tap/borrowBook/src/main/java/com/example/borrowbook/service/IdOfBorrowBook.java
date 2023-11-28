package com.example.borrowbook.service;


import org.springframework.stereotype.Service;

@Service
public class IdOfBorrowBook implements IIdOfBorrowBook {
    @Override
    public int createCode() {
        return (int) (Math.floor(Math.random() * 99999) + 10000);
    }
}
