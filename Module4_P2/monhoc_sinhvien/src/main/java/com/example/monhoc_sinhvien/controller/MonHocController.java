package com.example.monhoc_sinhvien.controller;


import com.example.monhoc_sinhvien.dto.MonHocDto;
import com.example.monhoc_sinhvien.model.MonHoc;
import com.example.monhoc_sinhvien.service.IMonHocService;
import com.example.monhoc_sinhvien.service.IStudentService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/monHoc")
public class MonHocController {
    @Autowired
    IMonHocService iMonHocService;
    @Autowired
    IStudentService iStudentService;

    @GetMapping("")
    public String displayAll(@RequestParam(value = "page",defaultValue = "0") Integer page ,
                             @RequestParam(value = "size",defaultValue = "1") Integer size,
                             @RequestParam(value = "tenMonHoc", required = false, defaultValue = "") String tenMonHoc,
                             @RequestParam(value = "idMonHoc", required = false,  defaultValue = "-1") Integer idMonHoc,
                             @RequestParam(value = "sortBy",  required = false, defaultValue = "so_diem") String sortBy,
                             @RequestParam(value = "sortDirection",required = false,defaultValue = "ASC") String sortDicrection, Model model){
        Pageable pageable = PageRequest.of(page,size, Sort.Direction.valueOf(sortDicrection) , sortBy);
        Page<MonHoc> monHocs = iMonHocService.getAllMonHocPage(pageable,tenMonHoc,idMonHoc);
        model.addAttribute("monHocs",monHocs);
        model.addAttribute("tenMonHoc",tenMonHoc);
        model.addAttribute("idMonHoc",idMonHoc);
        return "index";
    }
    @GetMapping("/add")
    public String showFormAddNew(Model model){
        MonHocDto monHocDto = new MonHocDto();
        model.addAttribute("monHocDto",monHocDto);
        model.addAttribute("students",iStudentService.findAll());
        model.addAttribute("students",iStudentService.findAll());
        return "addNew";
    }
    @PostMapping("/add")
    public String addNew(@Valid @ModelAttribute("monHocDto")MonHocDto monHocDto , BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            return "/addNew";
        }else {
            MonHoc monHoc = new MonHoc();
            BeanUtils.copyProperties(monHocDto,monHoc);
            iMonHocService.save(monHoc);

            return "redirect:/monHoc";
        }
    }
    @GetMapping("/edit/{id}")
    public String showFormEdit(Model model,@PathVariable int id){
        MonHoc monHoc = iMonHocService.findById(id);
        MonHocDto monHocDto = new MonHocDto();
        BeanUtils.copyProperties(monHoc,monHocDto);
        model.addAttribute("monHocDto",monHocDto);
        model.addAttribute("students",iStudentService.findAll());
        return "edit";
    }
    @PostMapping("/edit")
    public String editMonHoc(@Valid @ModelAttribute("monHocDto") MonHocDto monHocDto , BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            return "edit";
        }
        MonHoc monHoc = new MonHoc();
        BeanUtils.copyProperties(monHocDto,monHoc);
        iMonHocService.save(monHoc);
        return "redirect:/monHoc";
    }
}
