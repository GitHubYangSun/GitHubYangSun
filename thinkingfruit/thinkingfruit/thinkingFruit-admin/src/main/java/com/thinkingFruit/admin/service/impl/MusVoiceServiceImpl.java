package com.thinkingFruit.admin.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinkingFruit.admin.entity.MusVoice;
import com.thinkingFruit.admin.mapper.MusVoiceDao;
import com.thinkingFruit.admin.service.MusVoiceService;
import com.ysdevelop.common.exception.WebServiceException;
import com.ysdevelop.common.page.Pagination;
import com.ysdevelop.common.result.CodeMsg;

@Service
public class MusVoiceServiceImpl implements MusVoiceService {

	@Autowired
	MusVoiceDao musVoiceDao;

	
	@Override
	public Pagination<MusVoice> paginationMusvoice(Pagination<MusVoice> pagination, Map<String, String> queryMap) {
		Integer page = null;
		Integer limit = null;
		if (queryMap == null || (page = Integer.valueOf(queryMap.get("page"))) == null || (limit = Integer.valueOf(queryMap.get("limit"))) == null) {
			throw new WebServiceException(CodeMsg.SERVER_ERROR);
		}
		pagination.setPageNum(page);
		pagination.setPageSize(limit);
		
		Integer totalItemsCount = musVoiceDao.getCountByQuery(queryMap);
		List<MusVoice> secondCategoryItems = musVoiceDao.paginationMusvoice(queryMap, pagination);
		pagination.setItems(secondCategoryItems);
		pagination.setTotalItemsCount(totalItemsCount);
		return pagination;
	}

	@Override
	public void deleteMusvoice(Long id) {
		musVoiceDao.deleteMusvoice(id);
	}

	@Override
	public void addMusvoice(MusVoice news) {
		musVoiceDao.addMusvoice(news);
	}

	@Override
	public MusVoice findMusvoiceById(Long id) {
		return musVoiceDao.findMusvoiceById(id);
	}

	@Override
	public void editMusvoice(MusVoice news) {
		musVoiceDao.editMusvoice(news);
	}


}
