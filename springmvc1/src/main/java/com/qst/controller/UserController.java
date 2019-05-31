package com.qst.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.qst.po.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
//	//1、通过HttpServletRequest来传参
//	@RequestMapping("/login")
//	public String login(HttpServletRequest request) {
//		String username = request.getParameter("username");
//		String password = request.getParameter("password");
//		if("zhangsan".equals(username)&&"123456".equals(password)) {
//			return "success";
//		}else {
//			return "error";
//		}
//	}
	
	
//	//2、当请求参数和接收参数一致时，可以直接使用处理请求的方法的形参来接收参数
//	@RequestMapping("/login")
//	public String login(String username,String password) {
//		
//		if("zhangsan".equals(username)&&"123456".equals(password)) {
//			return "success";
//		}else {
//			return "error";
//		}
//	}
	
	//3、当请求参数和接收参数不一致时，可以使用@RequestParam来传递参数
	@RequestMapping("/login")
	public String login(@RequestParam("username") String name, @RequestParam("password") String pwd) {
		
		if("zhangsan".equals(name)&&"123456".equals(pwd)) {
			return "success";
		}else {
			return "error";
		}
	}
	
	
	//4、当请求参数较多时，可以使用对象来传递参数（类的属性名要和请求参数的名字一致）
	@RequestMapping("/login")
	public String login(User user) {
		
		if("zhangsan".equals(user.getUsername())&&"123456".equals(user.getPassword())) {
			return "success";
		}else {
			return "error";
		}
	}
	
	
	
	
}
