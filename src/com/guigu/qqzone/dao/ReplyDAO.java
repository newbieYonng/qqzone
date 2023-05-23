package com.guigu.qqzone.dao;

import com.guigu.qqzone.pojo.Reply;

import java.util.List;

public interface ReplyDAO {

    List<Reply> getReplyListByTopicId(Integer id);

}
