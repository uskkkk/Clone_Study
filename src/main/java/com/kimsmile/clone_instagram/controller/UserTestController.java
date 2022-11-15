package com.kimsmile.clone_instagram.controller;

import com.kimsmile.clone_instagram.Dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserTestController {

    @PostMapping("/user")
    public void insertUser(Model model, User user) {

    }
}
