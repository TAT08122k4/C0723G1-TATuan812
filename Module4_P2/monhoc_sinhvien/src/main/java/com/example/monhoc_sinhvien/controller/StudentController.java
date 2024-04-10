package com.example.monhoc_sinhvien.controller;


import com.example.monhoc_sinhvien.model.Student;
import com.example.monhoc_sinhvien.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    IStudentService iStudentService;
    @GetMapping("")
    public String displayAllStudent(Model model , @RequestParam(value = "page",defaultValue = "0") Integer page ,
                                    @RequestParam(value = "size",defaultValue = "1") Integer size ,
                                @RequestParam(value = "tenHocVien",required = false,defaultValue = "") String tenHocVien ,
                                    @RequestParam(value = "idMonHoc",required = false,defaultValue = "-1") Integer idMonHoc ,
                                    @RequestParam(value = "sortBy" , required = false , defaultValue = "id") String sortBy,
                                    @RequestParam(value = "sortDirection", required = false , defaultValue = "ASC") String sortDirection){
        Pageable pageable = PageRequest.of(page,size, Sort.Direction.valueOf(sortDirection),sortBy);
        Page<Student> students = iStudentService.getAllStudentPage(pageable , tenHocVien , idMonHoc);
        model.addAttribute("students",students);
        model.addAttribute("tenHocVien",tenHocVien);
        model.addAttribute("idMonHoc",idMonHoc);
        return "listStudent";

    }
}
