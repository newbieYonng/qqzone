package com.guigu.qqzone.dao.Impl;

import com.guigu.myssm.basedao.BaseDAO;
import com.guigu.qqzone.dao.HostReplyDAO;
import com.guigu.qqzone.pojo.HostReply;

public class HostReplyDAOImpl extends BaseDAO<HostReply> implements HostReplyDAO {
    @Override
    public HostReply getHostReplyByReplyId(Integer id) {
        return super.load("select * from t_host_reply where reply = ?", id);
    }

    @Override
    public void delHostReply(Integer id) {
        super.executeUpdate("delete from t_host_reply where id = ?", id);
    }
}
