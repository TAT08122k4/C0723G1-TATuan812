package com.example.front_end.controller;


import com.example.front_end.model.HangSanXuat;
import com.example.front_end.service.IHangSanXuatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/hangsanxuat")
public class HangSanXuatRestController {
    @Autowired
    IHangSanXuatService iHangSanXuatService;

    @GetMapping("/danhSach")
    public ResponseEntity<?> hienThiDanhSach(){
        List<HangSanXuat> hangSanXuats = iHangSanXuatService.getList();
        if (hangSanXuats.size() > 0){
            return new ResponseEntity<>(hangSanXuats,HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

}
