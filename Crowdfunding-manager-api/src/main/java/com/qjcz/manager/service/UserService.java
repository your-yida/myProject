package com.qjcz.manager.service;

import java.util.Map;

import com.qjcz.bean.TUser;

public interface UserService {

	TUser queryUserLogin(Map<String, String> paraMap);

	
}
