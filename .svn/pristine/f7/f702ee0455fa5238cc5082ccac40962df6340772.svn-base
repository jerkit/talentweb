package net.togogo.talent.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import net.togogo.talent.domain.TbCompany;
import net.togogo.talent.domain.TbKeyword;
import net.togogo.talent.domain.TbKeywordExample;
import net.togogo.talent.domain.TbKeywordExample.Criteria;
import net.togogo.talent.domain.TbUser;
import net.togogo.talent.service.KeywordService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/keyword")
public class KeywordController {

	@Resource
	private KeywordService keywordService;
	
	@RequestMapping("/test.do")
	public String test(){
		return "discover/keyword";
	}
	
	@RequestMapping("/addKeyword.do")
	public @ResponseBody String addKeyword(TbKeyword keyword, HttpServletRequest request){
		//先查询该关键词是否已经存在
		String content = keyword.getKeyword();
		TbKeywordExample example = new TbKeywordExample();
		Criteria criteria = example.createCriteria();
		criteria.andKeywordEqualTo(content);
		List<TbKeyword> list = keywordService.selectByExample(example);
		//不存在才添加
		if(list.size()<=0){
			TbUser current_user = (TbUser) request.getSession().getAttribute("current_user");
			if(current_user!=null){
				keyword.setUserId(current_user.getUserId());
			}
			TbCompany current_company = (TbCompany) request.getSession().getAttribute("current_company");
			if(current_company!=null){
				keyword.setCompId(current_company.getCompId());
			}
			keyword.setHeat(1);
			keywordService.insertSelective(keyword);
		}
		return "success";
	}
	
	@RequestMapping("/deleteKeyword.do")
	public @ResponseBody String deleteKeyword(int keywordId, Model model){
		int ret = keywordService.deleteByPrimaryKey(keywordId);
		if(ret!=1){
			throw new RuntimeException("删除失败！");
		}
		return "success";
	}
	
	@RequestMapping("/findKeywords.do")
	public @ResponseBody List<TbKeyword> findKeywords(Model model,HttpServletRequest request){
		TbKeywordExample example = new TbKeywordExample();
		Criteria criteria = example.createCriteria();
		
		TbUser current_user = (TbUser) request.getSession().getAttribute("current_user");
		if(current_user!=null){
			criteria.andUserIdEqualTo(current_user.getUserId());
		}
		TbCompany current_company = (TbCompany) request.getSession().getAttribute("current_company");
		if(current_company!=null){
			criteria.andCompIdEqualTo(current_company.getCompId());
		}
		//用heat降序排序
		example.setOrderByClause("heat desc");
		
		return keywordService.selectByExample(example);
	}
	
	@RequestMapping("/findKeywordsPage.do")
	public @ResponseBody List<TbKeyword> findKeywordsPage(HttpServletRequest request,int pageIndex,int pageSize){
		TbKeywordExample example = new TbKeywordExample();
		Criteria criteria = example.createCriteria();
		
		TbUser current_user = (TbUser) request.getSession().getAttribute("current_user");
		if(current_user!=null){
			criteria.andUserIdEqualTo(current_user.getUserId());
		}
		TbCompany current_company = (TbCompany) request.getSession().getAttribute("current_company");
		if(current_company!=null){
			criteria.andCompIdEqualTo(current_company.getCompId());
		}
		//用heat降序排序
		example.setOrderByClause("heat desc");
		return keywordService.selectByExample(example,pageIndex,pageSize);
	}
	
	@RequestMapping("/findAllKeywords.do")
	public @ResponseBody List<TbKeyword> findAllKeywords(){
		TbKeywordExample example = new TbKeywordExample();
		example.setOrderByClause("heat desc");//用heat降序排序
		return keywordService.selectByExample(example);
	}
	
	@RequestMapping("/findAllKeywordsPage.do")
	public @ResponseBody List<TbKeyword> findAllKeywordsPage(int pageIndex,int pageSize){
		TbKeywordExample example = new TbKeywordExample();
		example.setOrderByClause("heat desc");//用heat降序排序
		return keywordService.selectByExample(example,pageIndex,pageSize);
	}
	
	@RequestMapping("/updateKeywordHeat.do")
	public @ResponseBody String updateKeywordHeat(TbKeyword keyword,HttpServletRequest request){
		TbKeywordExample example = new TbKeywordExample();
		Criteria criteria = example.createCriteria();
		criteria.andKeywordIdEqualTo(keyword.getKeywordId());
		TbKeyword retKeyword = keywordService.selectByExample(example).get(0);
		
		keyword.setHeat(retKeyword.getHeat()+1);
		keywordService.updateByPrimaryKeySelective(keyword);
		return "success";
	}
}
