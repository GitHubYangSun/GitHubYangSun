package com.thinkingFruit.admin.entity;

import com.ysdevelop.common.entity.BaseEntity;

public class MusVoice extends BaseEntity {

	private String name;

	private String author;
	
	private String desc;

	// 图片路径
	private String imagePath;

	// 音频路径
	private String videoPath;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getVideoPath() {
		return videoPath;
	}

	public void setVideoPath(String videoPath) {
		this.videoPath = videoPath;
	}

}
