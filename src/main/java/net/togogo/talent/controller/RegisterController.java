package net.togogo.talent.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.togogo.talent.domain.TbCompany;
import net.togogo.talent.domain.TbUser;
import net.togogo.talent.service.ITbCompanyService;
import net.togogo.talent.service.ITbUserService;
import net.togogo.talent.web.utils.Md5Utils;

@Controller
@RequestMapping("/register")
public class RegisterController {
	
	@Resource
	ITbUserService tbUserService;
	@Resource
	ITbCompanyService tbCompanyService;
	
	@RequestMapping("/info")
	public String doRegister(HttpServletRequest request, Model model) {
		String email = request.getParameter("email");
		String password = Md5Utils.encode(request.getParameter("password"));
		String userName = request.getParameter("userName");
		int login_status = Integer.parseInt(request.getParameter("login_status"));
		
		String error = "";
		
		try {
			// 判断是个人用户还是企业用户
			if(login_status == 1) {// 个人用户
				TbUser user = new TbUser();
				user.setUserEmail(email);
				user.setUserPassword(password);
				user.setUserName(userName);
				tbUserService.insert(user);
				error = "注册成功!";
			}else {
				TbCompany company = new TbCompany();
				company.setCompEmail(email);
				company.setCompName(userName);
				company.setCompPassword(password);
				tbCompanyService.insert(company);
				error = "注册成功!";
			}
		} catch (Exception e) {
			error = "注册失败，请重试！";
			model.addAttribute("message", error);
			return "errorPage";
		}
//		System.out.println(error);
		return "success";
	}

}
