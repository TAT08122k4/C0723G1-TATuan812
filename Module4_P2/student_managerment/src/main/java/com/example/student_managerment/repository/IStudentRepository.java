package com.example.student_managerment.repository;

import com.example.student_managerment.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface IStudentRepository extends JpaRepository<Student,Integer> {
    @Query(value = "select * from student where name like :name",nativeQuery = true)
    Page<Student> search(@Param("name") String name, Pageable pageable);


}
