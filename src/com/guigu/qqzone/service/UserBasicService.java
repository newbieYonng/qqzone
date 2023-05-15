package com.guigu.qqzone.service;

import com.guigu.qqzone.pojo.UserBasic;

import java.util.List;

public interface UserBasicService {
    UserBasic login(String loginID, String pwd);
    List<UserBasic> getFriendList(UserBasic userBasic);
    UserBasic getUserBasicByID(Integer id);
}
