;
var voiceEnvir_set_ops={
		init:function(){
			this.inintComponent();
//			this.validateForm();
			this.eventBind();
		},
		eventBind:function(){
			// 立即添加按钮的点击事件
			$(".layui-input-block .layui-btn").click(function(){
				
				var nameTarget = $("input[name='name']");
				var name = nameTarget.val();
				
				var coverImagePathTarget = $("input[name='imagePath']");
				var imagePath = coverImagePathTarget.val();
				
				var descriptionTarget = $("input[name='intro']");
				var intro = descriptionTarget.val();
				
				var id = $("input[name='id']").val();
				
				//判断是添加还是修改
				var url = rf.isEmpty(id) ? "/voiceEnvir" : "/voiceEnvir/" + id;
				var type = rf.isEmpty(id) ? 'POST' : 'PUT';
				
				$(".layui-input-block .layui-btn").addClass('layui-btn-disabled');
				$.ajax({
					type : type,
					url : WEB_ROOT + url,
					dataType : 'json',
					data : {
						id:id,
						name : name,
						imagePath : imagePath,
						intro : intro
					},
					success:function(res){
						$(".layui-input-block .layui-btn").removeClass("layui-btn-disabled");
						var callback = null;
						if (res.code == 0) {
							callback = function() {
								window.location.href = WEB_ROOT + '/voiceEnvir';
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
			//获取商品分类id
			var id = common_ops.g_getQueryString("id");
			$("input[name='id']").attr("value",id);
			
			if(id != null){
				
				$(".layui-tab-title").empty();
				$(".layui-tab-title").append("<li class='layui-this'>修改品牌</li>");
				$(".layui-input-block").empty();
				$(".layui-input-block").append("<button class='layui-btn news-set' lay-submit='' lay-filter='cate_add'>立即修改</button>");
				
				$.ajax({
					url:WEB_ROOT+"/voiceEnvir/info",
					data:{
						id:id
					},
					type:'get',
					dataType:'json',
					success:function(res){
						$("input[name='name']").val(res.data.name);
						$("input[name='imagePath']").val(res.data.imagePath);
						$('img').attr('src',WEB_ROOT + res.data.imagePath);
						$("input[name='intro']").val(res.data.intro);
						
					}
				})
			}
			
			//layui组件
			layui.use('upload', function() {
				  var upload = layui.upload;
				  upload.render({
				     elem: '#uploadImage',
				     url : WEB_ROOT+'/upload/image?imageType=6',
				     done : function(res) {
					     $("input[name='imagePath']").attr("value",res.data.imagePath);
					     $('img').attr('src',WEB_ROOT + res.data.imagePath);
					     console.log('上传完毕'); // 上传成功返回值，必须为json格式
				     }
			      });
				  
			});
		},
//		,validateForm : function() {
//			$(".layui-form").validate();
//	   }
}
$(function(){
	voiceEnvir_set_ops.init();
})