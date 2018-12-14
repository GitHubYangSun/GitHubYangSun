package com.ysdevelop.common.entity.system;

import com.ysdevelop.common.entity.BaseEntity;

public class SystemAccessLog extends BaseEntity {
	// 请求浏览器
	private String osAndbroswer;
	// 请求ip
	private String ip;
	// 请求request
	private String requestUrl;
	// 请求的方式
	private String requestMethod;
	// 请求控制器的名称以及方法
	private String requestControllerMethod;
	// 开始时间
	private String startTime;
	// 结束时间
	private String endTime;

	public String getOsAndbroswer() {
		return osAndbroswer;
	}

	public void setOsAndbroswer(String osAndbroswer) {
		this.osAndbroswer = osAndbroswer;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getRequestUrl() {
		return requestUrl;
	}

	public void setRequestUrl(String requestUrl) {
		this.requestUrl = requestUrl;
	}

	public String getRequestMethod() {
		return requestMethod;
	}

	public void setRequestMethod(String requestMethod) {
		this.requestMethod = requestMethod;
	}


	public String getRequestControllerMethod() {
		return requestControllerMethod;
	}

	public void setRequestControllerMethod(String requestControllerMethod) {
		this.requestControllerMethod = requestControllerMethod;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	

}
