package com.example.front_end.repository;

import com.example.front_end.model.HangSanXuat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHangSanXuatRepository extends JpaRepository<HangSanXuat,Integer> {
}
