package com.guigu.qqzone.dao.Impl;

import com.guigu.myssm.basedao.BaseDAO;
import com.guigu.qqzone.dao.TopicDAO;
import com.guigu.qqzone.pojo.Topic;
import com.guigu.qqzone.pojo.UserBasic;

import java.util.List;

public class TopicDAOImpl extends BaseDAO<Topic> implements TopicDAO {
    @Override
    public List<Topic> getTopicList(UserBasic userBasic) {
        return super.executeQuery("select * from t_topic where author = ?", userBasic.getId());
    }

    @Override
    public void addTopic(Topic topic) {
        super.executeUpdate(
                "insert into t_topic values(?, ?, ?, ?, ?)",
                topic.getId(),
                topic.getTitle(),
                topic.getReplyList(),
                topic.getTopicDate(),
                topic.getAuthor()
        );
    }

    @Override
    public void delteTopic(Topic topic) {
        super.executeUpdate("delete from t_topic where id = ?", topic.getId());
    }

    @Override
    public Topic getTopic(Integer id) {
        return super.load("select * from t_topic where id = ?", id);
    }
}
