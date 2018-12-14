package com.thinkingFruit.admin.entity;

import org.hibernate.validator.constraints.NotEmpty;

import com.ysdevelop.common.entity.BaseEntity;

public class MusVoice extends BaseEntity {

	//音频简介
	private String descVo;
	
	//视屏简介
	private String descVi;
	
	// 音频路径
	private String voicePath;

	// 视频路径
	private String videoPath;

	public String getDescVo() {
		return descVo;
	}

	public void setDescVo(String descVo) {
		this.descVo = descVo;
	}

	public String getDescVi() {
		return descVi;
	}

	public void setDescVi(String descVi) {
		this.descVi = descVi;
	}

	public String getVoicePath() {
		return voicePath;
	}

	public void setVoicePath(String voicePath) {
		this.voicePath = voicePath;
	}

	public String getVideoPath() {
		return videoPath;
	}

	public void setVideoPath(String videoPath) {
		this.videoPath = videoPath;
	}
}
