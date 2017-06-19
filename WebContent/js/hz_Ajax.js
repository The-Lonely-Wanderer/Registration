$("document")
		.ready(
				function() {
					$("#lis-li-3")
							.click(
									function() {
										$
												.ajax({
													cache : true,
													type : "POST",
													url : "Hz_KeshiyuyueAjaxServlet",
													// data:$('#aa').serialize(),// 你的formid
													async : true,
													success : function(data) {
														// 将数据转换成json对象
														var json = jQuery
																.parseJSON(data);
														// 将集合对象从传回的数据中获取出来
														var list = json[0].jsonArray;
														var str = "";

														// 遍历list对象
														for ( var i in json) {
															str += "<table border='0px' width='100%'  align='center'><tr width='100%'><td align='center'>"
																	+ json[i].Kehsi_name
																	+ "</td><td width='40%' align='center'>"
																	+ json[i].Keshi_jianjie
																	+ "</td><td width='20%' align='center'><span id='"
																	+ json[i].Keshi_id
																	+ "' onclick='look("
																	+ json[i].Keshi_id
																	+ "); return false'>点击查看</span></td></tr><table>";
															// <input
															// type='button'
															// value='查看医生'
															// ></td></tr><table>";
															// alert(json[i].Keshi_id);
															// +json[i].Keshi_id+

														}
														$(".zhi1").html(str);
														// $(".xinxi_right_1").html(str);
													},
													error : function() {

														alert('错了');

													}
												});
									});

				});

// 查询医生

function look(id) {
	$
			.ajax({
				type : "post",
				url : "Hz_YishengchaxunServlet?id=" + id,
				async : true,
				success : function(alist) {
					var json = jQuery.parseJSON(alist);
					var str = "";
					for ( var i in json) {
						str += "<table border='0px' width='100%'  align='center'><tr width='100%'>"
								+ "<td align='center' width='30%' bgcolor='#9CCFFF'>"
								+ json[i].getYisheng_name
								+ "</td><td width='10%' align='center' bgcolor='#9CCFFF'>"
								+ json[i].getYisheng_sex
								+ "</td><td width='20%' align='center' bgcolor='#9CCFFF'>"
								+ json[i].getYisheng_age
								+ "</td><td width='30%' align='center' bgcolor='#9CCFFF'>"
								+ json[i].getYisheng_zhicheng
								+ "</td><td width='40%' align='center' bgcolor='#9CCFFF'><span id='"
								+ json[i].getYisheng_id
								+ "' onclick='hz_yisheng("
								+ json[i].getYisheng_id
								+ "); return false'>点击预约</span>"
								+ "</td></tr><table>";

					}
					$(".keshiyisheng").html(str);
					$(".keshiyisheng").html(str)
				}
			});
}


//预约的医生Ajax
function hz_yisheng(id) {
		
	$ 
			.ajax({
				type : "post",
				url : "Hz_KeshiyishengyuyueServlet?id=" + id,
				async : true,
				data : {
					beizhu : $("#beizhu").val(),
					yisheng_name : $("#user_huanzhe").val()
				},
				success : function(alist) {
					var json = jQuery.parseJSON(alist);
					var str = "";

					for ( var i in json) {
						str += "<table border='0px' width='100%'  align='center'><tr width='100%'>"
								+ "<td align='center' width='30%' >"
								+ json[i].getYisheng_name
								+ "</td><td width='10%' align='center'>"
								+ json[i].getYisheng_sex
								+ "</td><td width='20%' align='center'>"
								+ json[i].getYisheng_age
								+ "</td><td width='30%' align='center'>"
								+ json[i].getYisheng_zhicheng
								+ "</td><td width='40%' align='center'><span id='"
								+ json[i].getYisheng_id
								+ "' onclick='hz_yisheng("
								+ json[i].getYisheng_id
								+ "); return false'>点击预约</span>"
								

								+ "</td></tr><table>";
						

					}
					$(".keshiyisheng").html(str);
					
				}
			});
}








//function hz_yisheng(id) {
//	var name;//age;
//	
//	var iWidth; //弹出窗口的宽度;
//	var iHeight; //弹出窗口的高度;
//	//window.screen.height获得屏幕的高，window.screen.width获得屏幕的宽
//	var iTop = (window.screen.height-30-iHeight)/2; //获得窗口的垂直位置;
//	var iLeft = (window.screen.width-10-iWidth)/2; //获得窗口的水平位置;
//	name=prompt("请输入病因?"); /*在页面上弹出提示对话框，
//	
//	将用户输入的结果赋给变量name*/
//	alert(name); //输出用户输入的信息
////	age=prompt("你今年多大了?","请在这里输入年龄"); /*在页面上再一次弹出提示对话框，
////	讲用户输入的信息赋给变量age*/
////	alert(age)//输出用户输入的信息	
//	}

