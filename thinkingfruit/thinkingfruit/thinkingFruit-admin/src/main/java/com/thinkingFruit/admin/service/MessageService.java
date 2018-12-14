package com.thinkingFruit.admin.service;

import java.util.Map;

import com.thinkingFruit.admin.entity.Message;
import com.ysdevelop.common.page.Pagination;

public interface MessageService {

	//查询与遍历新闻
	Pagination<Message> paginationMessage(Pagination<Message> pagination, Map<String, String> queryMap);

	//删除新闻
	void deleteMessage(Long id);


}
