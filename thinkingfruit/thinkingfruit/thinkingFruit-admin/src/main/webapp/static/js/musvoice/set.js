;
var musvoice_set_ops = {
	init : function() {
		this.inintComponent();
		// this.validateForm();
		this.eventBind();
	},
	renderFrom:function(){
		 layui.use('form', function(){
			   var form = layui.form;//高版本建议把括号去掉，有的低版本，需要加()
			   form.render();
		 });
	},
	eventBind : function() {
		// 立即添加按钮的点击事件
		$(".layui-input-block .layui-btn").click(function() {
					console.log("aaaaaa");
					var titleTarget = $("input[name='name']");
					var name = titleTarget.val();
					var author = $("input[name='author']").val();
					var descTarget = $("input[name='desc']");
					var desc = descTarget.val();
					var imagePath = $("input[name='imagePath']").val();
					var videoPath = $("input[name='videoPath']").val();
					var id = $("input[name='id']").val();
					// 判断是添加还是修改
					var url = rf.isEmpty(id) ? "/musvoice" : "/musvoice/" + id;
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
							author : author,
							desc : desc,
							imagePath : imagePath,
							videoPath : videoPath
						},
						success : function(res) {
							console.log("author" + author)
							$(".layui-input-block .layui-btn").removeClass(
									"layui-btn-disabled");
							var callback = null;
							if (res.code == 0) {
								callback = function() {
									window.location.href = WEB_ROOT
											+ '/musvoice';
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
		layui.use('upload', function() {
			var upload = layui.upload;
			upload.render({
				elem : '#uploadImage',
				url : WEB_ROOT + '/qiniu/uploadImage',
				done : function(res) {
					$("input[name='imagePath']").val(res.data);
					$('img').show();
					$('img').attr('src', res.data);
					console.log(res);
					console.log('上传完毕'); // 上传成功返回值，必须为json格式
				}
			});
			upload.render({
				elem : '#uploadAudio',
				url : WEB_ROOT + '/qiniu/uploadAudio',
				accept: 'audio',
				done : function(res) {
					$("input[name='videoPath']").val(res.data);
					$('audio').show();
					$('audio').attr('src', res.data);
					console.log(res);
					console.log('上传完毕'); // 上传成功返回值，必须为json格式
				}
			});
		});
		

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
				url : WEB_ROOT + "/musvoice/info",
				data : {
					id : id
				},
				type : 'get',
				dataType : 'json',
				success : function(res) {
					$("input[name='name']").val(res.data.name);
					$("input[name='author']").val(res.data.author);
					$("input[name='desc']").val(res.data.desc);
					$("input[name='imagePath']").val(res.data.imagePath);
					$("input[name='videoPath']").val(res.data.videoPath);
					that.renderFrom();
				}
			})
		}

	}
}
$(function() {
	musvoice_set_ops.init();
})