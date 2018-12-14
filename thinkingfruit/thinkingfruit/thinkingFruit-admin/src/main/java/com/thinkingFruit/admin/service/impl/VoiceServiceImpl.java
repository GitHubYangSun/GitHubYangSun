package com.thinkingFruit.admin.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinkingFruit.admin.entity.Voice;
import com.thinkingFruit.admin.mapper.VoiceDao;
import com.thinkingFruit.admin.service.VoiceService;
import com.ysdevelop.common.exception.WebServiceException;
import com.ysdevelop.common.page.Pagination;
import com.ysdevelop.common.result.CodeMsg;

@Service
public class VoiceServiceImpl implements VoiceService {

	@Autowired
	VoiceDao videoDao;

	@Override
	public Pagination<Voice> paginationVoice(Pagination<Voice> pagination, Map<String, String> queryMap) {
		// TODO Auto-generated method stub
		Integer page = null;
		Integer limit = null;
		if (queryMap == null || (page = Integer.valueOf(queryMap.get("page"))) == null || (limit = Integer.valueOf(queryMap.get("limit"))) == null) {
			throw new WebServiceException(CodeMsg.SERVER_ERROR);
		}
		pagination.setPageNum(page);
		pagination.setPageSize(limit);
		
		Integer totalItemsCount = videoDao.getCountByQuery(queryMap);
		List<Voice> secondCategoryItems = videoDao.paginationVoice(queryMap, pagination);
		pagination.setItems(secondCategoryItems);
		pagination.setTotalItemsCount(totalItemsCount);
		return pagination;
	}

	@Override
	public void deleteVoice(Long id) {
		videoDao.deleteVoice(id);
	}

	@Override
	public void addVoice(Voice voice) {
		videoDao.addVoice(voice);
	}

	@Override
	public Voice findVoiceById(Long id) {
		return videoDao.findVoiceById(id);
	}

	@Override
	public void editVoice(Voice voice) {
		videoDao.editVoice(voice);
	}

}
