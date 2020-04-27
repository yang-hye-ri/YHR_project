package yhr.ya.kr.dao.messageboard;


import java.util.Map;

import yhr.ya.kr.bean.MessageBean;
import yhr.ya.kr.bean.NominationBean;

public interface MessageboardDao {
	
	public Map<String, Object> getMessageboard(Map<String, Object> paramMap);
	
	public int setMessageboard(MessageBean MB);

	public Map<String, Object> getNomination(NominationBean NB);
	public int setNomination(NominationBean NB);
	public int Nomination_del(NominationBean NB);
	public int Nomination_up(NominationBean NB);
	
}
