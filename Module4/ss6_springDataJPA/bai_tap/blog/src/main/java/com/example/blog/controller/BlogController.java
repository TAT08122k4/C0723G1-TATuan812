package com.example.blog.controller;

import com.example.blog.modal.Blog;
import com.example.blog.modal.Category;
import com.example.blog.service.IBlogService;
import com.example.blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private IBlogService blogService;
    @Autowired
    private ICategoryService categoryService;

    @GetMapping("")
    public String showList(@RequestParam(defaultValue = "0") int page,
                           @RequestParam(defaultValue =  "") String searchName,
                           Model model){
        Pageable pageable =  PageRequest.of(page,2, Sort.by("time_to_create_blog").ascending());

        Page<Blog> blogPage = blogService.displayAllBlog(searchName,pageable);
        model.addAttribute("blogPage",blogPage);
        model.addAttribute("searchName",searchName);
        List<Blog> blogList = blogService.displayAllBlog();
        Blog blog = new Blog();
        Category category = new Category();
        model.addAttribute("blog",blog);
        model.addAttribute("blogs",blogList);
        model.addAttribute("categorys",categoryService.findAll());
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
        blog.setTimeToCreateBlog(LocalDateTime.now());
        model.addAttribute("categorys",categoryService.findAll());
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
        model.addAttribute("categorys",categoryService.findAll());
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
    @PostMapping("/searchByCategory{id}")
    public String searchBYCategory(Blog blog , Model model){
        List<Blog> blogList = blogService.findCategoriesById(blog.getCategory().getId());
        model.addAttribute("blogs",blogList);
        return "/blog/home";
    }


}
