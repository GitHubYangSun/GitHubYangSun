package com.thinkingFruit.admin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.thinkingFruit.admin.entity.VoiceEnvir;
import com.ysdevelop.common.page.Pagination;

public interface VoiceEnvirDao {

	//查询与遍历新闻
	List<VoiceEnvir> paginationEnvir(@Param("queryMap") Map<String, String> queryMap,@Param("pagination") Pagination<VoiceEnvir> pagination);

	//统计出符合条件的数量
	Integer getCountByQuery(@Param("queryMap") Map<String, String> queryMap);

	//删除新闻
	void deleteEnvir(@Param("id") Long id);

	//添加新闻
	void addEnvir(@Param("envir") VoiceEnvir voice);

	//根据新闻id查询新闻
	VoiceEnvir findEnvirById(@Param("id")Long id);

	//修改新闻信息
	void editEnvir(@Param("envir")VoiceEnvir voice);

}
