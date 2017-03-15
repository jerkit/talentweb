package net.togogo.talent.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.togogo.talent.domain.TbAdmin;
import net.togogo.talent.service.ITbAdminService;

public class TbAdminTest {

	@Test
	public void testFindAdmins() {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring_mybatis.xml");
		ITbAdminService adminService = (ITbAdminService) ac.getBean("tbAdminService");
		//查询所有数据
		/**
		 * TbAdminExample：封装查询条件
		 */
//		List<TbAdmin> admins = adminService.selectByExample(new TbAdminExample());
//		for(TbAdmin admin:admins){
//			System.out.println(admin);
//		}
		
		//根据密码来查询
//		TbAdminExample example = new TbAdminExample();
		//获得查询条件对象
//		Criteria cri = example.createCriteria();
		//增加查询条件
//		cri.andAdminPasswordEqualTo("wujunru");
		
		//根据id来查询
		
		
		TbAdmin admin = adminService.selectByPrimaryKey(4);
		System.out.println(admin);
	}
	
	@Test
	public void testSave() {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring_mybatis.xml");
		ITbAdminService adminService = (ITbAdminService) ac.getBean("tbAdminService");
	
	}
	
	@Test
	public void testDelete() {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring_mybatis.xml");
		ITbAdminService adminService = (ITbAdminService) ac.getBean("tbAdminService");

	}
}
