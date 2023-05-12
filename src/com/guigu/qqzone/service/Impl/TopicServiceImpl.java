package com.guigu.qqzone.service.Impl;

import com.guigu.qqzone.dao.TopicDAO;
import com.guigu.qqzone.pojo.Topic;
import com.guigu.qqzone.pojo.UserBasic;
import com.guigu.qqzone.service.TopicService;

import java.util.List;

public class TopicServiceImpl implements TopicService {

    private TopicDAO topicDAO;

    @Override
    public List<Topic> getTopicList(UserBasic userBasic) {
        return topicDAO.getTopicList(userBasic);
    }
}
