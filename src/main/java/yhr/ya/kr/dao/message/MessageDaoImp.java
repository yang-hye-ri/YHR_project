package yhr.ya.kr.dao.message;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.binding.MapperMethod.ParamMap;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import yhr.ya.kr.bean.MessageBean;

@Repository
public class MessageDaoImp implements MessageDao {
	
	@Autowired private
	SqlSession session;

	@Override
	public List<Map<String, Object>> getMessage(Map<String, Object> paramMap) {
//		System.out.println("MessageDao :" + session.selectList("message.getMessage", paramMap));
		return session.selectList("message.getMessage", paramMap);
	}

	
}
