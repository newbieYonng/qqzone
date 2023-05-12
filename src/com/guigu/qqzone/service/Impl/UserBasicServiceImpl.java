package com.guigu.qqzone.service.Impl;

import com.guigu.qqzone.dao.UserBasicDAO;
import com.guigu.qqzone.pojo.UserBasic;
import com.guigu.qqzone.service.UserBasicService;

import java.util.ArrayList;
import java.util.List;

public class UserBasicServiceImpl implements UserBasicService {

    private UserBasicDAO userBasicDAO;

    @Override
    public UserBasic login(String loginID, String pwd) {
        UserBasic userBasic = userBasicDAO.getUserBasic(loginID, pwd);
        return userBasic;
    }

    @Override
    public List<UserBasic> getFriendList(UserBasic userBasic) {
        ArrayList<UserBasic> userBasics = new ArrayList<>();
        List<UserBasic> userBasicList = userBasicDAO.getUserBasicList(userBasic);
        for (UserBasic user : userBasicList) {
            UserBasic friend = userBasicDAO.getUserBasicByID(user.getId());
            userBasics.add(friend);
        }
        return userBasics;
    }
}
