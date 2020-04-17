package yhr.ya.kr.service.singup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yhr.ya.kr.bean.UserBean;
import yhr.ya.kr.dao.signup.SignupDao;


@Service
public class SignupServiceImp implements SignupService {
	
	@Autowired private SignupDao signupDao;
	
	@Override
	public int setUser(UserBean ub) {
		return signupDao.setUser(ub);
	}

	
}
