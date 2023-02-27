package com.example.sandwich;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {
    @GetMapping("home")
    public String showForm(){
        return "home";
    }
    @PostMapping("/save")
    public String save(@RequestParam("condiment")String[]comdiment){
        model.addAttri
    }


}
