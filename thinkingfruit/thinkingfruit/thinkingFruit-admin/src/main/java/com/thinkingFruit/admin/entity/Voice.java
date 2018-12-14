package com.thinkingFruit.admin.entity;

import com.ysdevelop.common.entity.BaseEntity;
/**
 * 
 * @author 王珍丰
 * 录音棚的录音管理
 *
 */
public class Voice extends BaseEntity {
	
	//歌曲名字
	private String songName;

	//手机号码
	private String mobile;
	
	//歌手姓名
	private String name;
	
	//歌曲介绍
	private String songInfo;
	
	//歌手简介
	private String intro;
	
	//音频地址
	private String voicePath;

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSongInfo() {
		return songInfo;
	}

	public void setSongInfo(String songInfo) {
		this.songInfo = songInfo;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getVoicePath() {
		return voicePath;
	}

	public void setVoicePath(String voicePath) {
		this.voicePath = voicePath;
	}
	
	
}
