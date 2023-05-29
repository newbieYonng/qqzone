package com.guigu.qqzone.service;

import com.guigu.qqzone.pojo.Reply;

import java.util.List;

public interface ReplyService {

    List<Reply> getReplyListByTopicId(Integer id);

    void addReply(Reply reply);
}
