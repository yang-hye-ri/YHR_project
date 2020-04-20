package yhr.ya.kr.service.message;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import yhr.ya.kr.dao.message.MessageDao;

@Service
public class MessageServiceImp implements MessageService {
	
	@Autowired private MessageDao messageDao;


	@Override
	public Map<String, Object> getMessage(Map<String, Object> paramMap) {
		Map<String, Object> ResultMap = new HashMap<String, Object>();
		ResultMap.put("result", messageDao.getMessage(paramMap));
//		System.out.println(ResultMap);
		return ResultMap;
	}

}
