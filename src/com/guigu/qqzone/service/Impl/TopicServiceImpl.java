package com.guigu.qqzone.service.Impl;

import com.guigu.qqzone.dao.TopicDAO;
import com.guigu.qqzone.pojo.Reply;
import com.guigu.qqzone.pojo.Topic;
import com.guigu.qqzone.pojo.UserBasic;
import com.guigu.qqzone.service.ReplyService;
import com.guigu.qqzone.service.TopicService;
import com.guigu.qqzone.service.UserBasicService;

import java.util.List;

public class TopicServiceImpl implements TopicService {

    private TopicDAO topicDAO;
    //此处引用的是replyService，而不是replyDAO
    private UserBasicService userBasicService;
    private ReplyService replyService;

    @Override
    public List<Topic> getTopicList(UserBasic userBasic) {
        return topicDAO.getTopicList(userBasic);
    }

    @Override
    public Topic getTopicById(Integer id) {
        /*
        topic还有以下两个属性,topic只有对应id
        private UserBasic author;
        private List<Reply> replyList;
         */
        Topic topic = topicDAO.getTopic(id);
        UserBasic author = userBasicService.getUserBasicByID(topic.getAuthor().getId());
        topic.setAuthor(author);
        List<Reply> replyList = replyService.getReplyListByTopicId(topic.getId());
        topic.setReplyList(replyList);

        return topic;
    }
}
