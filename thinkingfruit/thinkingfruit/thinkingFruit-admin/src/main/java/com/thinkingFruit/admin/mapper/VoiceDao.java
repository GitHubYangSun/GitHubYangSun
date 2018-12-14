package com.thinkingFruit.admin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.thinkingFruit.admin.entity.Voice;
import com.ysdevelop.common.page.Pagination;

public interface VoiceDao {

	//查询与遍历新闻
	List<Voice> paginationVoice(@Param("queryMap") Map<String, String> queryMap,@Param("pagination") Pagination<Voice> pagination);

	//统计出符合条件的数量
	Integer getCountByQuery(@Param("queryMap") Map<String, String> queryMap);

	//删除新闻
	void deleteVoice(@Param("id") Long id);

	//添加新闻
	void addVoice(@Param("voice") Voice voice);

	//根据新闻id查询新闻
	Voice findVoiceById(@Param("id")Long id);

	//修改新闻信息
	void editVoice(@Param("voice")Voice voice);

}
