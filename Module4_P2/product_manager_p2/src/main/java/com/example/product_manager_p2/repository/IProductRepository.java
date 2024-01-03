package com.example.product_manager_p2.repository;

import com.example.product_manager_p2.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<Product,Integer> {

    @Query(value = "select * from Product where name like :name",nativeQuery = true)
    Page<Product> getListProduct(@Param("name")String name , Pageable pageable);
}
