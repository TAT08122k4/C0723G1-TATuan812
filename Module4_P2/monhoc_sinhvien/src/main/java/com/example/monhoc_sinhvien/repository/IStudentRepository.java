package com.example.monhoc_sinhvien.repository;

import com.example.monhoc_sinhvien.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends JpaRepository<Student,Integer> {
    @Query(nativeQuery = true,value = "select s.* from student s join mon_hoc mh on mh.student_id = s.id where s.ten_sinh_vien like concat('%' , :tenHocVien,'%') and (mh.id = :idMonHoc or :idMonHoc = -1) " ,
            countQuery = "select count(*) from (select s.* from student s join mon_hoc mh on mh.student_id = s.id where s.ten_sinh_vien like concat('%' , :tenHocVien,'%') and (mh.id = :idMonHoc or :idMonHoc = -1)) temp")
    Page<Student> getAllStudentPage(Pageable pageable , @Param("tenHocVien") String tenHocVien , @Param("idMonHoc") Integer idMonHoc);
}
