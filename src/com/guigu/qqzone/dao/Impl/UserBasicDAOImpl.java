package com.guigu.qqzone.dao.Impl;

import com.guigu.myssm.basedao.BaseDAO;
import com.guigu.qqzone.dao.UserBasicDAO;
import com.guigu.qqzone.pojo.UserBasic;

import java.util.List;

public class UserBasicDAOImpl extends BaseDAO<UserBasic> implements UserBasicDAO {
    @Override
    public UserBasic getUserBasic(String loginID, String pwd) {
        return super.load("select * from t_user_basic where loginId = ? and pwd = ?", loginID, pwd);
    }

    @Override
    public List<UserBasic> getUserBasicList(UserBasic userBasic) {
        return super.executeQuery("select fid as 'id' from t_ friend where uid = ?", userBasic.getId());
    }

    @Override
    public UserBasic getUserBasicByID(Integer id) {
        return super.load("select * from t_user_basic where id = ?", id);
    }
}
