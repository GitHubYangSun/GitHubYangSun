;
var permission_index_ops = {
	init : function() {
		this.eventBind();
		this.inintComponent();
	},
	eventBind : function() {
		// 重置表单按钮.使用时class为layui-btn layui-btn-warm btn-reset到的重置按钮
		$(".btn-reset").click(function() {
			$('input').val('');
			$(".layui-form select option[value='']").attr("selected", true);
		});
	},
	inintComponent : function() {
		layui.use([ 'table', 'layer', 'laydate', 'laypage' ], function() {
			laydate = layui.laydate;// 日期插件
			laypage = layui.laypage;// 分页
			layer = layui.layer;// 弹出层
			table = layui.table;

			// 表格渲染
			var tableIns = table.render({
				elem : '#dateTable' // 指定原始表格元素选择器（推荐id选择器） //容器高度
				,
				cols : [ [ // 标题栏
				{
					field : 'id',
					title : '权限ID',
					align : 'center',
					width : 100
				}, {
					field : 'name',
					title : '权限名称',
					align : 'center'
				}, {
					field : 'parentId',
					title : '父权限ID',
					align : 'center',
					width : 100
				}, {
					field : 'url',
					title : '权限url',
					align : 'center'
				}, {
					field : 'description',
					title : '权限描述',
					align : 'center'
				}, {
					fixed : 'right',
					title : '操作',
					width : 200,
					height : 40,
					align : 'center',
					templet : '#barOption'
				} ] ],
				url : WEB_ROOT + "/permission/pagination",
				method : 'get',
				page : true,
				limit : 10 // 默认采用30
				,
				limits : [ 10 ],
				loading : false,
				done : function(res, curr, count) {
					console.log(res);

					// 得到当前页码
					console.log(curr);

					// 得到数据总量
					console.log(count);
				}
			});

			// 查询信息
			$(".btn-serach").on('click', function() {
				var permissionName = $("input[ name='permissionName']").val();
				var permissionUrl = $("input[ name='permissionUrl']").val();

				tableIns.reload({
					where : { // 设定异步数据接口的额外参数，任意设
						permissionName : permissionName,
						permissionUrl : permissionUrl
					},
					page : {
						curr : 1
					// 重新从第 1 页开始
					}
				});
			});

			table.on('tool(table-data)', function(obj) {
				var data = obj.data;
				var id = data.id;
				if (obj.event == 'detail') {
					// 跳转修改权限界面
					window.location.href = WEB_ROOT + '/permission/set?id='
							+ id;
				} else {
					var callback = {
						'ok' : function() {
							// 异步删除权限
							$.ajax({
								url : WEB_ROOT + '/permission',
								data : {
									id : id,
									_method : 'delete'
								},
								type : 'POST',
								dataType : "json",
								success : function(res) {
									var callback = null;
									if (res.code == 0) {
										callback = function() {
											window.location.href = WEB_ROOT
													+ '/permission';
										}
									}
									common_ops.alert(res.msg, callback);
								}
							});
						},
						'cancle' : null
					};
					common_ops.confirm("是否确定删除" + data.name + "权限", callback);
				}
			})

		});
	}
}
$(function() {
	permission_index_ops.init();
})