package com.example.program_email.controller;


import com.example.program_email.model.Settings;
import com.example.program_email.service.ISettingSerivice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SettingController {
    @Autowired
    private ISettingSerivice settingSerivice;

    @ModelAttribute("languages")
    public String[] arrayLanguagues() {
        return new String[]{"english", "VietNamese", "janpan"};
    }

    @ModelAttribute("pageSize")
    public String[] arrayPageSize() {
        return new String[]{"5", "6", "7"};
    }

    @GetMapping("list")
    public String showList(Model model) {
        model.addAttribute("listSetting", settingSerivice.finAll());
        return "list";
    }
    @GetMapping("update-form/{id}")
    public String showSetting(@PathVariable("id")int id,Model model){
        Settings settings = settingSerivice.findById(id);
        model.addAttribute("setting",settings);
        return "edit";
    }
    @PostMapping("/newUpdate")
    public String save (@ModelAttribute("setting") Settings settings, RedirectAttributes redirectAttributes){
        settingSerivice.update(settings);
        return "redirect:list";
    }
}
