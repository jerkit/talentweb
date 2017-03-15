//package net.togogo.talent.controller;
//
//import javax.annotation.Resource;
//import javax.servlet.http.HttpServletRequest;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import net.togogo.talent.domain.TbUser;
//import net.togogo.talent.service.ITbUserService;
//import net.togogo.talent.web.utils.Md5Utils;
//
//@Controller
//@RequestMapping("/user/")
//public class TbUserAccountController {
//
//	@Resource
//	ITbUserService tbUserService;
//	
//	/**
//	 * 查看用户的账号信息
//	 * @param request
//	 * @param model
//	 * @return
//	 */
//	@RequestMapping("info")
//	public String userInfo(HttpServletRequest request, Model model) {
//		TbUser user = (TbUser)request.getSession().getAttribute("current_user");
//		int userId = user.getUserId();
//		TbUser current_user = tbUserService.selectByPrimaryKey(userId);
//		model.addAttribute("current_user", current_user);
//		return "userInfo";
//	}
//	
//	@RequestMapping("goToEdit")
//	public String goEdit() {
//		return "user_edit";
//	}
//	
//	/**
//	 * 修改用户名
//	 * @param request
//	 * @return
//	 */
//	@RequestMapping("edit")
//	public String saveUserName(HttpServletRequest request) {
//		String userName = request.getParameter("userName");
//		TbUser user = (TbUser)request.getSession().getAttribute("current_user");
//		user.setUserName(userName);
//		tbUserService.updateByPrimaryKey(user);
//		return "userInfo";
//	}
//	
//	/**
//	 * 用户修改当前密码
//	 * @param request
//	 * @return
//	 */
//	@RequestMapping("savePassword")
//	public String saveUserPassword(HttpServletRequest request) {
//		String cur_password = Md5Utils.encode(request.getParameter("current_password"));
//		String new_password = Md5Utils.encode(request.getParameter("new_password"));
//		TbUser user = (TbUser)request.getSession().getAttribute("current_user");
//		// 认证当前的密码
//		if(user.getUserPassword().equals(cur_password)) {
//			//设置新的密码
//			user.setUserPassword(new_password);
//			//更新密码
//			tbUserService.updateByPrimaryKey(user);
//			return "userInfo";
//		}
//		return "currentPage";
//	}
//	
//	
//}
