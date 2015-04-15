package com.web.commonframe.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * <p>@author:  Tianguang Xin 
 * <p>@data:  Mar 6, 2015 3:22:29 PM 
 * <p>@version:  V1.0
 */

@Controller
public class IndexController {
	@RequestMapping("/")
	public String index(){
		
		
		return "index";
	}
	
	@RequestMapping("/welcome")
	public String menu(){
		
		
		return "welcome";
	}
	
}
