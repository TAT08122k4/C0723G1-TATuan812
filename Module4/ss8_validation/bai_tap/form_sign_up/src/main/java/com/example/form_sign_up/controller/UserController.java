package com.example.form_sign_up.controller;


import com.example.form_sign_up.dto.UserDTO;
import com.example.form_sign_up.model.User;
import com.example.form_sign_up.service.IUserService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService iUserService;
    @GetMapping("")
    public String showForm(Model model){
        UserDTO userDTO = new UserDTO();
        model.addAttribute("userDTO",userDTO);
        return "/index";
    }
    @PostMapping("")
    public String save(@Valid @ModelAttribute UserDTO userDTO, BindingResult bindingResult, RedirectAttributes attributes){
        User user1 = new User();
        new UserDTO().validate(userDTO,bindingResult);
        if (bindingResult.hasFieldErrors()){
            return "index";
        }
        BeanUtils.copyProperties(userDTO,user1);
        iUserService.save(user1);
        attributes.addFlashAttribute("mess","add new Success");
        return "/result";
    }

}
