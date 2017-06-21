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
													url : "chakanaction",
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

															str += "<table border='0px' width='100%'  align='center'><tr width='100%'><td align='center' width='28%'>"
																	+ json[i].Huanzhe_name
																	+ "</td><td width='28%' align='center'>"
																	+ json[i].Yuyue_beizhu
																	+ "</td><td width='28%' align='center'>"
																	+ json[i].Yuyue_shijian
																	+ "</td><td width='14%' align='center'><span id='"
																	+ json[i].Yuyue_id
																	+ "' onclick='look("
																	+ json[i].Yuyue_id
																	+ "); return false'>修改</span></td></tr><table>";

															// alert(json[i].Yuyue_id);

														}
														// alert(doctorlists[i].yuyue_id);

														$(".chakan").html(str);

													},
													error : function() {
														alert('出大事了');
													}

												});
									});
				});


function look(id) {
	$.ajax({
				type : "post",
				url : "xiugaiyuyueaction?id=" + id,
				async : true,
				data : {
					beizhu : $("#beizhu").val(),
				},
				success : function(data) {
					$(".chaxunyuyue").html("<table width='75%' border='0px' align='center'><tr><td bgcolor='#9CCFFF' height='35px' align='center'><div align='center'><font size='4'><b>修改</b></font></div></td></tr><tr align='center'><td><b>备注</b></td></tr><tr align='center'><td><textarea name='MSG' id='beizhu' cols=40 rows=4>建议:</textarea> </td></tr><tr><td></td></tr></table>");
					// $(".xinxi_right_1").html(str);
				},
			})
}