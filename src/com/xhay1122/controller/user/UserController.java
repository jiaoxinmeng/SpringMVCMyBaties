package com.xhay1122.controller.user;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xhay1122.entity.user.User;
import com.xhay1122.service.user.IUserService;

@Controller  
@RequestMapping("/userController")
public class UserController{
	
	@Resource(name="userService")
	IUserService service;

	@RequestMapping(value={"/login"})  
	public ModelAndView handleRequest(User user) throws Exception {
//		//获取表单提交数据
//		String userName = request.getParameter("userName");
//		String userPwd = request.getParameter("userPwd");
		//创建模型视图对象用来返回
		ModelAndView mav = new ModelAndView();
		if(service.loginCheck(user)){
			System.out.println("登陆成功");
			//将页面需要使用的数据保存
			//设置视图名称
			mav.setViewName("redirect:/index.jsp");
		}
		else{
			System.out.println("登陆失败");
			mav.addObject("error", "用户名或密码错误");
			mav.setViewName("/login");
		}

		return mav;
	}

}
