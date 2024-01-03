package com.example.product.repository;

import com.example.product.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<Product,Long> {
    @Query(value ="select p.* from product p join category c on p.category_id = c.id where p.name like concat('%',:name,'%') and (p.category_id = :category_id or :category_id  = -1)",nativeQuery = true ,
            countQuery = "select count(*) from (select p.* from product p join category c on p.category_id = c.id where p.name like concat('%',:name,'%') and (p.category_id = :category_id or :category_id = -1)) temp")
    Page<Product> getAllProductPage(Pageable pageable , @Param("name")String name , @Param("category_id")Integer categoryId);
}
