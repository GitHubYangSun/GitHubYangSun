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

import com.thinkingFruit.admin.entity.MusVoice;
import com.thinkingFruit.admin.service.MusVoiceService;
import com.ysdevelop.common.page.Pagination;
import com.ysdevelop.common.result.Result;
import com.ysdevelop.common.utils.HttpUtils;
import com.ysdevelop.common.utils.JSONHelper;
/**
 * 
 * @author 王珍丰
 *	后台公告管理
 */
@Controller
@RequestMapping(value="/musvoice")
public class MusVoiceController {
	@Autowired
	MusVoiceService musVoiceService;
	
	@RequestMapping(value = "", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
	public String musVoiceService() {		
		return "musvoice/index";
	}
	
	//跳转到音频乐谱列表
		@RequestMapping(value = "/set", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
		public String set() {
			return "musvoice/set";
		}
		
		//获取数据(包括查询)
		@RequestMapping(value = "/pagination", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
		@ResponseBody
		public String pagination(HttpServletRequest request,Pagination<MusVoice> pagination){
			Map<String, String> queryMap = HttpUtils.getParameterMap(request);
			musVoiceService.paginationMusvoice(pagination, queryMap);
			return JSONHelper.bean2json(Result.successPaginationData(pagination.getItems(), pagination.getTotalItemsCount()));
		}
		
		//删除
		@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json;charset=UTF-8")
		@ResponseBody
		public Result<String> deleteNews(@RequestParam(value = "id", required = false)Long id){
			musVoiceService.deleteMusvoice(id);;
			return Result.success("删除成功");
		}
		
		//添加
		@RequestMapping(value = "", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
		@ResponseBody
		public Result<String> addNews(@Valid MusVoice news){
			musVoiceService.addMusvoice(news);;
			return Result.success("添加成功");
		}
		
		//根据id查询信息
		@RequestMapping(value = "/info", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
		@ResponseBody
		public String info(@RequestParam(value = "id", required = false)Long id){
			MusVoice news = musVoiceService.findMusvoiceById(id);
			return JSONHelper.bean2json(Result.successData(news));
		}
		
		//修改信息
		@RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = "application/json;charset=UTF-8")
		@ResponseBody
		public Result<String> edit(@Valid MusVoice news){
			musVoiceService.editMusvoice(news);
			return Result.success("修改成功");
		}
}
