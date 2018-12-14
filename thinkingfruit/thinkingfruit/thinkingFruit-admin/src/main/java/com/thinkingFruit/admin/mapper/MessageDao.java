package com.thinkingFruit.admin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.thinkingFruit.admin.entity.Message;
import com.ysdevelop.common.page.Pagination;

public interface MessageDao {

	//查询与遍历公告
	List<Message> paginationMessage(@Param("queryMap") Map<String, String> queryMap,@Param("pagination") Pagination<Message> pagination);

	//统计出符合条件的数量
	Integer getCountByQuery(@Param("queryMap") Map<String, String> queryMap);

	//删除公告
	void deleteMessage(@Param("id") Long id);


}
