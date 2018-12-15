;
var notice_set_ops = {
	init : function() {
		this.inintComponent();
	},
	inintComponent : function() {
		// 设置id
		var id = common_ops.g_getQueryString("id");
		$("input[name='id']").attr("value", id);

		$.ajax({
			url : WEB_ROOT + "/voiceEnvir/info",
			data : {
				id : id
			},
			type : 'get',
			dataType : 'json',
			success : function(res) {
				$("input[name='title']").val(res.data.title);
				$("input[name='author']").val(res.data.author);
				$("textarea[name='content']").val(res.data.content);
			}
		})

		// layui组件

	}
	
// ,validateForm : function() {
// $(".layui-form").validate();
// }
}
$(function() {
	notice_set_ops.init();
})