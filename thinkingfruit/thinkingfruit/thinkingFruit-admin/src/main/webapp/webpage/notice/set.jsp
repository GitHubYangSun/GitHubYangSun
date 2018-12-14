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
						<li class="layui-this">添加公告</li>
						
					</ul>
					<div class="layui-tab-content">
						<div class="layui-tab-item layui-show">
							<form class="layui-form">
								
								<input name="id" value="" hidden="hidden">
								
								<div class="layui-form-item">
									<label class="layui-form-label">公告标题</label>
									<div class="layui-input-inline input-custom-width">
										<input type="text" name="title" value=""
											autocomplete="off" required="true" diyCheck="标题不能为空"
											placeholder="请输入公告标题" class="layui-input">
									</div>
								</div>
								
								<div class="layui-form-item">
									<label class="layui-form-label">公告作者</label>
									<div class="layui-input-inline input-custom-width">
										<input type="text" name="author" value=""
											autocomplete="off" required="true" diyCheck="标题不能为空"
											placeholder="请输入公告作者" class="layui-input">
									</div>
								</div>
								<div class="layui-form-item">
									<label class="layui-form-label">公告内容</label>
									<div class="layui-input-inline input-custom-width">
										<textarea name="content" cols="40" rows="25" placeholder="公告内容"></textarea>
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
	
	<script type="text/javascript" charset="utf-8"
		src="<%=basePath%>/static/plugin/ueditor/ueditor.config.js"></script>
	<script type="text/javascript" charset="utf-8"
		src="<%=basePath%>/static/plugin/ueditor/ueditor.all.min.js"></script>
	<script type="text/javascript" charset="utf-8"
		src="<%=basePath%>/static/plugin/ueditor/lang/zh-cn/zh-cn.js"></script>
	<script type="text/javascript"
		src="<%=basePath%>/static/js/notice/set.js"></script>
</body>
</html>

