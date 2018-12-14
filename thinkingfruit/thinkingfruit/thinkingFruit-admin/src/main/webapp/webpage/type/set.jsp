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

.news-set{
	margin-top: 3%;
}
.layui-tab-content{
	height: 500px;
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

								<input name="id" value="" hidden="hidden" readonly="readonly">
								<div class="layui-form-item">
									<label class="layui-form-label">分类名称</label>
									<div class="layui-input-inline input-custom-width">
										<input type="text" name="name" value="" autocomplete="off"
											required="true" placeholder="请输入名称" class="layui-input">
									</div>
								</div>
								
								<div class="layui-form-item">
									<div class="layui-inline">
										<label class="layui-form-label">上级分类</label>
										<div class="layui-input-inline">
											<select name="parentId" class="state" lay-verify="required" lay-search="">
												<option value="1">中国作品</option>
												<option value="2">外国作品</option>
												<option value="3">正谱伴奏</option>
												<option value="4">范读范唱</option>
											</select>
										</div>
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
		src="<%=basePath%>/static/js/type/set.js"></script>
</body>
</html>

