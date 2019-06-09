package com.qst.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.qst.pojo.UserInfo;

@Repository   //bean名字默认为：userDao
public interface UserDao {//接口文件中需要写一些方法，而这些方法要和映射文件所对应
    public List<UserInfo> selectUserByName(UserInfo UserInfo);
}
