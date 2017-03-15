package net.togogo.talent.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.togogo.talent.domain.TbAdmin;
import net.togogo.talent.domain.TbAdminExample;
import net.togogo.talent.service.ITbAdminService;

/**
 * 在springmvc_config.xml
 * <context:component-scan base-package="net.togogo.talent.controller"/>
 * @author stone
 *spring mvc容器会扫描net.togogo.talent.controller目录下用@Controller注解的组件，扫描到时，spring mvc就会把该组件加到spring mvc容器中管理
 */
//@Component @Service @Repository @Controller
@Controller
public class TbAdminController {
	@Resource
	private ITbAdminService tbAdminService;

	/**
	 * @RequestMapping("/findAdmins")：请求的url
	 * @return
	 */
	@RequestMapping("/findAdmins")
	public String findAdmins(Model model){
		List<TbAdmin> admins = tbAdminService.selectByExample(new TbAdminExample());
		model.addAttribute("admins",admins);
		//		for(TbAdmin admin:admins){
//			System.out.println(admin);
//		}
		return "adminList.jsp";
	}
}
