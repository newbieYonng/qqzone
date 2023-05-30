package com.guigu.qqzone.dao;

import com.guigu.qqzone.pojo.Reply;

import java.util.List;

public interface ReplyDAO {

    List<Reply> getReplyListByTopicId(Integer id);

    void addReply(Reply reply);

    Reply getReply(Integer id);

    void delReply(Integer id);
}
