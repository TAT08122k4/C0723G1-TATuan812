package com.example.thim4.repository;

import com.example.thim4.model.TheLoai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITheLoaiRepository extends JpaRepository<TheLoai,Integer> {
}
