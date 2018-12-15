package com.thinkingFruit.client.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinkingFruit.client.entity.VoiceEnvir;
import com.thinkingFruit.client.mapper.VoiceEnvirDao;
import com.thinkingFruit.client.service.VoiceEnvirService;

@Service
public class VoiceEnvirServiceImpl implements VoiceEnvirService {

	@Autowired
	VoiceEnvirDao voiceEnvirDao;


	@Override
	public VoiceEnvir findEnvirById(Long id) {
		return voiceEnvirDao.findEnvirById(id);
	}


}
