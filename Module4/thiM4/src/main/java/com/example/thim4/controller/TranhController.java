package com.example.thim4.controller;


import com.example.thim4.dto.TranhDto;
import com.example.thim4.model.TheLoai;
import com.example.thim4.model.Tranh;
import com.example.thim4.service.ITheLoaiService;
import com.example.thim4.service.ITranhService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("tranh")
public class TranhController {
    @Autowired
    ITranhService iTranhService;
    @Autowired
    ITheLoaiService iTheLoaiService;

    @GetMapping("")
    public String hienThi(Model model){
        List<Tranh> tranhList = iTranhService.hienThiTacPham();
        List<TheLoai> theLoaiList = iTheLoaiService.hienThiTheLoai();
        model.addAttribute("theLoai",theLoaiList);
        model.addAttribute("tranhs",tranhList);
        return "home";
    }
    @GetMapping("/add")
    public String hienThiThemMoi(Model model){
        TranhDto tranh = new TranhDto();
        List<TheLoai> theLoaiList = iTheLoaiService.hienThiTheLoai();
        model.addAttribute("theLoai",theLoaiList);
        model.addAttribute("tranh",tranh);
        return "add";
    }
    @PostMapping("/add")
    public String themMoi(@ModelAttribute TranhDto tranhDto){
        Tranh tranh = new Tranh();
        BeanUtils.copyProperties(tranhDto,tranh);
        iTranhService.themTacPham(tranh);
        return "redirect:/tranh";
    }
    @GetMapping("/delete")
    public String xoaTacPham(@RequestParam int idTranh){
        iTranhService.xoaTacPham(idTranh);
        return "redirect:/tranh";
    }
}
