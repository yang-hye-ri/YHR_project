package yhr.ya.kr.dao.messageeditor;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import yhr.ya.kr.bean.MessageBean;

@Repository
public class MessageEditorDaoImp implements MessageEditorDao {
	
	@Autowired private SqlSession Session;

	@Override
	public int setMessage(MessageBean MB) {
		return Session.insert("message.setMessage" , MB);
	}

}
