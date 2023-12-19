package com.example.simple_dictionary.Controller.Controller;

import com.example.simple_dictionary.Controller.Service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @Autowired
    private IDictionaryService dictionaryService;
@GetMapping(value = "/dictionary")
    public String showForm(){
    return "/dictionary";
}
@PostMapping(value = "/dictionary")
    public String translate(@RequestParam String englishWord, Model model) {
    model.addAttribute("wordTranslate",dictionaryService.translate(englishWord));
    return "/dictionary";
}
}
