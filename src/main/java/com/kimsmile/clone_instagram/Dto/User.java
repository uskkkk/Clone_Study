package com.kimsmile.clone_instagram.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String userId;
    private String userPw;
    private String name;
    private String authType;


}
