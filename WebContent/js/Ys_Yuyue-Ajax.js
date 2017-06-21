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
																+ json[i].yuyue_id
																+ "' onclick='look("
																+ json[i].yuyue_id
																+ "); return false'>修改</span></td></tr><table>";
															
															alert(json[i].Huanzhe_name);
															
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
		url : "xiugaiyuyueaction?id" + id,
		async : true,
		success : function(list) {
			var json = jquery.parseJSON(list);
			var doctorliste = json[0].list;
			var str = "";
			for ( var i in list) {
				str += "<table border: 2px solid ;><th>"
						+ doctorliste[i].yuyue_userId + "</th><th>"
						+ doctorliste[i].yuyue_beizhu + "</th><th>"
						+ doctorliste[i].yuyue_yishengId + "</th><th>"
						+ doctorliste[i].yuyue_shijian + "</th><th>"
						+ doctorliste[i].yuyue_paiqishijian + "</th><th>"
						+ doctorliste[i].yuyue_zhuanjiajianyi + "</th><th>"
						+ "</th></table>";
			}
			$(".querenxiugai").html(str);
		}
	})
}