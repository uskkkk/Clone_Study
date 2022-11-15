package com.kimsmile.clone_instagram.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    /*유저 넘버*/
    private int userNo;
    /*유저 이메일*/
    private String userEmail;
    /*유저 비밀번호*/
    private String userPassword;
    /*유저 휴대전화번호*/
    private String userPhone;
    /*유저 성별*/
    private String userGender;
    /*유저 생일*/
    private String userBirth;
    /*유저 이름*/
    private String userName;
    /*유저 웹사이트*/
    private String userWebsite;
    /*유저 소개*/
    private String userIntroduce;
    /*유저 이미지*/
    private String userImage;

}
