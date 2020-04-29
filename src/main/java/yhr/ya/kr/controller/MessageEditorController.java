package yhr.ya.kr.controller;



import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import yhr.ya.kr.bean.MessageBean;
import yhr.ya.kr.bean.UserBean;
import yhr.ya.kr.service.messageEditor.MessageEditorService;

@Controller
public class MessageEditorController {
	
	@Autowired private MessageEditorService messageEditorService;
	
	@RequestMapping(value="/messageeditor", method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> setMessage(MessageBean MB ,  HttpSession session) {
		 System.out.println(MB);
		 Object obj = session.getAttribute("User");   
	      if(obj != null) {
	    	 UserBean ub = (UserBean) obj; 
	    	 MB.setM_user(ub.getNo());
	         System.out.println("UB :" + ub);
	         return messageEditorService.setMessage(MB);
	      }
	      return null;
	}
	
}
