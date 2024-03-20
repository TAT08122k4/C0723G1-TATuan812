package com.example.front_end.controller;

import com.example.front_end.Dto.ChiTietMuonDto;
import com.example.front_end.model.ChiTietMuon;
import com.example.front_end.model.CongCu;
import com.example.front_end.model.NhanVien;
import com.example.front_end.service.IChiTietMuonService;
import com.example.front_end.service.ICongCuService;
import com.example.front_end.service.INhanVienMuonService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@RestController
@CrossOrigin("*")
@RequestMapping("/chitiet")
public class ChiTietMuonRestController {
    @Autowired
    INhanVienMuonService iNhanVienMuonService;
    @Autowired
    IChiTietMuonService iChiTietMuonService;
    @Autowired
    ICongCuService iCongCuService;

    @PostMapping("/muon")
    public ResponseEntity<?> muonCongCu(@RequestBody @Valid ChiTietMuonDto chiTietMuonDto){
        Map<String,String> erros = new HashMap<>();
       NhanVien nhanVien = iNhanVienMuonService.findById(chiTietMuonDto.getNhanVienId());
        CongCu congCu = iCongCuService.findByIdCongCu(chiTietMuonDto.getCongCuId());
        ChiTietMuon chiTietMuon = new ChiTietMuon();
        BeanUtils.copyProperties(chiTietMuonDto,chiTietMuon);
//        congCu.setSoLuong(congCu.getSoLuong() - chiTietMuonDto.getSoLuongMuon());
//        if (congCu.getSoLuong() == 0){
//          erros.put("soLuong","Đã Hết");
//        }else if (chiTietMuon.getSoLuongMuon() > congCu.getSoLuong()){
//            erros.put("soLuongMuon","Số Lương Không Đủ");
//        }
//        if (erros.size() > 0){
//            return new ResponseEntity<>(erros,HttpStatus.BAD_REQUEST);
//        }
        LocalDate localDate = LocalDate.now();
        chiTietMuon.setNgayMuon(localDate);
        chiTietMuon.setNgayTra(localDate);
        chiTietMuon.setNhanVien(nhanVien);
        chiTietMuon.setCongCu(congCu);
        iChiTietMuonService.save(chiTietMuon);
        return new ResponseEntity<>(HttpStatus.OK);


    }


    @GetMapping("/nhanVien")
    public ResponseEntity<?> danhSachNhanVien(){
        List<NhanVien> nhanVienList = iNhanVienMuonService.nhanVienList();
        if (nhanVienList.size() > 0){
            return new ResponseEntity<>(nhanVienList,HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

    }
}
