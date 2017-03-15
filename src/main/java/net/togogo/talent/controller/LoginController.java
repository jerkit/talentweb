package net.togogo.talent.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.togogo.talent.domain.TbCompany;
import net.togogo.talent.domain.TbUser;
import net.togogo.talent.service.ITbCompanyService;
import net.togogo.talent.service.ITbUserService;
import net.togogo.talent.web.utils.Md5Utils;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Resource
	ITbUserService tbUserService;
	@Resource
	ITbCompanyService tbCompanyService;
	
	@RequestMapping("/login.do")
	public String userLogin(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		String email = request.getParameter("email");
		String password = Md5Utils.encode(request.getParameter("password"));
		String error = "";
		int login_status = Integer.parseInt(request.getParameter("optionsRadios"));
		TbUser user = null;
		TbCompany company = null;
		if(login_status == 1) {
			//认证用户信息
			user = tbUserService.login(email, password);
			if(user != null) {
//				System.out.println(user);
				session.setAttribute("current_user", user);
				return "shouye";
			}
			error = "账号错误或者是密码错误";
			
		}else {
			//认证企业登录信息
			company = tbCompanyService.login(email, password);
			if(company != null) {
//				System.out.println(company);
				session.setAttribute("current_company", company);
				return "shouye";
			}
			error = "账号错误或者是密码错误";
		}
		model.addAttribute("msg", error);
		
		return "common/login";
	}

}
