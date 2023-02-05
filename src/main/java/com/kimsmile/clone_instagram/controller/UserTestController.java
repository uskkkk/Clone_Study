package com.kimsmile.clone_instagram.controller;

import com.kimsmile.clone_instagram.Dto.User;
import com.kimsmile.clone_instagram.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserTestController {

    @Autowired
    public UserSerivce userSerivce;

    @PostMapping("user")
    public void insertUser(Model model, User user) {
        if(user == null) {
            new NullPointerException("유저가 들어오지 않았습니다...");
        }
        userSerivce.insertUser(user);

    }
    @GetMapping("user")
    public String insertUser() {
        return "user/user";
    }


    @GetMapping("test")
    public String test(Model model) {
        User user = new User();

        user.setUserName("조윤정");
        user.setUserNo(1);
        user.setUserGender("Woman");
        user.setUserPhone("010-9918-3594");

        model.addAttribute("user",user);

        return "user/test";
    }

    @GetMapping(value = "login")
    public String login() {
        return "user/login";
    }
}
