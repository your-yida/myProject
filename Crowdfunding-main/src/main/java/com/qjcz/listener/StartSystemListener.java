package com.qjcz.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class StartSystemListener implements ServletContextListener {


	@Override
	public void contextDestroyed(ServletContextEvent sce) {
	}
	//在服务器启动的时候，创建application对象时需要执行的方法
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		//1、将项目上下文路径(request.getContextPath())放到application域中
		ServletContext sc =  sce.getServletContext();
		String contextPath = sc.getContextPath();
		sc.setAttribute("APP_PATH", contextPath);
	}

}
