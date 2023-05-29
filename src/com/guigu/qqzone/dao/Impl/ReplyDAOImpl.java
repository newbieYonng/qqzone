package com.guigu.qqzone.dao.Impl;

import com.guigu.myssm.basedao.BaseDAO;
import com.guigu.qqzone.dao.ReplyDAO;
import com.guigu.qqzone.pojo.Reply;

import java.util.List;

public class ReplyDAOImpl extends BaseDAO<Reply> implements ReplyDAO {
    @Override
    public List<Reply> getReplyListByTopicId(Integer id) {
        return super.executeQuery("select * from t_reply where topic = ?", id);
    }

    @Override
    public void addReply(Reply reply) {
        super.executeUpdate("insert into t_reply(content, replyDate, author, topic) values(?,?,?,?)", reply.getContent(), reply.getReplyDate(), reply.getAuthor().getId(), reply.getTopic().getId());
    }
}
