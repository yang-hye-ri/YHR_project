package yhr.ya.kr.service.messageEditor;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yhr.ya.kr.bean.MessageBean;
import yhr.ya.kr.dao.messageeditor.MessageEditorDao;

@Service
public class MessageEditorServiceImp implements MessageEditorService {
	
	@Autowired private MessageEditorDao messageEditorDao;

	@Override
	public int setMessage(MessageBean MB) {
		return messageEditorDao.setMessage(MB);
	}

}
