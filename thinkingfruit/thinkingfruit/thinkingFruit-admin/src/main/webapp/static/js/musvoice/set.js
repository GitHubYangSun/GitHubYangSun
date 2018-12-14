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
					var descVi = $("input[name='descVi']").val();
					var descVo = $("input[name='descVo']").val();
					var voicePath = $("input[name='voicePath']").val();
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
							descVi : descVi,
							descVo : descVo,
							voicePath : voicePath,
							videoPath : videoPath
						},
						success : function(res) {
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
				elem : '#uploadAudio',
				url : WEB_ROOT + '/qiniu/uploadAudio',
				accept: 'audio',
				done : function(res) {
					$("input[name='voicePath']").val(res.data);
					$('audio').show();
					$('audio').attr('src', res.data);
					console.log(res);
					console.log('上传完毕'); // 上传成功返回值，必须为json格式
				}
			});
			upload.render({
				elem: '#uploadVideo',
				url : WEB_ROOT+'/upload/video?videoType=0',
				accept:'video',
				done : function(res) {
					// 上传成功返回值，必须为json格式
					common_ops.alert("上传成功",null);
					$("input[name='videoPath']").attr("value",res.data.videoPath);
					
					//添加视频
					$("#video").attr("src",WEB_ROOT+res.data.videoPath);
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
					$("input[name='descVi']").val(res.data.descVi);
					$("input[name='descVo']").val(res.data.descVo);
					$("input[name='voicePath']").val(res.data.voicePath);
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