package com.example.front_end.controller;


import com.example.front_end.Dto.CongCuDTO;
import com.example.front_end.model.CongCu;
import com.example.front_end.model.HangSanXuat;
import com.example.front_end.repository.ICongCuRepository;
import com.example.front_end.service.ICongCuService;
import com.example.front_end.service.IHangSanXuatService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/congCu")
public class CongCuRestController {
    @Autowired
    ICongCuService iCongCuService;
    @Autowired
    IHangSanXuatService iHangSanXuatService;
    @GetMapping("/danhSach")
    public ResponseEntity<?> hienThiDanhSach(){
        List<CongCu> congCuList = iCongCuService.danhSachCongCu();
        if (congCuList.size() > 0){
            return new ResponseEntity<>(congCuList, HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

    }

    @PostMapping("/themMoi")
    public ResponseEntity<?> themMoiCongCu(@RequestBody @Valid CongCuDTO congCuDTO , BindingResult bindingResult){
            if (bindingResult.hasFieldErrors()){
       return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }else {
            HangSanXuat hangSanXuat = iHangSanXuatService.findById(congCuDTO.getHangSanXuatId());
            CongCu congCu = new CongCu();
            BeanUtils.copyProperties(congCuDTO,congCu);
            congCu.setHangSanXuat(hangSanXuat);
            iCongCuService.themMoiCongCu(congCu);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> layCongCu(@PathVariable int id){
        CongCu congCu = iCongCuService.findByIdCongCu(id);
        if (congCu == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(congCu,HttpStatus.OK);
        }
    }
}
