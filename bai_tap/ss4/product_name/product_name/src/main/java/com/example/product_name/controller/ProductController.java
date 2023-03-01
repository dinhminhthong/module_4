package com.example.product_name.controller;

import com.example.product_name.model.Product;
import com.example.product_name.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private IProductService productService;
    @GetMapping("")
    public String showList(@RequestParam(name = "searchName",required = false, defaultValue = "")String searchName,Model model){
        model.addAttribute("products",productService.findAll(searchName));
        return "/list";
    }
    @GetMapping("/create-form")
    public String getCreate(Model model){
        model.addAttribute("product",new Product());
        return "/create";
    }
    @PostMapping("/create")
    public String postCreate(@ModelAttribute Product product,Model model){
        this.productService.create(product);
        return "redirect:/products";
    }
    @GetMapping("/delete")
    public String getDelete(@RequestParam(required = false) Integer id, Model model){
        productService.remove(id);
        return "redirect:/products";
    }
    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/edit";
    }

    @PostMapping("products/edit")
    public String update(Product product) {
        productService.edit(product.getId(), product);
        return "redirect:/products";
    }
}
