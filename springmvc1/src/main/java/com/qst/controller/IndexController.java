package com.qst.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@RequestMapping(value="/register")
	public ModelAndView register() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "这是一个注册页面");
		mv.setViewName("register");
		return mv;
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
}
