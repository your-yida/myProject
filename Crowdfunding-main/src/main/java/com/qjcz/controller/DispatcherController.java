package com.qjcz.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qjcz.bean.TUser;
import com.qjcz.manager.service.UserService;
import com.qjcz.utils.Const;

@Controller
public class DispatcherController {
	
	@Autowired
	private UserService userService;
	/**
	 * 首页跳转
	 * @return
	 */
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	/**
	 * 登入跳转
	 * @return
	 */
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	/**
	 * 注册页面跳转
	 * @return
	 */
	@RequestMapping("/reg")
	public String reg() {
		return "reg";
	}
	
	
	@RequestMapping("/main")
	public String main() {
		return "main";
	}
	/**
	 * 
	 * @author zw
	 * @version 2018年6月18日
	 * @return
	 */
	@RequestMapping("/doLogin")
	public String doLogin(String loginacct , String userpswd , String type ,HttpSession session) {
		
		Map<String,String> paraMap = new HashMap<String,String>();
		
		paraMap.put("loginacct", loginacct);
		paraMap.put("userpswd", userpswd);
		paraMap.put("type", type);
		
		TUser user = userService.queryUserLogin(paraMap);
		
		session.setAttribute(Const.LOGIN_USER, user);
		
		return "redirect:/main.htm";
	}
	
}
