package com.example.product.controller;

import com.example.product.dto.CartDto;
import com.example.product.dto.ProductDto;
import com.example.product.model.Product;
import com.example.product.service.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/shop")
@SessionAttributes("cart")
public class ProductController {
    @ModelAttribute("cart")
    public CartDto initCard() {
        System.out.println("Hello");
        return new CartDto();
    }

    @Autowired
    private IProductService productService;

    @GetMapping("")
    public String showList(Model model,@SessionAttribute(value = "cart",required = false) CartDto cart,
                           @CookieValue(value = "id", required = false, defaultValue = "-1") Long id) {
        model.addAttribute("productHistory", productService.findById(id));
        model.addAttribute("productList", productService.findAll());
        if (cart==null){
            System.out.println("Hello baf giaf");
        }else {
            model.addAttribute("cart",cart);
            System.out.println("Da tao");
        }
        return "list";
    }

    @GetMapping("/detail/{id}")
    public String showProductHistory(@PathVariable Long id, HttpServletResponse response, Model model) {
        Cookie cookie = new Cookie("id", id + "");
        cookie.setMaxAge(1 * 24 * 60 * 60);
        cookie.setPath("/");
        response.addCookie(cookie);
        model.addAttribute("product", productService.findById(id));
        return "detail";
    }

    @GetMapping("/add/{id1}")
    public String addProductInCart(@PathVariable Long id1, @SessionAttribute(value = "cart") CartDto cart) {
        Product product = productService.findById(id1);
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(product, productDto);
        cart.addProduct(productDto);
        return "redirect:/cart";
    }

    @GetMapping("/decrease/{id2}")
    public String descreaseProductInCard(@PathVariable Long id2, @SessionAttribute(value = "cart") CartDto cart) {
        Product product = productService.findById(id2);
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(product, productDto);
        cart.decrease(productDto);
        return "redirect:/cart";
    }

    @GetMapping("/delete/{id3}")
    public String removeProductDto(@PathVariable Long id3, @SessionAttribute("cart") CartDto cart) {
        Product product = productService.findById(id3);
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(product, productDto);
        cart.remove(productDto);
        return "redirect:/cart";
    }
}