package com.example.template.controller;


import com.example.template.model.MailBox;
import com.example.template.service.IMailBoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/mailbox")
public class MailBoxController {

    @Autowired
    private IMailBoxService mailBoxService;

    @GetMapping(value = "/show")
    public String showForm( Model model){
        model.addAttribute("mailBox",mailBoxService.getMailBox());
        return "/info";
    }
    @GetMapping(value = "/showFormUpdate")
    public ModelAndView showFormUpdate(Model model){
        List<String> languagesList = mailBoxService.getLanguageList();
        List<Integer> pageSizeList = mailBoxService.getPageSizeList();
        MailBox mailBox = mailBoxService.getMailBox();
        model.addAttribute("mailBox",mailBox);
        model.addAttribute("languagesList",languagesList);
        model.addAttribute("pageSizeList",pageSizeList);
        return new ModelAndView("/update");
    }
    @PostMapping(value = "/updateMailBox")
    public String updateMailBox(@ModelAttribute MailBox mailBox){
        mailBoxService.updateMailBox(mailBox);
        return "/info";
    }
}
