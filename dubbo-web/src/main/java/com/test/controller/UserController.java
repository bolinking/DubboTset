package com.test.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.test.api.entity.UserInfo;
import com.test.api.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Reference
	private IUserService userService;
	
	@RequestMapping("/")
    public String index(){
		return "index";
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public List<UserInfo> findUser(){
		return userService.findUser();
	}
}
