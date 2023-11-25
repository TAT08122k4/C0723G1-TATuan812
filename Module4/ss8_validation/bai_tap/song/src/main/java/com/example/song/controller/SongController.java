package com.example.song.controller;


import com.example.song.dto.SongDto;
import com.example.song.model.Song;
import com.example.song.service.ISongService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;

@Controller
@RequestMapping("/song")
public class SongController {
    @Autowired
    private ISongService iSongService;

    @GetMapping("")
    public String showAllSong(Model model){
        model.addAttribute("songs",iSongService.getAll());
        return "/index";
    }
    @GetMapping("/add")
    public String showFormAdd(Model model){
        model.addAttribute("songDto",new SongDto());
        return "/add";
    }
    @PostMapping("/add")
    public String addNewSong(@Valid @ModelAttribute SongDto songDto,
                             BindingResult bindingResult){
      if (bindingResult.hasFieldErrors()){
          return "add";
      }else {
          Song song = new Song();
          BeanUtils.copyProperties(songDto,song);
          iSongService.addNewSong(song);
          return "redirect:/song";
      }
    }
    @GetMapping("/edit{id}")
    public String showFormEdit(@PathVariable int id ,Model model){
        model.addAttribute("songDto",new SongDto());
        return "edit";
    }
    @PostMapping("/edit")
    public String editSong(@Valid @ModelAttribute SongDto songDto,BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            return "edit";
        }else {
            Song song = new Song();
            BeanUtils.copyProperties(songDto,song);
            iSongService.editSong(song);
            return "redirect:song";
        }

    }


}
