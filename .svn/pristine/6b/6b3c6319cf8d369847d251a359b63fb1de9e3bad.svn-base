package net.togogo.talent.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import net.togogo.talent.domain.TbHunt;
import net.togogo.talent.domain.TbHuntExample;
import net.togogo.talent.domain.TbUser;
import net.togogo.talent.service.HuntService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hunt")
public class HuntController {

	@Resource
	private HuntService huntService ;
	
	@RequestMapping("/test.do")
	public String test(){
		return "publish/publishHunt";
	}
	
	@RequestMapping("/findHunts.do")
	public @ResponseBody List<TbHunt> findHunts(){
		TbHuntExample example = new TbHuntExample();
		return huntService.selectByExample(example);
	}
	
	@RequestMapping("/findHuntPages.do")
	public @ResponseBody List<TbHunt> findHuntPages(int pageIndex,int pageSize){
		TbHuntExample example = new TbHuntExample();
		return huntService.selectMoreByExample(example,pageIndex,pageSize);
	}
	
	@RequestMapping("/addHunt.do")
	public @ResponseBody String addHunt(TbHunt hunt, HttpServletRequest request){
		TbUser current_user = (TbUser) request.getSession().getAttribute("current_user");
		if(current_user!=null){
			hunt.setUserId(current_user.getUserId());
			hunt.setUserName(current_user.getUserName());
		}
		hunt.setHuntDate(new Date());
		hunt.setHuntState(0);
		huntService.insertSelective(hunt);
		return "success";
	}
	
	@RequestMapping("/deleteHunt.do")
	public @ResponseBody String deleteHunt(int huntId, Model model){
		int ret = huntService.deleteByPrimaryKey(huntId);
		if(ret!=1){
			throw new RuntimeException("删除失败！");
		}
		return "success";
	}
	
	@RequestMapping("/updateHunt.do")
	public @ResponseBody String updateHunt(TbHunt hunt,HttpServletRequest request){
		huntService.updateByPrimaryKeySelective(hunt);
		return "success";
	}
}
