package com.thinkingFruit.admin.entity;

import org.hibernate.validator.constraints.NotEmpty;

import com.ysdevelop.common.entity.BaseEntity;

public class Notice extends BaseEntity {

	// 公告标题
	@NotEmpty(message="公告标题不能为空")
	private String title;

	//公告作者
	@NotEmpty(message="公告作者不能为空")
	private String author;
	
	// 公告内容
	@NotEmpty(message="公告内容不能为空")
	private String content;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}


}
