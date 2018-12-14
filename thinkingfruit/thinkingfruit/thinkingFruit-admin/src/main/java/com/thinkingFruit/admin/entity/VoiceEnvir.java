package com.thinkingFruit.admin.entity;

import com.ysdevelop.common.entity.BaseEntity;

public class VoiceEnvir extends BaseEntity{
	private String name;
	
	private String imagePath;
	
	private String intro;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}
	
	
}
