package com.thinkingFruit.clien.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.thinkingFruit.client.entity.Message;
import com.thinkingFruit.client.service.MessageService;

/**
 * 
 * @author 王珍丰 用户反馈管理
 */
@Controller
@RequestMapping(value = "/message")
public class MessageController {
	@Autowired
	MessageService messageService;

	@RequestMapping(value = "", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public String addNews(Message message) {
		messageService.addMessage(message);;
		return "yushu/index";
	}
}
