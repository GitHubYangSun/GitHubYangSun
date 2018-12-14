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

import com.thinkingFruit.admin.entity.Message;
import com.thinkingFruit.admin.service.MessageService;
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
@RequestMapping(value="/message")
public class MessageController {
	@Autowired
	MessageService messageService;
	
	@RequestMapping(value = "", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
	public String notice() {		
		return "message/index";
	}
	
	//跳转到公告列表
		@RequestMapping(value = "/set", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
		public String set() {
			return "message/set";
		}
		
		//获取数据(包括查询)
		@RequestMapping(value = "/pagination", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
		@ResponseBody
		public String pagination(HttpServletRequest request,Pagination<Message> pagination){
			Map<String, String> queryMap = HttpUtils.getParameterMap(request);
			messageService.paginationMessage(pagination,queryMap);
			return JSONHelper.bean2json(Result.successPaginationData(pagination.getItems(), pagination.getTotalItemsCount()));
		}
		
		//删除
		@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json;charset=UTF-8")
		@ResponseBody
		public Result<String> deleteNews(@RequestParam(value = "id", required = false)Long id){
			messageService.deleteMessage(id);
			return Result.success("删除成功");
		}
		
}
