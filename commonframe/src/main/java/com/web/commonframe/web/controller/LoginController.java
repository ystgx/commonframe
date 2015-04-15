package com.web.commonframe.web.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.commonframe.entity.User;
import com.web.commonframe.service.UserService;


@Controller
public class LoginController {
	@Resource
	private UserService userService;
	
	@RequestMapping(value="/login")
	public String showLoginForm(HttpServletRequest req,Model model){
		userService.createUser(new User());
		
		return "login";
	}
}
