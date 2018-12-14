package com.thinkingFruit.admin.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thinkingFruit.admin.entity.VoiceEnvir;
import com.thinkingFruit.admin.service.VoiceEnvirService;
import com.ysdevelop.common.page.Pagination;
import com.ysdevelop.common.result.Result;
import com.ysdevelop.common.utils.HttpUtils;
import com.ysdevelop.common.utils.JSONHelper;

@Controller
@RequestMapping(value="voiceEnvir")
public class VoiceEnvirController {
	
	@Autowired
	VoiceEnvirService voiceEnvirService;
	
	//跳转到新闻列表
	@RequestMapping(value = "", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
	public String newsIndex() {
		return "voiceEnvir/index";
	}
	
	//跳转到新闻列表
	@RequestMapping(value = "/set", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
	public String set() {
		return "voiceEnvir/set";
	}
	
	//获取数据(包括查询)
	@RequestMapping(value = "/pagination", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String pagination(HttpServletRequest request,Pagination<VoiceEnvir> pagination){
		Map<String, String> queryMap = HttpUtils.getParameterMap(request);
		voiceEnvirService.paginationEnvir(pagination,queryMap);
		return JSONHelper.bean2json(Result.successPaginationData(pagination.getItems(), pagination.getTotalItemsCount()));
	}
	
	//删除新闻
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public Result<String> deleteNews(@RequestParam(value = "id", required = false)Long id){
		voiceEnvirService.deleteEnvir(id);
		return Result.success("删除成功");
	}
	
	//添加新闻
	@RequestMapping(value = "", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public Result<String> addNews(@Valid VoiceEnvir news){
		voiceEnvirService.addEnvir(news);
		return Result.success("添加成功");
	}
	
	//根据id查询新闻信息
	@RequestMapping(value = "/info", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String info(@RequestParam(value = "id", required = false)Long id){
		VoiceEnvir news = voiceEnvirService.findEnvirById(id);
		return JSONHelper.bean2json(Result.successData(news));
	}
	
	//修改新闻信息
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public Result<String> edit(@Valid VoiceEnvir news){
		voiceEnvirService.editEnvir(news);
		return Result.success("修改成功");
	}
	
}
