package yhr.ya.kr.dao.messageboard;


import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import yhr.ya.kr.bean.MessageBean;
import yhr.ya.kr.bean.NominationBean;

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
		return session.update("message.Messageboard_del", MB);
	}

	@Override
	public int setNomination(NominationBean NB) {
		return session.insert("message.setNomination", NB);
	}

	@Override
	public Map<String, Object> getNomination(NominationBean NB) {
		return session.selectOne("message.getNomination", NB);
	}

	@Override
	public int Nomination_del(NominationBean NB) {
		return session.update("message.Nomination_del", NB);
	}

	@Override
	public int Nomination_up(NominationBean NB) {
		return session.update("message.Nomination_up", NB);
	}

}
