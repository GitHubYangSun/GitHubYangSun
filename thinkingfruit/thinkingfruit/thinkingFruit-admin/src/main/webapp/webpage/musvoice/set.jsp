<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/context/begin-tags.jsp"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="/context/css-tags.jsp" />
<style type="text/css">
.load-file {
	background-color: #7dce92;
	margin-left: 12%;
}

p {
	margin-left: 12%
}

.layui-upload-list img {
	margin-left: 12%
}

.news-set {
	margin-top: 3%;
}
</style>
</head>
<body>
	<div class="layui-tab-brief main-tab-container">
		<div class="layui-tab-content">
			<div class="layui-tab-item layui-show">
				<div class="layui-tab layui-tab-card">
					<ul class="layui-tab-title">
						<li class="layui-this">添加产品</li>

					</ul>
					<div class="layui-tab-content">
						<div class="layui-tab-item layui-show">
							<form class="layui-form">
								<input name="id" value="" hidden="hidden">
								
								<div class="layui-form-item">
								    <label class="layui-form-label"> <span class="x-red">*</span>视频上传
									</label>
									<div class="layui-input-inline input-custom-width layui-upload">
										<div class="layui-box layui-upload-button"
											style="float: left; left: 0px; border: 1px solid #D2D2D2; width: 150px; background-color: #98a3b9; text-align: center;">
											<span class="layui-upload-icon"><i class="layui-icon"></i>商品视频上传</span>
										</div>
										<input id="uploadVideo" name="uploadVideo"
											class="layui-input image-upload" type="file"
											autocomplete="off" style="opacity: 0;">
									</div>
								</div>
								
								<div style="margin-left:130px;margin-bottom: 35px;">
									<video id="video" controls="controls" src="" width="320" height="240">
									</video>
								</div>
								<div class="layui-form-item">
									<label class="layui-form-label">视频地址</label>
									<div class="layui-input-inline input-custom-width">
										<input type="text" name="videoPath" value="" required="true"
											diyCheck="视频简介" autocomplete="off" placeholder="请上传视频"
											class="layui-input">
									</div>
								</div>
								<div class="layui-form-item">
									<label class="layui-form-label">视频简介</label>
									<div class="layui-input-inline input-custom-width">
										<input type="text" name="descVi" value="" required="true"
											diyCheck="视频简介" autocomplete="off" placeholder="请输入简介"
											class="layui-input">
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
											placeholder="请上传音频" name="voicePath" autocomplete="off"
											class="layui-input">
									</div>
								</div>
								<div class="layui-form-item">
									<label class="layui-form-label">音频简介</label>
									<div class="layui-input-inline input-custom-width">
										<input type="text" name="descVo" value="" required="true"
											diyCheck="音频简介" autocomplete="off" placeholder="请输入简介"
											class="layui-input">
									</div>
								</div>
							</form>
							<div class="layui-form-item">
								<div class="layui-input-block">
									<button class="layui-btn news-set"
										style="margin-top: 3%; background-color: #69693a;"
										lay-submit="" lay-filter="cate_add">立即添加</button>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<jsp:include page="/context/js-tags.jsp" />
	<script type="text/javascript" charset="utf-8"
		src="<%=basePath%>/static/plugin/ueditor/ueditor.config.js"></script>
	<script type="text/javascript" charset="utf-8"
		src="<%=basePath%>/static/plugin/ueditor/ueditor.all.min.js"></script>
	<script type="text/javascript" charset="utf-8"
		src="<%=basePath%>/static/plugin/ueditor/lang/zh-cn/zh-cn.js"></script>
	<script type="text/javascript"
		src="<%=basePath%>/static/js/musvoice/set.js"></script>
</body>
</html>

