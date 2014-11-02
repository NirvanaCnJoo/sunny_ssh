package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;

import com.db.dao.UserBeanDao;
import com.db.entity.UserBean;
import com.db.service.UserBeanInterface;


public class TestSpring {
	private static ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	@Test
	public void test() {
		
		UserBean user1 = (UserBean) ctx.getBean("userBean");
		UserBean user = null;
		//UserBeanInterface dao = (UserBeanDao) ctx.getBean("userBeanDao");
		UserBeanInterface dao2 = (UserBeanInterface) ctx.getBean("userBeanDao");
		user = (UserBean) dao2.findByName("刘盛松").get(0);
		System.out.println(user.getPassword());
	}
	
	public static void main2() {
		
	}
}
