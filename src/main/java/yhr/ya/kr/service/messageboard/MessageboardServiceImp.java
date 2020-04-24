package yhr.ya.kr.service.messageboard;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yhr.ya.kr.bean.MessageBean;
import yhr.ya.kr.dao.messageboard.MessageboardDao;

@Service
public class MessageboardServiceImp implements MessageboardService {
	
	@Autowired private MessageboardDao messageboardDao;

	@Override
	public Map<String, Object> getMessageboard(Map<String, Object> paramMap) {
		Map<String, Object> ResultMap = new HashMap<String, Object>();
		ResultMap.put("result", messageboardDao.getMessageboard(paramMap));
//		System.out.println(ResultMap);
		return ResultMap;
	}

	@Override
	public MessageBean setMessageboard(MessageBean MB) {
		
		return null;
	}
	
	

}
