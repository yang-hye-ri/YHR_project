package yhr.ya.kr.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import yhr.ya.kr.bean.MainmapBean;
import yhr.ya.kr.service.mainmap.MainmapService;

@Controller
public class MainmapController {
	
	@Autowired private MainmapService mainmapService;
	
	@RequestMapping(value="/mainmap", method=RequestMethod.POST)
	public @ResponseBody MainmapBean getMainMap(MainmapBean MmB) {
		
		return mainmapService.getMainMap(MmB);
	}

}
