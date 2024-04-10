package com.example.thi1.repository;

import com.example.thi1.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<Product, Integer> {
    @Query(value = "SELECT * FROM product WHERE ten_san_pham LIKE %:tenSanPham%",nativeQuery = true)
    Page<Product> search(@Param("tenSanPham")String tenSanPham, Pageable pageable);
}
