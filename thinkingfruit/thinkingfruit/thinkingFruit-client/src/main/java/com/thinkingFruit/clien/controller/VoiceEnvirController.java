package com.thinkingFruit.clien.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thinkingFruit.client.entity.VoiceEnvir;
import com.thinkingFruit.client.service.VoiceEnvirService;
import com.ysdevelop.common.result.Result;
import com.ysdevelop.common.utils.JSONHelper;

@Controller
@RequestMapping(value="voiceEnvir")
public class VoiceEnvirController {
	
	@Autowired
	VoiceEnvirService voiceEnvirService;
	//根据id查询新闻信息
	@RequestMapping(value = "/info", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String info(@RequestParam(value = "id", required = false)Long id){
		VoiceEnvir voiceEnvir = voiceEnvirService.findEnvirById(id);
		return JSONHelper.bean2json(Result.successData(voiceEnvir));
	}
	
	
}
