package yhr.ya.kr.controller;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import yhr.ya.kr.service.message.MessageService;

@Controller
public class MessageController {

	
	@Autowired private MessageService messageService;
	
	@RequestMapping(value="/message", method=RequestMethod.POST)
	public @ResponseBody  Map<String, Object> getMessage(@RequestParam Map<String, Object> paramMap) {
//		System.out.println("controller :" + messageService.getMessage(paramMap));
		return messageService.getMessage(paramMap);
	}
	
}

	
