/**
 * 
 * 
 */
function paitentupda(id) {// 患者异步更新
	var i=confirm("确认删除");
	if(i==true){
		
		$.ajax({
			type : "post",
			url : "Admin_huanzhe_delete?id=" + id,
			async : true,
			success : function(patientslist) {
				var json = jQuery.parseJSON(patientslist);
				var list = json[0].patientslist;
				var str = "";
				for ( var i in list) {
					str += "<tr><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
							+ list[i].user_name
							+ "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
							+ list[i].user_password
							+ "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
							+ list[i].user_type
							+ "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
							+ list[i].user_realname
							+ "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
							+ list[i].user_address
							+ "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
							+ list[i].user_tel
							+ "</td><td><span id='"
							+ list[i].user_id
							+ "' onclick='paitentupda("+list[i].user_id + ");'>删除</span></td></tr>";
				}
				$("#huanzhe_div").html("<table><tr><th style='width:100px;height:20px;'>用户名</th><th style='width:200px;height:20px;'>密码</th><th style='width:200px;height:20px;'>类型</th><th style='width:125px;height:20px;'>真实姓名</th><th style='width:400px;height:20px;'>地址</th><th style='width:50px;height:20px;'>电话</th><th>删除</th></tr>"
										+ str + "</table>");

			}
		});
		
		
	}
	
}
function doctorupda(id) {// 医生异步更新
	var i=confirm("确认删除");
	if(i==true){
		
		$.ajax({
			type : "post",
			url : "Admin_doctor_delete?id=" + id,
			async : true,
			success : function(doctordelete) {
				var json = jQuery.parseJSON(doctordelete);
				var doctorlist = json[0].doctordelete;
				var str = "";
				for ( var i in doctorlist) {
					str += "<tr><td id='doctor_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
							+ doctorlist[i].yisheng_id
							+ "</td><td id='doctor_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
							+ doctorlist[i].yisheng_name
							+ "</td><td id='doctor_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
							+ doctorlist[i].yisheng_password
							+ "</td><td id='doctor_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
							+ doctorlist[i].yisheng_sex
							+ "</td><td id='doctor_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
							+ doctorlist[i].yisheng_age
							+ "</td><td id='doctor_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
							+ doctorlist[i].yisheng_zhicheng
							+ "</td><td id='doctor_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
							+ doctorlist[i].keshi_id
							+ "</td><td><span id='"
							+ doctorlist[i].yisheng_id
							+ "' onclick='javascript:doctorupda("+doctorlist[i].yisheng_id
							+ ");'>删除</span></td></tr>";
				}
				$("#doctor_div") .html(
								"<table><tr><th style='width:85px;height:20px;'>医生ID</th><th style='width:100px;height:20px;'>用户名</th><th style='width:200px;height:20px;'>密码</th><th style='width:40px;height:20px;'>性别</th><th style='width:125px;height:20px;'>年龄</th><th style='width:400px;height:20px;'>职称</th><th>科室ID</th><th>删除</th></tr>"
										+ str + "</table>");
			}
		});
		
		
	}
	
}
function adminupda(id) {// 管理员异步更新
	var i=confirm("确认删除");
	if(i==true){
		
		$.ajax({
			type : "post",
			url : "Admin_admin_delete?id=" + id,
			async : true,
			success : function(adminslist) {
				var json = jQuery.parseJSON(adminslist);
				var Adminlist = json[0].adminslist;
				var str = "";
				// console.log(Adminlist);
				for ( var i in Adminlist) {
					str += "<tr><td id='admin_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
							+ Adminlist[i].user_id
							+ "</td><td id='admin_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
							+ Adminlist[i].userName
							+ "</td><td id='admin_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
							+ Adminlist[i].userPassword
							+ "</td>"
							+ "<td><span id='"
							+ Adminlist[i].user_id
							+ "' onclick='javascript:adminupda("+Adminlist[i].user_id
							+ ");'>删除</span></td></tr>";
				}
				$("#admin_div") .html(
								"<table><tr><th style='width:100px;height:20px;'>管理员ID</th><th style='width:200px;height:20px;'>用户名</th><th style='width:50px;height:20px;'>密码</th><th>删除</th></tr>"
										+ str + "</table>");
			}
		});
			
	}
	
}
function news(id){//公告删除
	var i=confirm("确认删除？");
	if(i==true){
		$(".newsp .gonggao_con .close").parent(".gonggao_con").slideUp(300);
		$.ajax({
			type:"get",
			url:"Admin_news_servlet?id="+id,
			async:true,
			success:function(flage){
//				alert(flage);
				var json=jQuery.parseJSON(flage);
				if(true==json){
					alert("删除成功,请刷新页面");
				}else{
					alert("删除失败，请联系技术人员...");
				}
			}	
		});
		event.stopPropagation();
	}
	
}
$("#lis-li-1").click(function() {// 管理员个人信息
	$(".xinxi_right_1").eq(0).show().siblings().hide();
});
$("#lis-li-2").click(
				function(event) {// 所用患者用户
					$(".xinxi_right_1").eq(1).show().siblings().hide();
					$ .ajax({
								type : "get",
								url : "Admnin_patient_list",
								async : true,
								success : function(alList) {
									var json = jQuery.parseJSON(alList);
									var list = json[0].alList;
									var str = "";
									// console.log(alList);
									for ( var i in list) {
										str += "<tr><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
												+ list[i].user_name
												+ "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
												+ list[i].user_password
												+ "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
												+ list[i].user_type
												+ "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
												+ list[i].user_realname
												+ "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
												+ list[i].user_address
												+ "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
												+ list[i].user_tel
												+ "</td><td><span id='"
												+ list[i].user_id
												+ "' onclick='javascript:paitentupda("
												+list[i].user_id
												+ ");'>删除</span></td></tr>";
									}
									$("#huanzhe_div")
											.html(
													"<table><tr><th style='width:100px;height:20px;'>用户名</th><th style='width:200px;height:20px;'>密码</th><th style='width:200px;height:20px;'>类型</th><th style='width:125px;height:20px;'>真实姓名</th><th style='width:400px;height:20px;'>地址</th><th style='width:50px;height:20px;'>电话</th><th>删除</th></tr>"
															+ str + "</table>");
								}
							});
				});
