package yhr.ya.kr.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import yhr.ya.kr.service.messageboard.MessageboardService;

@Controller
public class MessageBoardController {
	
	@Autowired private MessageboardService messageboardService;
	
	@RequestMapping(value="/messageboard", method=RequestMethod.POST)
	public @ResponseBody  Map<String, Object> messageboard(@RequestParam Map<String, Object> paramMap) {
			System.out.println(paramMap);
		return messageboardService.getMessageboard(paramMap);
	}

}
