package yhr.ya.kr.dao.message;

import java.util.List;
import java.util.Map;



public interface MessageDao {
	
	public List<Map<String, Object>> getMessage(Map<String, Object> paramMap);

}
