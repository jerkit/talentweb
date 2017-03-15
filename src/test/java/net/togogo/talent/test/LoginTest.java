package net.togogo.talent.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.togogo.talent.domain.TbUser;
import net.togogo.talent.service.ITbUserService;
import net.togogo.talent.web.utils.Md5Utils;

public class LoginTest {

//	@Resource
//	ITbUserService tbUserService;
	
	@Test
	public void testLogin() {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring_mybatis.xml");
		ITbUserService tbUserService = (ITbUserService)ac.getBean("tbUserService");
		System.out.println(Md5Utils.encode("123456"));
		String str = Md5Utils.encode("123456");
		TbUser user = tbUserService.login("12@qq.com", str);
		System.out.println(user);
		ac.close();
	}
}
