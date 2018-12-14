;
var message_index_ops={
		init:function(){
			this.inintComponent();
		},
		inintComponent:function(){
			layui.use([ 'table', 'layer', 'laydate', 'laypage' ], function() {
				laydate = layui.laydate;// 日期插件
				laypage = layui.laypage;// 分页
				layer = layui.layer;// 弹出层
				table = layui.table;
				
				   // 表格渲染
				   var tableIns = table.render({
				       elem: '#dateTable'                  //指定原始表格元素选择器（推荐id选择器）  //容器高度
				       , cols: [[                          //标题栏
                             {field: 'id', title: '编号',align: 'center', width: 70}
				           , {field: 'name', title: '用户名', width: 250,align: 'center'}
				           , {field: 'mobile', title: '用户电话', align: 'center',width: 150}
				           , {field: 'email', title: '邮箱',align: 'center'}
				           , {field: 'content', title: '内容',align: 'center'}
				           , {field: 'createTime', title: '创建时间', templet:'#date_formate',align: 'center',width: 150}
				           , {title: '操作', width: 250,height: 40, align: 'center', templet: '#barOption'} //这里的toolbar值是模板元素的选择器
				       ]]
				       , id: 'dataCheck'
				       , url: WEB_ROOT + "/message/pagination"
				       , method: 'get'
				       , page: true
				       , limit: 10 //默认采用30
				       , limits :[10]
				       , loading: false
				       , done: function (res, curr, count) {
				    	   console.log(res);
				           //得到当前页码
				           console.log(curr);

				           //得到数据总量
				           console.log(count);
				       }
				   });
				   
					//查询信息
					$(".btn-serach").on('click',function(){						
						var name = $("input[ name='name']").val();
						console.log("============"+name)
						var startTime = $("input[ name='startTime']").val();
						var endTime = $("input[ name='endTime']").val();
						
						tableIns.reload({
								where: { //设定异步数据接口的额外参数，任意设
									name: name,
									startTime : startTime,
									endTime : endTime
								}
								,page: {
								  curr: 1 //重新从第 1 页开始
								}
						});
					});
					
					table.on('tool(table-data)', function(obj) {
						var data = obj.data;
						var id = data.id;
						
							//ajax删除
							var msg = "确认删除";
							var callback = {
								'ok' : function() {
									$.ajax({
										type : 'post',
										url : WEB_ROOT + "/message/" + data.id,
										data : {
											_method : 'delete',
											id : id
										},
										dataType : 'json',
										success : function(res) {
											var callback = null;
											if (res.code == 0) {
												callback = function() {
													window.location.href = WEB_ROOT + '/message';
												}
											}
											common_ops.alert(res.msg, callback);
										}
									});
								},
								'cancle' : null
							};
							common_ops.confirm(msg, callback);
										
					});				

				var start = {
					elem : ".layui-form-item input[name='startTime']",
					min : '2017-01-01 23:59:59',
					max : '2099-06-16 23:59:59',
					format : 'yyyy-MM-dd HH:mm:ss',
					type : 'datetime',
					trigger : 'click',
					zIndex : 99999999,
					ready : function(data) {
						start.min = data; // 开始日选好后，重置结束日的最小日期
					},
					change : function(value, date, endDate) {
						start.value = value;
					}
				};

				var end = {
					elem : ".layui-form-item input[name='endTime']",
					min : '2017-01-01 23:59:59',
					max : '2099-06-16 23:59:59',
					format : 'yyyy-MM-dd HH:mm:ss',
					type : 'datetime',
					trigger : 'click',
					zIndex : 99999999,
					ready : function(data) {
						end.max = data; // 结束日选好后，重置开始日的最大日期
					},
					change : function(value, date, endDate) {
						end.value = value;
					}
				};

				laydate.render(start);
				laydate.render(end);
			});
		}
}
$(function(){
	message_index_ops.init();
})