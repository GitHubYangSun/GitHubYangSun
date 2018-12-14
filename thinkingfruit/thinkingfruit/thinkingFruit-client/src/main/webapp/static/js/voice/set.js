;
var voice_set_ops={
		init:function(){
			this.inintComponent();
//			this.validateForm();
			this.eventBind();
		},
		renderFrom:function(){
			 layui.use('form', function(){
				   var form = layui.form;//高版本建议把括号去掉，有的低版本，需要加()
				   form.render();
			 });
		},
		eventBind:function(){
			// 立即添加按钮的点击事件
			$(".layui-input-block .layui-btn").click(function(){
				
				var songName = $("input[name='songName']").val();
				
				var mobile = $("input[name='mobile']").val();
				
				var voicePath = $("input[name='voicePath']").val();
				
				var name = $("input[name='name']").val();
				
				var intro = $("input[name='intro']").val();
				
				var songInfo = $("input[name='songInfo']").val();
				
				var id = $("input[name='id']").val();
				
				//判断是添加还是修改
				var url = rf.isEmpty(id) ? "/voice" : "/voice/" + id;
				var type = rf.isEmpty(id) ? 'POST' : 'PUT';
				
				$(".layui-input-block .layui-btn").addClass('layui-btn-disabled');
				$.ajax({
					type : type,
					url : WEB_ROOT + url,
					dataType : 'json',
					data : {
						id:id,
						songName:songName,
						name : name,
						mobile : mobile,
						voicePath : voicePath,
						intro : intro,
						songInfo:songInfo
					},
					success:function(res){
						$(".layui-input-block .layui-btn").removeClass("layui-btn-disabled");
						var callback = null;
						if (res.code == 0) {
							callback = function() {
								window.location.href = WEB_ROOT + '/voice';
							};
						}
						common_ops.alert(res.msg, callback);
					},
					error:function(){
						$(".layui-input-block .layui-btn").removeClass("layui-btn-disabled");
					}
			    });
		   });
		},
		inintComponent:function(){
			
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
			});
			
			//获取商品分类id
			var id = common_ops.g_getQueryString("id");
			$("input[name='id']").attr("value",id);
			
			if(id != null){
				
				$(".layui-tab-title").empty();
				$(".layui-tab-title").append("<li class='layui-this'>修改品牌</li>");
				$(".layui-input-block").empty();
				$(".layui-input-block").append("<button class='layui-btn news-set' lay-submit='' lay-filter='cate_add'>立即修改</button>");
				
				$.ajax({
					url:WEB_ROOT+"/voice/info",
					data:{
						id:id
					},
					type:'get',
					dataType:'json',
					success:function(res){
						$("input[name='name']").val(res.data.name);
						$("input[name='songName']").val(res.data.songName);
						$("input[name='mobile']").val(res.data.mobile);
						$("input[name='intro']").val(res.data.intro);
						$("input[name='songInfo']").val(res.data.songInfo);
						$("input[name='voicePath']").val(res.data.voicePath);
						that.renderFrom();
					}
				})
			}
			
			//layui组件
		},
//			$(".layui-form").validate();
//	   }
}
$(function(){
	voice_set_ops.init();
})