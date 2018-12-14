package com.thinkingFruit.admin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.thinkingFruit.admin.entity.Notice;
import com.ysdevelop.common.page.Pagination;

public interface NoticeDao {

	//查询与遍历公告
	List<Notice> paginationNews(@Param("queryMap") Map<String, String> queryMap,@Param("pagination") Pagination<Notice> pagination);

	//统计出符合条件的数量
	Integer getCountByQuery(@Param("queryMap") Map<String, String> queryMap);

	//删除公告
	void deleteNews(@Param("id") Long id);

	//添加公告
	void addNews(@Param("notice") Notice news);

	//根据公告id查询公告
	Notice findNewsById(@Param("id")Long id);

	//修改公告信息
	void editNews(@Param("notice")Notice news);

}
