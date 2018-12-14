package com.thinkingFruit.admin.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinkingFruit.admin.entity.Notice;
import com.thinkingFruit.admin.mapper.NoticeDao;
import com.thinkingFruit.admin.service.NoticeService;
import com.ysdevelop.common.exception.WebServiceException;
import com.ysdevelop.common.page.Pagination;
import com.ysdevelop.common.result.CodeMsg;

@Service
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	NoticeDao noticeDao;

	@Override
	public Pagination<Notice> paginationNews(Pagination<Notice> pagination, Map<String, String> queryMap) {
		// TODO Auto-generated method stub
		Integer page = null;
		Integer limit = null;
		if (queryMap == null || (page = Integer.valueOf(queryMap.get("page"))) == null || (limit = Integer.valueOf(queryMap.get("limit"))) == null) {
			throw new WebServiceException(CodeMsg.SERVER_ERROR);
		}
		pagination.setPageNum(page);
		pagination.setPageSize(limit);
		
		Integer totalItemsCount = noticeDao.getCountByQuery(queryMap);
		List<Notice> secondCategoryItems = noticeDao.paginationNews(queryMap, pagination);
		pagination.setItems(secondCategoryItems);
		pagination.setTotalItemsCount(totalItemsCount);
		return pagination;
	}

	@Override
	public void deleteNews(Long id) {
		noticeDao.deleteNews(id);
	}

	@Override
	public void addNews(Notice news) {
		noticeDao.addNews(news);
	}

	@Override
	public Notice findNewsById(Long id) {
		return noticeDao.findNewsById(id);
	}

	@Override
	public void editNews(Notice news) {
		noticeDao.editNews(news);
	}

}
