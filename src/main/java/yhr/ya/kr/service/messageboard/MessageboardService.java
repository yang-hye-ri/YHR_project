package yhr.ya.kr.service.messageboard;

import java.util.Map;

import yhr.ya.kr.bean.MessageBean;
import yhr.ya.kr.bean.NominationBean;

public interface MessageboardService {
	
	public Map<String, Object> getMessageboard(Map<String, Object> paramMap);
	
	public Map<String, Object> setMessageboard(MessageBean MB);

	public Map<String, Object> setNomination(NominationBean NB);
	
}
