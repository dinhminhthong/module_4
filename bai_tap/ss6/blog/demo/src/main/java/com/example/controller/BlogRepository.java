package com.example.controller;

import com.example.model.Blog;
import com.example.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller

public class BlogRepository {
    @Autowired
    private IBlogService blogService;
    @GetMapping("")
    public String showAll(Model model){
        model.addAttribute("blogs",blogService.findAll());
        return "list";
    }
    @GetMapping("/blog/create")
    public String create(Model model) {
        model.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping("/blog/save")
    public String save(Blog blog, RedirectAttributes redirectAttributes) {
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("mess", "successfully added new");
        return "redirect:/";
    }

    @GetMapping("/blog/delete")
    public String delete(@RequestParam int id, RedirectAttributes redirectAttributes) {
        blogService.delete(id);
        redirectAttributes.addFlashAttribute("mess", "successfully deleted");
        return "redirect:/";
    }
    @GetMapping("/blog/{id}/edit")
    public String edit(@PathVariable int id, Model model){
        model.addAttribute("blog",blogService.findById(id).get());
        return "edit";
    }

    @GetMapping("/blog/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id).get());
        return "view";
    }
}
