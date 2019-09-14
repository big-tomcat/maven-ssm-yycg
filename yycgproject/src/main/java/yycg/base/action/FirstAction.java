package yycg.base.action;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import yycg.base.pojo.po.Sysuser;
import yycg.base.service.UserService;

@Controller
public class FirstAction {
	
	@Autowired
	private UserService userService;
	
	//首页
	@RequestMapping("/first")
	public String first(Model model)throws Exception{
		Sysuser sysuser = userService.findSysuesrById("105");
		//将sysuser传到页面
		model.addAttribute("sysuser",sysuser);
		return "/base/first";
	}
	
	//欢迎页面
	@RequestMapping("/welcome")
	public String welcome(){
		return "/base/welcome";
		
	}

}
