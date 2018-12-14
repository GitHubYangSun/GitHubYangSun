package com.thinkingFruit.admin.service;

import java.util.Map;

import com.thinkingFruit.admin.entity.Voice;
import com.ysdevelop.common.page.Pagination;

public interface VoiceService {

	//查询与遍历新闻
	Pagination<Voice> paginationVoice(Pagination<Voice> pagination, Map<String, String> queryMap);

	//删除新闻
	void deleteVoice(Long id);

	//添加新闻
	void addVoice(Voice voice);

	//根据新闻id查询id
	Voice findVoiceById(Long id);

	//根据id修改新闻信息
	void editVoice(Voice voice);

}
