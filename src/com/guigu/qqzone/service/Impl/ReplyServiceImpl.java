package com.guigu.qqzone.service.Impl;

import com.guigu.qqzone.dao.ReplyDAO;
import com.guigu.qqzone.pojo.HostReply;
import com.guigu.qqzone.pojo.Reply;
import com.guigu.qqzone.pojo.UserBasic;
import com.guigu.qqzone.service.HostReplyService;
import com.guigu.qqzone.service.ReplyService;
import com.guigu.qqzone.service.UserBasicService;

import java.util.List;

public class ReplyServiceImpl implements ReplyService {

    private ReplyDAO replyDAO;
    //此处引入的是其他POJO对应的Service接口，而不是DAO接口
    //其他POJO对应的业务逻辑是封装在service层的，我需要调用别人的业务逻辑方法，而不要去深入考虑人家内部的细节
    private UserBasicService userBasicService;
    private HostReplyService hostReplyService;

    @Override
    public List<Reply> getReplyListByTopicId(Integer id) {

        List<Reply> replyList = replyDAO.getReplyListByTopicId(id);
        //题主回复
        for (Reply reply : replyList) {
            //1.将关联的作者设置进去
            UserBasic author = userBasicService.getUserBasicByID(reply.getAuthor().getId());
            reply.setAuthor(author);
            //2.将关联的HostReply设置进去
            HostReply hostReply = hostReplyService.getHostReplyByReplyId(reply.getId());
            reply.setHostReply(hostReply);
        }
        return replyList;
    }

    @Override
    public void addReply(Reply reply) {
        replyDAO.addReply(reply);
    }
}
