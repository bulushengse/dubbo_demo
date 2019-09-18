package com.zhoubc.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.zhoubc.service.IUserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Resource(name="userService")
 	private IUserService userService;
	
	/**
	 * sayHello
	 */
	@RequestMapping(value="/sayHello",method=RequestMethod.GET)
	public ModelAndView sayHello() {
		System.out.println("====client_log===========Invoking sayHello...");
		ModelAndView mv = new ModelAndView();
		
        java.lang.String _sayHello_arg0 = "dubbo";
        java.lang.String _sayHello__return = userService.sayHello(_sayHello_arg0);
        System.out.println("====client_log===========sayHello.result=" + _sayHello__return);
	        
        mv.addObject("result","sayHello方法调用成功，返回结果："+_sayHello__return);
		mv.setViewName("result");
		return mv;
		
	}
	
	
	
	
}
