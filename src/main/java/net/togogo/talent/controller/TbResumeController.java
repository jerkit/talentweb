package net.togogo.talent.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.togogo.talent.domain.TbResume;
import net.togogo.talent.domain.TbResumeExample;
import net.togogo.talent.domain.TbResumeExample.Criteria;
import net.togogo.talent.domain.TbUser;
import net.togogo.talent.service.ITbResumeService;
import net.togogo.talent.service.ITbUserService;

@Controller
@RequestMapping("/resume")
public class TbResumeController {

	@Resource(name = "tbResumeService")
	private ITbResumeService tbResumeService;

	@Resource(name = "tbUserService")
	private ITbUserService tbUserService;

	@RequestMapping("/addResume.do")
	public @ResponseBody String addResume(TbResume resume, HttpServletRequest request) {
		TbUser current_user = (TbUser) request.getSession().getAttribute("current_user");
		resume.setUserId(current_user.getUserId());
		tbResumeService.insertSelective(resume);
		return "success";
	}

	@RequestMapping("/deleteResume.do")
	public @ResponseBody String deleteResume(Integer resumeId) {
		tbResumeService.deleteByPrimaryKey(resumeId);
		return "success";
	}

	@RequestMapping("/updateResume.do")
	public @ResponseBody String updateResume(TbResume resume, HttpServletRequest request) {
		TbUser current_user = (TbUser) request.getSession().getAttribute("current_user");
		resume.setUserId(current_user.getUserId());
		tbResumeService.updateByPrimaryKey(resume);
		return "success";
	}

	@RequestMapping("/findAllResumes.do")
	public @ResponseBody List<TbResume> findAllResumes(HttpServletRequest request) {
		TbUser current_user = (TbUser) request.getSession().getAttribute("current_user");
		TbResumeExample example = new TbResumeExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(current_user.getUserId());
		return tbResumeService.selectByExample(example);
	}

	@RequestMapping("/findResume.do")
	public @ResponseBody TbResume findResume(Integer resumeId) {

		return tbResumeService.selectByPrimaryKey(resumeId);

	}

	@RequestMapping("resumeDetail.do")
	public @ResponseBody Map<String, Object> resumeDetail(Integer resumeId, HttpServletRequest request) {

		TbUser tbUser = tbUserService
				.selectByPrimaryKey(((TbUser) request.getSession().getAttribute("current_user")).getUserId());
		TbResume tbResume = tbResumeService.selectByPrimaryKey(resumeId);
		Map<String, Object> resumeDetail = new HashMap<String, Object>();
		resumeDetail.put("tbUser", tbUser);
		resumeDetail.put("tbResume", tbResume);
		return resumeDetail;
	}
}
