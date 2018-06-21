package com.qjcz.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qjcz.manager.dao.TestDao;
import com.qjcz.manager.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestDao testDao;
	
	@Override
	public void insert() {
		Map map = new HashMap();
		map.put("name", "zhangsan");
		testDao.insert(map);
	}

}
