package com.thinkingFruit.client.mapper;

import org.apache.ibatis.annotations.Param;

import com.thinkingFruit.client.entity.VoiceEnvir;

public interface VoiceEnvirDao {

	//根据新闻id查询新闻
	VoiceEnvir findEnvirById(@Param("id")Long id);

}
