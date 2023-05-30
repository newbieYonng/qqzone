package com.guigu.qqzone.service.Impl;

import com.guigu.qqzone.dao.HostReplyDAO;
import com.guigu.qqzone.pojo.HostReply;
import com.guigu.qqzone.service.HostReplyService;

public class HostReplyServiceImpl implements HostReplyService {

    private HostReplyDAO hostReplyDAO;

    @Override
    public HostReply getHostReplyByReplyId(Integer id) {

        return hostReplyDAO.getHostReplyByReplyId(id);
    }

    @Override
    public void delHostReply(Integer id) {
        hostReplyDAO.delHostReply(id);
    }
}
