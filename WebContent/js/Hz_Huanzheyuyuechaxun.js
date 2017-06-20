$("document")
		.ready(
				function() {
					$("#lis-li-5")
							.click(
									function() {
										$
												.ajax({
													cache : true,
													type : "POST",
													url : "Hz_HuanzheyuyuechaxunServler",
													async : true,
													success : function(data) {
														// // 将数据转换成json对象
														var json = jQuery
																.parseJSON(data);
														// // 将集合对象从传回的数据中获取出来
														var list = json[0].jsonArray;
														var str = "";
														//
														// // 遍历list对象
														for ( var i in json) {
															str += "<table border='0px' width='100%' align='center'><tr width='100%'>"
																	+ "<td width='33%' align='center'>"
																	+ json[i].Yisheng_name
																	+ "</td>"
																	+ "<td width='34%' align='center'>"
																	+ json[i].Yuyue_shijian
																	+ "</td>"
																	+ "<td width='16%' align='center'>"
																	+ json[i].Yuyue_beizhu
																	+ "</td>"
																	+ "<td width='16%' align='center'>"
																	+ "<span id='"
																	+ json[i].Yuyue_id
																	+ "' onclick='quxiaoyuyue("
																	+ json[i].Yuyue_id
																	+ "); return false'>取消预约</span>"
																	+ "</td></tr><table>";

														}

														$(".chaxunyuyue").html(
																str);
														// $(".xinxi_right_1").html(str);
													},
													error : function() {

														alert('错了');

													}
												});
									});

				});

function quxiaoyuyue(id) {
	$
			.ajax({
				type : "post",
				url : "Hz_QuxiaoyuyueServlet?id=" + id,
				async : true,
				success : function(data) {
					// // 将数据转换成json对象
					var json = jQuery.parseJSON(data);
					// // 将集合对象从传回的数据中获取出来
					 var list = json[0].jsonArray;
					var str = "";
					//
					// // 遍历list对象
					for ( var i in json) {
						str += "<table border='0px' width='100%' align='center'><tr width='100%'>"
								+ "<td width='33%' align='center'>"
								+ json[i].Yisheng_name
								+ "</td>"
								+ "<td width='34%' align='center'>"
								+ json[i].Yuyue_shijian
								+ "</td>"
								+ "<td width='16%' align='center'>"
								+ json[i].Yuyue_beizhu
								+ "</td>"
								+ "<td width='16%' align='center'>"
								+ "<span id='"
								+ json[i].Yuyue_id
								+ "' onclick='quxiaoyuyue("
								+ json[i].Yuyue_id
								+ "); return false'>取消预约</span>"
								+ "</td></tr><table>";

					}

					$(".chaxunyuyue").html(str);
					// $(".xinxi_right_1").html(str);
				},
				error : function() {

					alert('错了');

				}
			});

}
