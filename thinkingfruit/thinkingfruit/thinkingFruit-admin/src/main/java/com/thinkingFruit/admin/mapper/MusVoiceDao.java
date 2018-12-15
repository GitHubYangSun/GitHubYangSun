package com.thinkingFruit.admin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.thinkingFruit.admin.entity.MusVoice;
import com.ysdevelop.common.page.Pagination;

public interface MusVoiceDao {
	//查询与遍历文章
		List<MusVoice> paginationMusvoice(@Param("queryMap") Map<String, String> queryMap,@Param("pagination") Pagination<MusVoice> pagination);

		//统计出符合条件的数量
		Integer getCountByQuery(@Param("queryMap") Map<String, String> queryMap);

		//删除文章
		void deleteMusvoice(@Param("id") Long id);

		//添加文章
		void addMusvoice(@Param("musvoice") MusVoice news);

		//根据文章id查询文章
		MusVoice findMusvoiceById(@Param("id") Long id);

		//修改文章信息
		void editMusvoice(@Param("musvoice") MusVoice news);
}
