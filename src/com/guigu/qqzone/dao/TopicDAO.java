package com.guigu.qqzone.dao;

import com.guigu.qqzone.pojo.Topic;
import com.guigu.qqzone.pojo.UserBasic;

import java.util.List;

public interface TopicDAO {
    //获取指定用户日志列表
    List<Topic> getTopicList(UserBasic userBasic);
    //添加日志
    void addTopic(Topic topic);
    //删除日志
    void delteTopic(Topic topic);
    //获取指定日志信息
    Topic getTopic(Integer id);
}
