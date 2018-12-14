;
var type_set_ops = {
	init : function() {
		this.inintComponent();
		// this.validateForm();
		this.eventBind();
	},
	renderFrom : function() {
		layui.use('form', function() {
			var form = layui.form;// 高版本建议把括号去掉，有的低版本，需要加()
			form.render();
		});
	},
	eventBind : function() {
		// 立即添加按钮的点击事件
		$(".layui-input-block .layui-btn").click(
				function() {
					var name = $("input[name='name']").val();
					var parentId = $("select[name='parentId']").val();
					var id = $("input[name='id']").val();
					// 判断是添加还是修改
					var url = rf.isEmpty(id) ? "/type" : "/type/" + id;
					var type = rf.isEmpty(id) ? 'POST' : 'PUT';

					$(".layui-input-block .layui-btn").addClass(
							'layui-btn-disabled');
					$.ajax({
						type : type,
						url : WEB_ROOT + url,
						dataType : 'JSON',

						data : {
							id : id,
							name : name,
							parentId : parentId,
						},
						success : function(res) {
							$(".layui-input-block .layui-btn").removeClass(
									"layui-btn-disabled");
							var callback = null;
							if (res.code == 0) {
								callback = function() {
									window.location.href = WEB_ROOT + '/type';
								};
							}
							common_ops.alert(res.msg, callback);
						},
						error : function() {
							$(".layui-input-block .layui-btn").removeClass(
									"layui-btn-disabled");
						}
					});
				});
	},
	inintComponent : function() {
		var that = this;

		// 获取乐谱id
		var id = common_ops.g_getQueryString("id");
		$("input[name='id']").attr("value", id);

		if (id != null) {

			$(".layui-tab-title").empty();
			$(".layui-tab-title").append("<li class='layui-this'>修改</li>");
			$(".layui-input-block").empty();
			$(".layui-input-block")
					.append(
							"<button class='layui-btn news-set' lay-submit='' lay-filter='cate_add'>立即修改</button>");

			$.ajax({
				url : WEB_ROOT + "/type/info",
				data : {
					id : id
				},
				type : 'get',
				dataType : 'json',
				success : function(res) {
					$("input[name='name']").val(res.data.name);
					$("input[name='parentId']").val(res.data.parentId);
					that.renderFrom();
				}
			})
		}

	}
}
$(function() {
	type_set_ops.init();
})