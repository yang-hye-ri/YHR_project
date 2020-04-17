package yhr.ya.kr.service.login;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yhr.ya.kr.bean.UserBean;
import yhr.ya.kr.dao.login.LoginDao;


@Service
public class LoginServiceImp implements LoginService {
	

	
	@Autowired private LoginDao loginDao;

	@Override
	public UserBean getUser(UserBean ub) {
		return loginDao.getUser(ub);
	}

}
