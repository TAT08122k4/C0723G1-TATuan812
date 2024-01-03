package com.example.quan_ly_student_ss3.controller;


import com.example.quan_ly_student_ss3.model.Student;
import com.example.quan_ly_student_ss3.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private IStudentService iStudentService;
    @GetMapping("")
    public String displayALlStudent(Model model){
        model.addAttribute("students",iStudentService.displayAll());
        return "/home";
    }
    @GetMapping("/add")
    public String showFormAdd(Model model){
        model.addAttribute("student",new Student());
        return "/add";
    }
    @PostMapping("/add")
    public String addNewStudent(Student student,Model model){
       if (iStudentService.findById(student.getId()) != null){
           model.addAttribute("message","sai");
           return "/add";
       }
        iStudentService.addNewStudent(student);
       return "redirect:/student";
    }
    @PostMapping("/delete")
    public String delete(@RequestParam int idDelete){
        iStudentService.deleteStudent(idDelete);
        return "redirect:/student";
    }
    @GetMapping("/edit/{id}")
    public String showFormEdit(@PathVariable int id , Model model){
        Student student = iStudentService.findById(id);
        model.addAttribute("student",student);
        return "/edit";
    }
    @PostMapping("edit")
    public String editStudent(@RequestParam int id,Student student){
        iStudentService.editStudent(id,student);
        return "redirect:/student";
    }
    @GetMapping("/search")
    public String searchByGender(@RequestParam String gender , Model model){
        if (gender.contains("All")){
            model.addAttribute("students",iStudentService.displayAll());
            return "/home";
        }
        model.addAttribute("students",iStudentService.searchByGender(gender));
        return "/home";
    }
}
