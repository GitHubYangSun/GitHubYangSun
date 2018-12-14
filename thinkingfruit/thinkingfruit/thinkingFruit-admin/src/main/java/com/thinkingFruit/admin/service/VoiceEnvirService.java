package com.thinkingFruit.admin.service;

import java.util.Map;

import com.thinkingFruit.admin.entity.VoiceEnvir;
import com.ysdevelop.common.page.Pagination;

public interface VoiceEnvirService {

	//查询与遍历新闻
	Pagination<VoiceEnvir> paginationEnvir(Pagination<VoiceEnvir> pagination, Map<String, String> queryMap);

	//删除新闻
	void deleteEnvir(Long id);

	//添加新闻
	void addEnvir(VoiceEnvir voiceEnvir);

	//根据新闻id查询id
	VoiceEnvir findEnvirById(Long id);

	//根据id修改新闻信息
	void editEnvir(VoiceEnvir voiceEnvir);

}
