package yhr.ya.kr.service.messageboard;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yhr.ya.kr.bean.MessageBean;
import yhr.ya.kr.bean.NominationBean;
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
	public Map<String, Object> setMessageboard(MessageBean MB) {
		Map<String, Object> ResultMap = new HashMap<String, Object>();
		ResultMap.put("result", messageboardDao.setMessageboard(MB));
		System.out.println(ResultMap);
		return ResultMap;
	}

	@Override
	public Map<String, Object> setNomination(NominationBean NB) {
		Map<String, Object> ResultMap = new HashMap<String, Object>();
		
		System.out.println(NB);
		
		// 데이터 확인 > select
		Map<String, Object> result = messageboardDao.getNomination(NB);
		System.out.println(result.get("cnt"));
		
		if(Integer.parseInt(result.get("cnt").toString()) > 0) {
			if("N".equals(result.get("N_delYN"))) {
				// 데이터 삭제 > update
				messageboardDao.Nomination_del(NB);
				ResultMap.put("state", 0);
			} else {
				// 데이터 N 처리 update
				messageboardDao.Nomination_up(NB);
				ResultMap.put("state", 1);
			}
		} else {
			// 데이터 생성 > insert
			messageboardDao.setNomination(NB);
			ResultMap.put("state", 1);
		}
		return ResultMap;
	}

}
