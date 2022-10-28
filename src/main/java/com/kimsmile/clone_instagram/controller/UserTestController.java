package com.kimsmile.clone_instagram.controller;

import com.kimsmile.clone_instagram.Dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserTestController {

    @GetMapping("/test")
    public String getUser(Model model) {
        User user = new User("user","1234","테스터","관리자");
        model.addAttribute("user",user);
        return "test";
    }
}
