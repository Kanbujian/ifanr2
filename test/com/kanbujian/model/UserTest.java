package com.kanbujian.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
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
		News u=(News)ctx.getBean("news");
		u.setContent("buzhiadao");
		System.out.println(u.getContent());
	}

}
