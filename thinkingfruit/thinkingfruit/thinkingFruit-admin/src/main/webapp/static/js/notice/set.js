;
var notice_set_ops={
		init:function(){
			this.inintComponent();
//			this.validateForm();
			this.eventBind();
		},
		eventBind:function(){
			// 立即添加按钮的点击事件
			
			$(".layui-input-block .layui-btn").click(function(){
				console.log("111111")
				var titleTarget = $("input[name='title']");
				var title = titleTarget.val();
				
				var authorTarget = $("input[name='author']");
				var author = authorTarget.val();
				
				var content = $("textarea[name='content']").val();
				
				var id = $("input[name='id']").val();
				
				//判断是添加还是修改
				var url = rf.isEmpty(id) ? "/notice" : "/notice/" + id;
				var type = rf.isEmpty(id) ? 'POST' : 'PUT';
				
				$(".layui-input-block .layui-btn").addClass('layui-btn-disabled');
				$.ajax({
					type : type,
					url : WEB_ROOT + url,
					dataType : 'json',
					data : {
						id:id,
						title : title,
						author : author,
						content:content
					},
					success:function(res){
						$(".layui-input-block .layui-btn").removeClass("layui-btn-disabled");
						var callback = null;
						if (res.code == 0) {
							callback = function() {
								window.location.href = WEB_ROOT + '/notice';
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
					url:WEB_ROOT+"/notice/info",
					data:{
						id:id
					},
					type:'get',
					dataType:'json',
					success:function(res){
						$("input[name='title']").val(res.data.title);
						$("input[name='author']").val(res.data.author);
						$("textarea[name='content']").val(res.data.content);
					}
				})
			}
			
			//layui组件
			
		}
//		,validateForm : function() {
//			$(".layui-form").validate();
//	   }
}
$(function(){
	notice_set_ops.init();
})