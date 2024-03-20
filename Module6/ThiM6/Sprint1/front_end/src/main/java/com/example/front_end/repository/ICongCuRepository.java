package com.example.front_end.repository;

import com.example.front_end.model.CongCu;
import com.example.front_end.model.HangSanXuat;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ICongCuRepository  extends JpaRepository<CongCu,Integer> {

    @Query(nativeQuery = true , value = "select cc.don_vi , cc.so_luong , cc.ten_cong_cu , hsx.ten_hang_san_xuat from cong_cu cc join hang_san_xuat hsx on cc.hang_san_xuat_id = hsx.id " +
            "where cc.ten_cong_cu like :tenCongCu or hang_san_xuat_id = :idHsx")
    Page<CongCu> searchCongCuAndPage(@Param("tenCongCu") String tenCongCu , @Param("idHsx") int idHsx , Pageable pageable);
}