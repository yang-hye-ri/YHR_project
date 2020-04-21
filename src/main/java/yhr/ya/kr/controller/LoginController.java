package yhr.ya.kr.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

import yhr.ya.kr.bean.UserBean;
import yhr.ya.kr.service.login.LoginService;

@Controller
public class LoginController {
	
	@Autowired private LoginService loginService;
	
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public @ResponseBody UserBean getUser(UserBean ub, HttpSession session) {
		UserBean userBean = loginService.getUser(ub);  
		session.setAttribute("User", userBean);
	      if(userBean != null) {
	         System.out.println(ub);
		return loginService.getUser(ub);
	}
	 return null;
	}

	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	   public RedirectView removeUser(HttpSession session){
	      session.invalidate();
	      return new RedirectView("/mainmap");
	   }
	
	
}



