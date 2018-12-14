package com.thinkingFruit.admin.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinkingFruit.admin.entity.VoiceEnvir;
import com.thinkingFruit.admin.mapper.VoiceEnvirDao;
import com.thinkingFruit.admin.service.VoiceEnvirService;
import com.ysdevelop.common.exception.WebServiceException;
import com.ysdevelop.common.page.Pagination;
import com.ysdevelop.common.result.CodeMsg;

@Service
public class VoiceEnvirServiceImpl implements VoiceEnvirService {

	@Autowired
	VoiceEnvirDao voiceEnvirDao;

	@Override
	public Pagination<VoiceEnvir> paginationEnvir(Pagination<VoiceEnvir> pagination, Map<String, String> queryMap) {
		// TODO Auto-generated method stub
		Integer page = null;
		Integer limit = null;
		if (queryMap == null || (page = Integer.valueOf(queryMap.get("page"))) == null || (limit = Integer.valueOf(queryMap.get("limit"))) == null) {
			
			throw new WebServiceException(CodeMsg.SERVER_ERROR);
		}
		pagination.setPageNum(page);
		pagination.setPageSize(limit);
		String string = queryMap.get("name");
		System.out.println("string"+string);
		Integer totalItemsCount = voiceEnvirDao.getCountByQuery(queryMap);
		
		List<VoiceEnvir> secondCategoryItems = voiceEnvirDao.paginationEnvir(queryMap, pagination);
		pagination.setItems(secondCategoryItems);
		pagination.setTotalItemsCount(totalItemsCount);
		return pagination;
	}

	@Override
	public void deleteEnvir(Long id) {
		voiceEnvirDao.deleteEnvir(id);
	}

	@Override
	public void addEnvir(VoiceEnvir news) {
		voiceEnvirDao.addEnvir(news);
	}

	@Override
	public VoiceEnvir findEnvirById(Long id) {
		return voiceEnvirDao.findEnvirById(id);
	}

	@Override
	public void editEnvir(VoiceEnvir news) {
		voiceEnvirDao.editEnvir(news);
	}

}
