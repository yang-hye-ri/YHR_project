package yhr.ya.kr.dao.messageboard;


import java.util.Map;

import yhr.ya.kr.bean.MessageBean;

public interface MessageboardDao {
	
	public Map<String, Object> getMessageboard(Map<String, Object> paramMap);
	
	public int setMessageboard(MessageBean MB);

}
