package net.togogo.talent.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.togogo.talent.domain.TbRecruit;
import net.togogo.talent.domain.TbRecruitExample;
import net.togogo.talent.service.ITbRecruitService;

@Controller
@RequestMapping("/recruit")
public class TbRecruitController {
	@Resource
	private ITbRecruitService tbRecruitService ;

	@RequestMapping("/index.do")
	public String index(Model model){
		
		TbRecruitExample example = new TbRecruitExample();
		List<TbRecruit> tbRecruits = tbRecruitService.selectByExample(example);
		model.addAttribute("recruits", tbRecruits);
		
		return "index";
	}
	
	@RequestMapping("/nextPage")
	public String nextPage(Model model, HttpServletRequest request) {
		int pageIndex = Integer.parseInt(request.getParameter("pageIndex"));
		// 设置页面的大小
		int pageSize = 8;
		List<TbRecruit> tbRecruits = tbRecruitService.selectMoreByExample(new TbRecruitExample(), pageIndex, pageSize);
		model.addAttribute("recruits", tbRecruits);
		
		return "nextPage";
	}
}
