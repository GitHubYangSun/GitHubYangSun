package com.thinkingFruit.admin.entity;

import com.ysdevelop.common.entity.BaseEntity;

public class Message extends BaseEntity {
	private String name;
	
	private String email;
	
	private String mobile;
	
	private String content;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}
