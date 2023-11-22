package com.example.blog.controller;

import com.example.blog.modal.Blog;
import com.example.blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private IBlogService blogService;
    @GetMapping("")
    public String showList(Model model){
        List<Blog> blogList = blogService.displayAllBlog();
        model.addAttribute("blogs",blogList);
        return "/blog/home";
    }
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable() int id , Model model){
        Blog blog = blogService.showDetail(id);
        model.addAttribute("blogDetail",blog);
      return "/blog/detail";
    }
    @GetMapping("/add")
    public String add(Model model){
        Blog blog = new Blog();
        model.addAttribute("blog",blog);
        return "/blog/add";
    }
    @PostMapping("/add")
    public String save(Blog blog){
        blogService.addNewBlog(blog);
        return "redirect:/blog";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam() int id){
        blogService.remove(id);
        return "redirect:/blog";
    }
    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable()int id,Model model ){
        model.addAttribute("blogEdit",blogService.showDetail(id));
        return "/blog/edit";
    }
    @PostMapping("/edit")
    public String edit(int id,Blog blog ){
        Blog blog1 = blogService.showDetail(id);
        blog1 = blog;
        blogService.addNewBlog(blog1);
        return "redirect:/blog";
    }

}
