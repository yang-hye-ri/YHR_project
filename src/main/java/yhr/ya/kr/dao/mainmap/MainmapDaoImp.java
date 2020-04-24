package yhr.ya.kr.dao.mainmap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import yhr.ya.kr.bean.MainmapBean;

@Repository
public class MainmapDaoImp implements MainmapDao {

	@Autowired SqlSession session;
	
	@Override
	public MainmapBean getMainMap(MainmapBean MmB) {
//		return session.selectOne("mainmap.getMainMap", MmB);
		return null;
	}

}
