package com.guigu.qqzone.service;

import com.guigu.qqzone.pojo.HostReply;

public interface HostReplyService {
    HostReply getHostReplyByReplyId(Integer id);

    void delHostReply(Integer id);
}
