package com.kimsmile.clone_instagram.mapper;

import com.kimsmile.clone_instagram.Dto.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    public String insertUser(User user);
}
