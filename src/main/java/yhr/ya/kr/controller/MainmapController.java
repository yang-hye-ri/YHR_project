package yhr.ya.kr.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import yhr.ya.kr.bean.MainmapBean;
import yhr.ya.kr.service.mainmap.MainmapService;

@Controller
public class MainmapController {
	
	@Autowired private MainmapService mainmapService;
	
	@RequestMapping(value="/mainmap", method=RequestMethod.POST)
	public @ResponseBody Map<String, Object> getMainMap(@RequestParam Map<String, Object> paramMap) {
		System.out.println(paramMap);
		return  mainmapService.getMainMap(paramMap);

	}
	

}

