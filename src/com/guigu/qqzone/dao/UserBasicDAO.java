package com.guigu.qqzone.dao;

import com.guigu.qqzone.pojo.UserBasic;

import java.util.List;

public interface UserBasicDAO {
    //根据账号和密码获取用户信息
    UserBasic getUserBasic(String loginID, String pwd);
    //获取用户的左右好友列表
    List<UserBasic> getUserBasicList(UserBasic userBasic);
    //根据ID查询UserBasic信息
    UserBasic getUserBasicByID(Integer id);
}
