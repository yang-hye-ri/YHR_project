package yhr.ya.kr.service.mainmap;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import yhr.ya.kr.dao.mainmap.MainmapDao;

@Service
public class MainmapServiceImp implements MainmapService {

	@Autowired private MainmapDao mainmapDao;

	@Override
	public Map<String, Object> getMainMap(Map<String, Object> paramMap) {
		Map<String, Object> ResultMap = new HashMap<String, Object>();
		ResultMap.put("result", mainmapDao.getMainMap(paramMap));
//		System.out.println(ResultMap);
		return ResultMap;
	}


	
	
}
