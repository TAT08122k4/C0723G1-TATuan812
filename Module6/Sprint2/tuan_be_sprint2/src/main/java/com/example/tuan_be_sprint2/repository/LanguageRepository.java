package com.example.tuan_be_sprint2.repository;

import com.example.tuan_be_sprint2.model.LanguageBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends JpaRepository<LanguageBook,Integer> {
}