$("#lis-li-3").click(
				function() {// 所有医生用户
					$(".xinxi_right_1").eq(2).show().siblings().hide();
					$ .ajax({
								type : "get",
								url : "Admnin_doctor_list",
								async : true,
								success : function(adoctorlList) {
									var json = jQuery.parseJSON(adoctorlList);
									var doctorlist = json[0].doctorlList;
									var str = "";
									// console.log(doctorlist);
									for ( var i in doctorlist) {
										str += "<tr><td id='doctor_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
												+ doctorlist[i].yisheng_id
												+ "</td><td id='doctor_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
												+ doctorlist[i].yisheng_name
												+ "</td><td id='doctor_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
												+ doctorlist[i].yisheng_password
												+ "</td><td id='doctor_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
												+ doctorlist[i].yisheng_sex
												+ "</td><td id='doctor_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
												+ doctorlist[i].yisheng_age
												+ "</td><td id='doctor_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
												+ doctorlist[i].yisheng_zhicheng
												+ "</td><td id='doctor_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
												+ doctorlist[i].keshi_id
												+ "</td><td><span id='"
												+ doctorlist[i].yisheng_id
												+ "' onclick='javascript:doctorupda("+doctorlist[i].yisheng_id
												+ ");'>删除</span></td></tr>";
									}
									$("#doctor_div")
											.html(
													"<table><tr><th style='width:85px;height:20px;'>医生ID</th><th style='width:100px;height:20px;'>用户名</th><th style='width:200px;height:20px;'>密码</th><th style='width:40px;height:20px;'>性别</th><th style='width:125px;height:20px;'>年龄</th><th style='width:400px;height:20px;'>职称</th><th>科室ID</th><th>删除</th></tr>"
															+ str + "</table>");
								}
							});

				});
