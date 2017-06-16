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
																	+ "); return false'>查看医生</span></td></tr><table>";
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
	$.ajax({
		type : "post",
		url : "Hz_YishengchaxunServlet?id=" + id,
		async : true,
		success : function(alist) {
			 var json = jQuery.parseJSON(alist);
			 var str = "";
			 for ( var i in json) {
					str += "<table border='0px' width='100%'  align='center'><tr width='100%'>" +
							"<td align='center' width='35%' >"
							+ json[i].Kehsi_name+
							"</td><td width='15%' align='center'>"
							+ json[i].getYisheng_sex+
							"</td><td width='15%' align='center'>"
							+ json[i].getYisheng_age +
							"</td><td width='35%' align='center'>"
							+ json[i].getYisheng_zhicheng +
							"</td></tr><table>";
					
			 	}
			 $(".keshiyisheng").html(str);
		}
	});
}

