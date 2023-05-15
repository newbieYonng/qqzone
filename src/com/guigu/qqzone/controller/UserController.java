package com.guigu.qqzone.controller;

import com.guigu.qqzone.pojo.Topic;
import com.guigu.qqzone.pojo.UserBasic;
import com.guigu.qqzone.service.TopicService;
import com.guigu.qqzone.service.UserBasicService;

import javax.servlet.http.HttpSession;
import java.util.List;

public class UserController {

    private UserBasicService userBasicService;
    private TopicService topicService;

    public String login(String loginID, String pwd, HttpSession session) {
        UserBasic userBasic = userBasicService.login(loginID, pwd);
        if (userBasic != null) {
            //获取好友
            List<UserBasic> friendList = userBasicService.getFriendList(userBasic);
            //获取日志
            List<Topic> topicList = topicService.getTopicList(userBasic);

            userBasic.setFriendList(friendList);
            userBasic.setTopicList(topicList);

            //userBasic这个key保存的是登陆者的信息
            //friend这个key保存的是当前进入的是谁的空间
            session.setAttribute("userBasic",userBasic);
            session.setAttribute("friend",userBasic);

            return "index";
        } else {
            return "login";
        }
    }

    public String friend(Integer id, HttpSession session) {
        //根据ID获取对应的userBasic
        UserBasic userBasic = userBasicService.getUserBasicByID(id);
        //获取日志
        List<Topic> topicList = topicService.getTopicList(userBasic);

        userBasic.setTopicList(topicList);

        session.setAttribute("friend",userBasic);

        return "index";
    }


}
