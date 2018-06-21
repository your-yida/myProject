package com.qjcz.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qjcz.bean.TUser;
import com.qjcz.manager.dao.TUserMapper;
import com.qjcz.manager.service.UserService;
import com.qjcz.utils.LoginFailException;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private TUserMapper userMapper;
	
	@Override
	public TUser queryUserLogin(Map<String, String> paraMap){
		
		TUser user = userMapper.queryUserLogin(paraMap);
		
		if(user ==null) {
			throw new LoginFailException("用户名不存在！");
		}else if(!(user.getUserpswd().equals(paraMap.get("userpswd")))) {
			throw new LoginFailException("密码不正确！");
		}
		
			return user;
	}

}
