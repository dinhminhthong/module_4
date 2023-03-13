package com.example.blog_s2.controller;

import com.example.blog_s2.model.Blog;
import com.example.blog_s2.service.BlogService;
import com.example.blog_s2.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BlogController {
    @Autowired
    private BlogService blogService;
    @Autowired
    private CategoryService categoryService;
//xem danh sách ứng dụng blogs
    @GetMapping("")
    public String showList(Model model, @RequestParam(required = false,defaultValue = "")
                           String nameSearch, @PageableDefault(size = 2,page = 0,sort = "date",direction = Sort.Direction.ASC)Pageable pageable){
        Page<Blog> blogList=blogService.findByNameContaining(nameSearch,pageable);
        model.addAttribute("blogList",blogList);
        model.addAttribute("nameSearch",nameSearch);
        if(blogService.findAll().isEmpty()){
            model.addAttribute("mess","danh sách trống");
        }
        return "list";
    }
}
