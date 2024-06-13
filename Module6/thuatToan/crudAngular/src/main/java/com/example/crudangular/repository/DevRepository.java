package com.example.crudangular.repository;

import com.example.crudangular.model.Dev;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevRepository extends JpaRepository<Dev,Integer> {
}
