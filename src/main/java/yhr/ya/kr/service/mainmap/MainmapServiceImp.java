package yhr.ya.kr.service.mainmap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yhr.ya.kr.bean.MainmapBean;
import yhr.ya.kr.dao.mainmap.MainmapDao;

@Service
public class MainmapServiceImp implements MainmapService {

	@Autowired private MainmapDao mainmapDao;
	
	@Override
	public MainmapBean getMainMap(MainmapBean MmB) {
		return mainmapDao.getMainMap(MmB);
	}

}
