package com.example.front_end.repository;

import com.example.front_end.model.ViTri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IViTriRepository extends JpaRepository<ViTri,Integer> {
}
