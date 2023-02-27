package com.example.dictionary;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/cambridge")
public class CambridgeDictionary {
    @GetMapping("")
    public String cambridge(@RequestParam(required = false) String english, Model model){
        Map<String,String> stringMap = new HashMap<>();
        stringMap.put("Dog","Chó");
        stringMap.put("Cat","Mèo");
        stringMap.put("House","Ngôi nhà");
        if(english==null){
            return "/dictionary";

        }
        model.addAttribute("english",english);
        model.addAttribute("result",stringMap.get(english));
        return "/dictionary";
    }
}