$("#lis-li-4").click( function() {// 所有管理员用户

					$(".xinxi_right_1").eq(3).show().siblings().hide();
					$ .ajax({
								type : "get",
								url : "Admnin_admin_list",
								async : true,
								success : function(adminlist) {
									var json = jQuery.parseJSON(adminlist);
									var Adminlist = json[0].adminlist;
									var str = "";
									// console.log(Adminlist);
									for ( var i in Adminlist) {
										str += "<tr><td id='admin_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
												+ Adminlist[i].user_id
												+ "</td><td id='admin_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
												+ Adminlist[i].userName
												+ "</td><td id='admin_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
												+ Adminlist[i].userPassword
												+ "</td>"
												+ "<td><span id='"
												+ Adminlist[i].user_id
												+ "' onclick='javascript:adminupda("+Adminlist[i].user_id
												+ ");'>删除</span></td></tr>";
									}
									$("#admin_div")
											.html(
													"<table><tr><th style='width:100px;height:20px;'>管理员ID</th><th style='width:200px;height:20px;'>用户名</th><th style='width:50px;height:20px;'>密码</th><th>删除</th></tr>"
															+ str + "</table>");
								}
							});

				});
$("#lis-li-5").click( function() {// 公告弹窗退出
	$(".xinxi_right_1").eq(4).show().siblings().hide();
});

$("#ok2").click(function() {
	$.ajax({
		type : "get",
		url : "Admin_news_servle",
		async : true,
		data : {
			title : $("#title").val(),
			message : $("#messages").val()
		},
		success : function(Allnews) {
			var json = jQuery.parseJSON(Allnews);
			var flage = json[0].Allnews;
			if (flage == true) {
				alert("公告发布成功");
			} else {
				alert("公告发布失败，请重新发布");
			}
		}
	});

});

$("#changebut").click(function() {
	$("#changeform").show();
});

$("#no").click(function() {
	$("#changeform").hide();
});

$(".newsp").click(function() {//公告弹窗
	var _index = $(this).index();
	// alert(_index);
	$(".newsp .gonggao_con").eq(_index).slideDown(300);
});

$(".newsp .gonggao_con .close").click(function(event) {
	// var _index=$(this).index();
	$(this).parent(".gonggao_con").slideUp(300);
	event.stopPropagation();
});

$("#ok").click(function() {
	$("#changeform").submit();
});
$("#doctorRegister").click(function() {//添加医生用户提交
	$("#doctor_add").css("display", "block");

});

$("#doctorusername").blur(function() {//非空提示

	var name = $("#doctorusername").val();
	if (name != "") {
		$(".doctors").eq(0).css("display", "none");
	} else {

		$(".doctors").eq(0).css("display", "block");
	}

});
$("#doctorpassword").blur(function() {//非空提示

	var name = $("#doctorpassword").val();
	if (name != "") {
		$(".doctors").eq(1).css("display", "none");
	} else {

		$(".doctors").eq(1).css("display", "block");
	}

});
$("#doctorsex").blur(function() {//非空提示

	var name = $("#doctorsex").val();
	if (name != "") {
		$(".doctors").eq(2).css("display", "none");
	} else {

		$(".doctors").eq(2).css("display", "block");
	}

});
$("#doctorage").blur(function() {//非空提示

	var name = $("#doctorage").val();
	if (name != "") {
		$(".doctors").eq(3).css("display", "none");
	} else {

		$(".doctors").eq(3).css("display", "block");
	}

});

$("#doctorzhicheng").blur(function() {//非空提示

	var name = $("#doctorzhicheng").val();
	if (name != "") {
		$(".doctors").eq(4).css("display", "none");
	} else {

		$(".doctors").eq(4).css("display", "block");
	}

});

$("#doctorkeshiid").blur(function() {//非空提示

	var name = $("#doctorkeshiid").val();
	if (name != "") {
		$(".doctors").eq(5).css("display", "none");
	} else {

		$(".doctors").eq(5).css("display", "block");
	}

});

