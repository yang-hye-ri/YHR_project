package yhr.ya.kr.dao.mainmap;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import yhr.ya.kr.bean.MainmapBean;
import yhr.ya.kr.bean.NominationBean;

@Repository
public class MainmapDaoImp implements MainmapDao {

	@Autowired SqlSession session;

	@Override
	public List<Map<String, Object>> getMainMap(Map<String, Object> paramMap) {
		System.out.println(paramMap);
		return session.selectList("mainmap.getMainMap", paramMap);
	}



}
