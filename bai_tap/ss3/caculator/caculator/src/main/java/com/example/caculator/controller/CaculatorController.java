package com.example.caculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaculatorController {
    @GetMapping("")
    public String showForm() {
        return "home";
    }

    @PostMapping("result")
    public String resultCaculator(@RequestParam("number1") int number1, @RequestParam("number2") int number2, @RequestParam("caculator") String caculator, Model model) {
        int result = 0;
        String msg = "Can not divide";
        switch (caculator) {
            case "add(+)":
                result = number1 + number2;
                break;
            case "sub(-)":
                result = number1 - number2;
                break;
            case "multi(*)":
                result = number1*number2;
                break;
            case "divi(/)":
                if (number2==0){
                    model.addAttribute("msg",msg);
                    return "home";
                }else {
                    result =number1/number2;
                }
                break;
            default:
                model.addAttribute("msg","need to enter caculator");
                return "home";
        }
        model.addAttribute("resultName",result);
        return msg;
    }
}
