package yhr.ya.kr.dao.mainmap;

import java.util.List;
import java.util.Map;

import yhr.ya.kr.bean.MainmapBean;
import yhr.ya.kr.bean.NominationBean;

public interface MainmapDao {


	public List<Map<String, Object>> getMainMap(Map<String, Object> paramMap);
	
}
