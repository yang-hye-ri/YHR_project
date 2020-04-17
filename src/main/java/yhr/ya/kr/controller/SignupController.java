package yhr.ya.kr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import yhr.ya.kr.bean.UserBean;
import yhr.ya.kr.service.singup.SignupService;
import yhr.ya.kr.service.singup.SignupServiceImp;

@Controller
public class SignupController {
	
	@Autowired private SignupService signupService;
	
	@RequestMapping(value="/signup", method=RequestMethod.POST)
	public @ResponseBody UserBean setUser(UserBean ub) {
		System.out.println(ub);
		return signupService.setUser(ub);
	}
	
	
	
}
