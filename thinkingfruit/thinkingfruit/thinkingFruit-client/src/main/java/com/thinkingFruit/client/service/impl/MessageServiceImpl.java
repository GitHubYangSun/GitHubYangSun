package com.thinkingFruit.client.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinkingFruit.client.entity.Message;
import com.thinkingFruit.client.mapper.MessageDao;
import com.thinkingFruit.client.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {

	@Autowired
	MessageDao messageDao;

	@Override
	public void addMessage(Message message) {
		
		messageDao.addMessage(message);	
	}

	

}
