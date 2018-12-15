package com.thinkingFruit.client.mapper;

import org.apache.ibatis.annotations.Param;

import com.thinkingFruit.client.entity.Message;

public interface MessageDao {

	void addMessage(@Param("message") Message message);

}
