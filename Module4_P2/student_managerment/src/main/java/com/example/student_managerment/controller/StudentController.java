package com.example.student_managerment.controller;


import com.example.student_managerment.dto.StudentDTO;
import com.example.student_managerment.model.Student;
import com.example.student_managerment.service.IStudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    IStudentService iStudentService;

    @GetMapping("")
    public String displayAll(@RequestParam(defaultValue = "0") int page ,
                             @RequestParam(defaultValue = "") String searchName,
                             Model model){
        Pageable pageable = PageRequest.of(page,2);
        Page<Student> studentPage = iStudentService.displayAllStudent(searchName,pageable);
        model.addAttribute("studentPage",studentPage);
        return "/home";

    }
    @GetMapping("/add")
    public String showFormAddNew(Model model){
        model.addAttribute("StudentDTO",new StudentDTO());
        return "add";
    }
    @PostMapping("/add")
    public String addNewStudent(@Valid @ModelAttribute StudentDTO studentDTO , BindingResult bindingResult , RedirectAttributes redirectAttributes) {


        return "redirect:/home";
    }

}
