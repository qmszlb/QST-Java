package com.qst.service;

import java.util.List;

import com.qst.pojo.UserInfo;

public interface UserService {
    public List<UserInfo> selectUserByName(UserInfo userInfo);
}
