package com.kimsmile.clone_instagram.service.impl;

import com.kimsmile.clone_instagram.Dto.User;
import com.kimsmile.clone_instagram.mapper.UserMapper;
import com.kimsmile.clone_instagram.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserSerivce {

    @Autowired
    public UserMapper userMapper;

    @Autowired
    public PasswordEncoder passwordEncoder;


    @Override
    public void insertUser(User user) {

        user.setUserPassword(passwordEncoder.encode(user.getUserPassword()));
        userMapper.insertUser(user);
    }
}
