package yhr.ya.kr.dao.messageboard;


import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import yhr.ya.kr.bean.MessageBean;

@Repository
public class MessageboardDaoImp implements MessageboardDao {
	
	@Autowired private
	SqlSession session;
	
	@Override
	public Map<String, Object> getMessageboard(Map<String, Object> paramMap) {
		return session.selectOne("message.getMessageboard", paramMap);
	}

	@Override
	public int setMessageboard(MessageBean MB) {
		return 0;
	}

}