$("#doctorbut").click(function(event) {

	var flage = $("#flage").val();
	var name = $("#doctorusername").val();
	var password = $("#doctorpassword").val();
	var sex = $("#doctorsex").val();
	var age = $("#doctorage").val();
	var zhicheng = $("#doctorzhicheng").val();
	var kehsiid = $("#doctorkeshiid").val();
	$("#flage").val("F5");
	if (name != "") {
		if (password != "") {
			if (sex != "") {
				if (age != "") {
					if (zhicheng != "") {
						if (kehsiid != "") {
								$.ajax({
									type:"post",
									url:"Admin_addDoctor_servlet",
									async:true,
									data:{
										doctorusername:name,
										doctorpassword:password,
										doctorsex:sex,
										doctorage:age,
										doctorzhicheng:zhicheng,
										doctorkeshiid:kehsiid
									},
									success:function(yishenglist){
										
										var json = jQuery.parseJSON(yishenglist);
										var doctorlist = json[0].yishenglist;
										var str = "";
										for ( var i in doctorlist) {
											str += "<tr><td id='doctor_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
													+ doctorlist[i].yisheng_id
													+ "</td><td id='doctor_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
													+ doctorlist[i].yisheng_name
													+ "</td><td id='doctor_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
													+ doctorlist[i].yisheng_password
													+ "</td><td id='doctor_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
													+ doctorlist[i].yisheng_sex
													+ "</td><td id='doctor_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
													+ doctorlist[i].yisheng_age
													+ "</td><td id='doctor_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
													+ doctorlist[i].yisheng_zhicheng
													+ "</td><td id='doctor_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
													+ doctorlist[i].keshi_id
													+ "</td><td><span id='"
													+ doctorlist[i].yisheng_id
													+ "' onclick='javascript:doctorupda("+doctorlist[i].yisheng_id
													+ ");'>删除</span></td></tr>";
										}
										$("#doctor_div") .html(
														"<table><tr><th style='width:85px;height:20px;'>医生ID</th><th style='width:100px;height:20px;'>用户名</th><th style='width:200px;height:20px;'>密码</th><th style='width:40px;height:20px;'>性别</th><th style='width:125px;height:20px;'>年龄</th><th style='width:400px;height:20px;'>职称</th><th>科室ID</th><th>删除</th></tr>"
																+ str + "</table>");
										
										
										
										
										
										
									}
								});
							
						} else {

							$(".doctors").eq(5).css("display", "block");
						}

					} else {

						$(".doctors").eq(4).css("display", "block");
					}

				} else {
					$(".doctors").eq(3).css("display", "block");
				}

			} else {

				$(".doctors").eq(2).css("display", "block");
			}

		} else {
			$(".doctors").eq(1).css("display", "block");
		}

	} else {
		$(".doctors").eq(0).css("display", "block");
	}
	event.stopPropagation();
});
$("#doctorno").click(function() {
	$("#doctor_add").css("display", "none");

});
$("#doctorshuaxin").click(function() {
	window.location.reload();
});

$("#AdminRegister").click(function() {//添加管理员
	$("#admin_add").css("display", "block");
});
$("#adminrno").click(function() {
	$("#admin_add").css("display", "none");

});

$("#adminusername").blur(function() {//管理员添加非空

	var name = $("#adminusername").val();
	if (name != "") {
		$(".admins").eq(0).css("display", "none");
	} else {

		$(".admins").eq(0).css("display", "block");
	}

});
$("#adminpassword").blur(function() {//管理员添加非空

	var name = $("#adminpassword").val();
	if (name != "") {
		$(".admins").eq(1).css("display", "none");
	} else {

		$(".admins").eq(1).css("display", "block");
	}

});

$("#adminbut").click(function(event) {
	var name = $("#adminusername").val();
	var password = $("#adminpassword").val();
		if (name != "") {
			if (password != "") {
					$("#admin_add").css("display", "none");
					$.ajax({
							type:"post",
							url:"Admin_add_servlet",
							async:true,
							data:{
								adminusername:name,
								adminpassword:password
							},
							success:function(adminlist){
								alert(adminlist);
								var json = jQuery.parseJSON(adminlist);
								var Adminlist = json[0].adminlist;
								var str = "";
								// console.log(Adminlist);
								for ( var i in Adminlist) {
									str += "<tr><td id='admin_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
											+ Adminlist[i].user_id
											+ "</td><td id='admin_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
											+ Adminlist[i].userName
											+ "</td><td id='admin_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>"
											+ Adminlist[i].userPassword
											+ "</td>"
											+ "<td><span id='"
											+ Adminlist[i].user_id
											+ "' onclick='javascript:adminupda("+Adminlist[i].user_id
											+ ");'>删除</span></td></tr>";
								}
								$("#admin_div") .html(
												"<table><tr><th style='width:100px;height:20px;'>管理员ID</th><th style='width:200px;height:20px;'>用户名</th><th style='width:50px;height:20px;'>密码</th><th>删除</th></tr>"
														+ str + "</table>");
							}
					});
			} else {
				$(".admins").eq(1).css("display", "block");
			}

		} else {
			$(".admins").eq(0).css("display", "block");
		}
	
	event.stopPropagation();
});
