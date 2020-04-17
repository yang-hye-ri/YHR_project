package yhr.ya.kr.dao.signup;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import yhr.ya.kr.bean.UserBean;


@Repository
public class SingupDaoImp implements SignupDao {
	
	@Autowired 
	SqlSession session;
	
	@Override
	public int setUser(UserBean ub) {
		System.out.println(ub);
		return session.insert("signup.setUser", ub);
	}
	
	
	

}
