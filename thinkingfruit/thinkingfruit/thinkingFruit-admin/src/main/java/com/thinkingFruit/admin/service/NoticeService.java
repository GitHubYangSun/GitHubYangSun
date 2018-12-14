package com.thinkingFruit.admin.service;

import java.util.Map;

import com.thinkingFruit.admin.entity.Notice;
import com.ysdevelop.common.page.Pagination;

public interface NoticeService {

	//查询与遍历新闻
	Pagination<Notice> paginationNews(Pagination<Notice> pagination, Map<String, String> queryMap);

	//删除新闻
	void deleteNews(Long id);

	//添加新闻
	void addNews(Notice news);

	//根据新闻id查询id
	Notice findNewsById(Long id);

	//根据id修改新闻信息
	void editNews(Notice news);

}
