package yhr.ya.kr.dao.login;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import yhr.ya.kr.bean.UserBean;


@Repository
public class LoginDaoImp implements LoginDao {
	
	
	@Autowired
	SqlSession session;


	@Override
	public UserBean getUser(UserBean ub) {
		System.out.println(ub);
		return session.selectOne("login.getUser", ub);
		
	}

}
