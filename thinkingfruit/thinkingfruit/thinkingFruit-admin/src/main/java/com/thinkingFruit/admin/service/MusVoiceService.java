package com.thinkingFruit.admin.service;

import java.util.Map;

import com.thinkingFruit.admin.entity.MusVoice;
import com.ysdevelop.common.page.Pagination;

public interface MusVoiceService {

	//查询与遍历新闻
	Pagination<MusVoice> paginationMusvoice(Pagination<MusVoice> pagination, Map<String, String> queryMap);

	//删除新闻
	void deleteMusvoice(Long id);

	//添加新闻
	void addMusvoice(MusVoice news);

	//根据新闻id查询id
	MusVoice findMusvoiceById(Long id);

	//根据id修改新闻信息
	void editMusvoice(MusVoice news);

}
