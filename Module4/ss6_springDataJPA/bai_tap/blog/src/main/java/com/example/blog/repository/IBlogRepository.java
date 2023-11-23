package com.example.blog.repository;

import com.example.blog.modal.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IBlogRepository extends JpaRepository<Blog,Integer> {
    @Query(nativeQuery = true,value = "select * from blog b join category c on b.category = c.id where c.id :id")
    List<Blog> findCategoriesById(@Param("")int id);
    @Query(value = "select * from blog where time_to_create_blog like :name ", nativeQuery = true)
    Page<Blog> search(@Param("name") String name, Pageable pageable);
}
