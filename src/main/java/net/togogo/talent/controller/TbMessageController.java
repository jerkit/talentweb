package net.togogo.talent.controller;

import java.util.List;
import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.togogo.talent.domain.TbMessage;
import net.togogo.talent.domain.TbMessageExample;
import net.togogo.talent.domain.TbMessageExample.Criteria;
import net.togogo.talent.service.ITbMessageService;

@Controller
public class TbMessageController {
	@Resource
	private ITbMessageService tbMessageService;

	@RequestMapping("/message.do")
	public @ResponseBody List<TbMessage> findMessage(String messType,Integer pageIndex) {
		
		if(messType==null)
			messType="recommend";//默认推荐信息
		if(pageIndex==null)
			pageIndex=1;//默认第一页
		TbMessageExample example = new TbMessageExample();
		Criteria criteria = example.createCriteria();
		criteria.andMessTypeEqualTo(messType);
		List<TbMessage> tbMessage = tbMessageService.selectByExample(example, pageIndex, 8);	
		return tbMessage;
	}
}
