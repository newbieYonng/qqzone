package com.guigu.qqzone.service;

import com.guigu.qqzone.pojo.Topic;
import com.guigu.qqzone.pojo.UserBasic;

import java.util.List;

public interface TopicService {

    //查询特定用户的日志列表
    List<Topic> getTopicList(UserBasic userBasic);
}
