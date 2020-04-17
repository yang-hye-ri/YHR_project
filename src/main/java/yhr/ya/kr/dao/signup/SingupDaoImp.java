package yhr.ya.kr.dao.signup;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import yhr.ya.kr.bean.UserBean;


@Repository
public class SingupDaoImp implements SignupDao {
	
	@Autowired 
	SqlSession sqlSession;
	
	@Override
	public UserBean setUser(UserBean ub) {
		return null;
	}

}
