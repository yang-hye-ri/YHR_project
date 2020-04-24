package yhr.ya.kr.service.messageboard;

import java.util.Map;

import yhr.ya.kr.bean.MessageBean;

public interface MessageboardService {
	
	public Map<String, Object> getMessageboard(Map<String, Object> paramMap);
	
	public MessageBean setMessageboard(MessageBean MB);

}
