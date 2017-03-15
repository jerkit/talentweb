package net.togogo.talent.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import net.togogo.talent.domain.TbRecruit;
import net.togogo.talent.domain.TbRecruitExample;
import net.togogo.talent.service.ITbRecruitService;

public class TbRecruitTest {

	/**
	 * 招聘信息列表测试
	 */
	@Test
	public void testListTbRecruit() {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring_mybatis.xml");
		ITbRecruitService tbRecruitService = (ITbRecruitService) ac.getBean("tbRecruitService");
		List<TbRecruit> listRecruit = tbRecruitService.selectByExample(new TbRecruitExample());
		for (TbRecruit tbRecruit : listRecruit) {
			System.out.println(tbRecruit);
		}
		ac.close();
	}
	
	/**
	 * 招聘信息分页测试
	 */
	@Test
	public void testListTbRecruit1() {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring_mybatis.xml");
		ITbRecruitService tbRecruitService = (ITbRecruitService) ac.getBean("tbRecruitService");

		TbRecruitExample example = new TbRecruitExample();
		tbRecruitService.selectByExample(example);
		
		ac.close();
	}
	
	/**
	 * 测试
	 * 获取更多招聘信息功能，加载下一页
	 */
	@Test
	public void testListTbRecruit2() {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring_mybatis.xml");
		ITbRecruitService tbRecruitService = (ITbRecruitService) ac.getBean("tbRecruitService");
		
		TbRecruitExample example = new TbRecruitExample();
		tbRecruitService.selectMoreByExample(example, 2, 8);
		
		ac.close();
	}
	
}
