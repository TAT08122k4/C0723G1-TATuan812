package com.example.thim4.repository;

import com.example.thim4.model.Tranh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITranhRepository extends JpaRepository<Tranh,Integer> {
}
