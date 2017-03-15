package net.togogo.talent.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import net.togogo.talent.domain.TbMessage;
import net.togogo.talent.domain.TbMessageExample;
import net.togogo.talent.domain.TbMessageExample.Criteria;
import net.togogo.talent.service.ITbMessageService;

public class TbMessageTest {

	@Test
	public void testFindMessageSystem(){
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("spring_mybatis.xml");
		ITbMessageService messageService=(ITbMessageService) ac.getBean("tbMessageService");
		TbMessageExample example=new TbMessageExample();
		Criteria criteria=example.createCriteria();
		criteria.andMessTypeEqualTo("system");
		List<TbMessage> tbMessage=messageService.selectByExample(example,1,8);
		for (TbMessage message : tbMessage) {
			System.out.println(message.getContent());
		}
	}

	
}
