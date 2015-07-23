package com.kanbujian.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {
	ClassPathXmlApplicationContext ctx;
	@Before
	public void setUp() throws Exception {
		ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		UserService us=(UserService)ctx.getBean("UserService");
		// 验证 用户名 密码 
		boolean flag=us.checkLogin("jay", "12345");
		System.out.println(flag);
		// 遍历数据表
		us.list();
		
	}

}
