package com.example.monhoc_sinhvien.repository;

import com.example.monhoc_sinhvien.model.MonHoc;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface IMonHocRepository extends JpaRepository<MonHoc,Integer> {
    @Query(nativeQuery = true , value = "select mh.* from mon_hoc mh join student s on mh.student_id = s.id where mh.ten_mon_hoc like concat('%' ,:tenMonHoc ,'%') and (mh.student_id = :idMonHoc or :idMonHoc = -1) ",
            countQuery ="select count(*) from(select mh.* from mon_hoc mh join student s on mh.student_id = s.id where mh.ten_mon_hoc like concat('%' ,:tenMonHoc ,'%') and (mh.student_id = :idMonHoc or :idMonHoc = -1)) temp" )
    Page<MonHoc>getAllMonHocPage(Pageable pageable, @Param("tenMonHoc") String tenMonHoc , @Param("idMonHoc") Integer idMonHoc);
}
