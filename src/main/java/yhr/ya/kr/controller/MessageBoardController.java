package yhr.ya.kr.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import yhr.ya.kr.bean.MessageBean;
import yhr.ya.kr.bean.NominationBean;
import yhr.ya.kr.bean.UserBean;
import yhr.ya.kr.service.messageboard.MessageboardService;

@Controller
public class MessageBoardController {
	
	@Autowired private MessageboardService messageboardService;
	
	@RequestMapping(value="/messageboard", method=RequestMethod.POST)
	public @ResponseBody  Map<String, Object> messageboard(@RequestParam Map<String, Object> paramMap) {
//			System.out.println(paramMap);
		return messageboardService.getMessageboard(paramMap);
	}
	
	@RequestMapping(value="/messageboard_del", method=RequestMethod.POST)
	public @ResponseBody  Map<String, Object> setmessageboard(MessageBean MB, HttpSession session) {
			System.out.println(MB);
			Map<String, Object> result = new HashMap<String, Object>();
			result.put("state", 0);
			Object obj = session.getAttribute("User");
			System.out.println("UB :" + obj);
		      if(obj != null) {
		    	 UserBean ub = (UserBean) obj;
		    	 System.out.println(ub);
		    	 if(MB.getM_user() == ub.getNo()) {
		    		 System.out.println(MB);
		    		 result = messageboardService.setMessageboard(MB);
		    		 result.put("state", 1);   
		    	 } else {
		    		 result.put("msg", "삭제 권한이 없습니다.");
		    	 }
		      } else {
		    	  result.put("msg", "로그인이 필요합니다.");
		      }
			return result;
	}
	
	@RequestMapping(value="/nomination", method=RequestMethod.POST)
	public @ResponseBody Map<String, Object> setNomination(MessageBean MB, HttpSession session) {
		System.out.println(MB);
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("state", -1);
		Object obj = session.getAttribute("User");
		System.out.println("UB :" + obj);
	    if(obj != null) {
	    	 UserBean ub = (UserBean) obj;
	    	 System.out.println(ub);
	    	 NominationBean nb = new NominationBean();
	    	 nb.setMs_no(MB.getNo());
	    	 nb.setUs_no(ub.getNo());
	    	 result = messageboardService.setNomination(nb);
	    }
	    
	    return result;		
	}

}
