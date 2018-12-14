<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/context/begin-tags.jsp"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="/context/css-tags.jsp" />
</head>
<body>
	<div class="layui-tab-brief main-tab-container">
		<div class="layui-tab-content">
			<div class="layui-tab-item layui-show">
				<div class="layui-tab layui-tab-card">
					<ul class="layui-tab-title">
						<li class="layui-this">添加记录</li>
						
					</ul>
					<div class="layui-tab-content">
						<div class="layui-tab-item layui-show">
							<form class="layui-form">
								
								<input name="id" value="" hidden="hidden">
								
								<div class="layui-form-item">
									<label class="layui-form-label">歌曲名字</label>
									<div class="layui-input-inline input-custom-width">
										<input type="text" name="songName" value="" required="true" 
											autocomplete="off" placeholder="请输入歌曲名字"
											class="layui-input">
									</div>
								</div>
								<div class="layui-form-item">
									<label class="layui-form-label">歌手姓名</label>
									<div class="layui-input-inline input-custom-width">
										<input type="text" name="name" value=""
											autocomplete="off" required="true" diyCheck="标题不能为空"
											placeholder="请输入歌手姓名" class="layui-input">
									</div>
								</div>
								<div class="layui-form-item">
									<label class="layui-form-label">手机号码</label>
									<div class="layui-input-inline input-custom-width">
										<input type="text" name="mobile" value=""
											autocomplete="off" required="true" diyCheck="标题不能为空"
											placeholder="请输入手机号码" class="layui-input">
									</div>
								</div>
								<div class="layui-form-item">
									<label class="layui-form-label">歌曲介绍</label>
									<div class="layui-input-inline input-custom-width">
										<input type="text" name="songInfo" value=""
											autocomplete="off" required="true" diyCheck="标题不能为空"
											placeholder="请输入歌曲介绍" class="layui-input">
									</div>
								</div>
								<div class="layui-form-item">
									<label class="layui-form-label">歌手简介</label>
									<div class="layui-input-inline input-custom-width">
										<input type="text" name="intro" value=""
											autocomplete="off" required="true" diyCheck="标题不能为空"
											placeholder="请输入歌手简介" class="layui-input">
									</div>
								</div>
								
								<div class="layui-form-item">
									<label class="layui-form-label"> <span class="x-red">*</span>音频上传
									</label>
									<div class="layui-input-inline input-custom-width layui-upload">
										<div class="layui-box layui-upload-button"
											style="float: left; left: 0px; border: 1px solid #D2D2D2; width: 150px; background-color: #98a3b9; text-align: center;">
											<span class="layui-upload-icon"><i class="layui-icon"></i>上传音频</span>
										</div>
										<input id="uploadAudio" name="audioFile" class="" type="file"
											autocomplete="off" style="opacity: 0;">
									</div>
									<div class="layui-input-inline input-custom-width">
										<audio border="none" name="audio" style="display: none"
											controls="controls" autoplay="autoplay">
									</div>
								</div>

								<div class="layui-form-item">
									<label class="layui-form-label">音频路径</label>
									<div class="layui-input-inline" style="width: 190px;">
										<input type="text" readonly="readonly" value=""
											placeholder="请上传录音" name="voicePath" autocomplete="off"
											class="layui-input">
									</div>
								</div>
								
							</form>
							<div class="layui-form-item">
								<div class="layui-input-block">
									<button class="layui-btn news-set" lay-submit=""
											lay-filter="cate_add">立即添加</button>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<jsp:include page="/context/js-tags.jsp" />
	<script type="text/javascript"
		src="<%=basePath%>/static/js/voice/set.js"></script>
</body>
</html>

