package com.qst.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qst.dao.UserDao;
import com.qst.pojo.UserInfo;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    public List<UserInfo> selectUserByName(UserInfo userInfo) {
        List<UserInfo> list = userDao.selectUserByName(userInfo);
        return list;
    }

}
