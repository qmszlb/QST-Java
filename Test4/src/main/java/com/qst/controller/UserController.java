package com.qst.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qst.pojo.UserInfo;
import com.qst.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/showUser")
    public String showUser(UserInfo userInfo, Model model) {
        List<UserInfo> list = userService.selectUserByName(userInfo);
        model.addAttribute("userList", list);
        return "showUserForm";
    }

}