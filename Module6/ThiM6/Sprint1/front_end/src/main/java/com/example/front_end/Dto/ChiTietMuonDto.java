package com.example.front_end.Dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChiTietMuonDto {
    int soLuongMuon;
    LocalDate ngayMuon;
    LocalDate ngayTra;
    int nhanVienId;
    int congCuId;

}
