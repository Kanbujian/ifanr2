package com.kanbujian.DAO;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kanbujian.model.User;

public class UserDAOTest {
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
		UserDAO ud=(UserDAO)ctx.getBean("userDao");
		User u=(User)ctx.getBean("user");
		u.setUsername("jay");
		u.setUserPassWord("12345");
		System.out.println(ud.checkLogin(u));
	}

}
