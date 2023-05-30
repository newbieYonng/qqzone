package com.guigu.qqzone.service;

import com.guigu.qqzone.pojo.Reply;
import com.guigu.qqzone.pojo.Topic;

import java.util.List;

public interface ReplyService {

    List<Reply> getReplyListByTopicId(Integer id);

    void addReply(Reply reply);

    void delReply(Integer id);

    void delReplyList(Topic topic);
}
