package com.thinkingFruit.admin.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinkingFruit.admin.entity.Message;
import com.thinkingFruit.admin.mapper.MessageDao;
import com.thinkingFruit.admin.service.MessageService;
import com.ysdevelop.common.exception.WebServiceException;
import com.ysdevelop.common.page.Pagination;
import com.ysdevelop.common.result.CodeMsg;

@Service
public class MessageServiceImpl implements MessageService {

	@Autowired
	MessageDao messageDao;

	@Override
	public Pagination<Message> paginationMessage(Pagination<Message> pagination, Map<String, String> queryMap) {
		// TODO Auto-generated method stub
		Integer page = null;
		Integer limit = null;
		if (queryMap == null || (page = Integer.valueOf(queryMap.get("page"))) == null || (limit = Integer.valueOf(queryMap.get("limit"))) == null) {
			throw new WebServiceException(CodeMsg.SERVER_ERROR);
		}
		pagination.setPageNum(page);
		pagination.setPageSize(limit);
		
		Integer totalItemsCount = messageDao.getCountByQuery(queryMap);
		List<Message> secondCategoryItems = messageDao.paginationMessage(queryMap, pagination);
		pagination.setItems(secondCategoryItems);
		pagination.setTotalItemsCount(totalItemsCount);
		return pagination;
	}

	@Override
	public void deleteMessage(Long id) {
		messageDao.deleteMessage(id);
	}


}
