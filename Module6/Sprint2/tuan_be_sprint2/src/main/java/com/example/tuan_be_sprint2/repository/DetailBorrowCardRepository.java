package com.example.tuan_be_sprint2.repository;

import com.example.tuan_be_sprint2.model.DetailBuyBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailBorrowCardRepository extends JpaRepository<DetailBuyBook,Integer> {
}
