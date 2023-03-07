package com.example.validate.controller;

import com.example.validate.dto.UserDto;
import com.example.validate.model.User;
import com.example.validate.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;
    @GetMapping("/user")
    public String showAll(Model model){
        model.addAttribute("userDto",userService.findAll());
        return "list";
    }
    @GetMapping("/user/create")
    public String showFormCreate(Model model){
        model.addAttribute("userDto",new UserDto());
        return "create";
    }
    @PostMapping("/user/save")
    public String save(@Valid @ModelAttribute UserDto userDto,
                       BindingResult bindingResult,
                       RedirectAttributes attributes, Model model) {
        User user = new User();
        new UserDto().validate(userDto, bindingResult);

        if (bindingResult.hasErrors()) {
            model.addAttribute("userDto", userDto);
            return "create";
        }
        else {
            BeanUtils.copyProperties(userDto, user);
            attributes.addFlashAttribute("msg", "Tạo mới thành công");
            if (!userService.save(user)) {
                bindingResult.rejectValue("email", "email", "Email is available");
                return "create";
            }
            else {
                attributes.addFlashAttribute("msg"," thành công");
            }
            return "redirect:/user";
        }
    }
}
