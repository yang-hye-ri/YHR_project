package yhr.ya.kr.service.login;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import yhr.ya.kr.bean.UserBean;

public interface LoginService {
	
	public UserBean getUser(UserBean ub);
	

}
