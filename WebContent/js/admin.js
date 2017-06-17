/**
 * 
 */
function paitentupda(id){//患者异步更新
	$.ajax({
		type:"get",
		url:"Admin_huanzhe_delete?id="+id,
		async:true,
		success:function(patientslist){
		var json = jQuery.parseJSON(patientslist);
		var list=json[0].patientslist;
		var str="";
		for ( var i in list) {
			str += "<tr><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + list[i].user_name + "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + list[i].user_password + "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + list[i].user_type+ "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + list[i].user_realname + "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + list[i].user_address + "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + list[i].user_tel + "</td><td><span id='"+list[i].user_id+"' onclick='paitentupda("+list[i].user_id+");'>删除</span></td></tr>";
		}
		$("#huanzhe_div").html("<table><tr><th style='width:100px;height:20px;'>用户名</th><th style='width:200px;height:20px;'>密码</th><th style='width:200px;height:20px;'>类型</th><th style='width:125px;height:20px;'>真实姓名</th><th style='width:400px;height:20px;'>地址</th><th style='width:50px;height:20px;'>电话</th><th>删除</th></tr>"+str+"</table>");
		
		}
	});
}
function doctorupda(id){//医生异步更新
	$.ajax({
		type:"get",
		url:"Admin_doctor_delete?id="+id,
		async:true,
		success:function(doctorlList){
		var json = jQuery.parseJSON(doctorlList);
		var list=json[0].patientslist;
		var str="";
		for ( var i in doctorlist) {
			str += "<tr><td id='doctor_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + doctorlist[i].yisheng_id + "</td><td id='doctor_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + doctorlist[i].yisheng_name + "</td><td id='doctor_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + doctorlist[i].yisheng_password + "</td><td id='doctor_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + doctorlist[i].yisheng_sex + "</td><td id='doctor_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" +doctorlist[i].yisheng_age+ "</td><td id='doctor_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" +doctorlist[i].yisheng_zhicheng+ "</td><td id='doctor_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" +doctorlist[i].keshi_id + "</td><td><span id='"+doctorlist[i].yisheng_id+"' onclick='javascript:doctorupda("+doctorlist[i].yisheng_id+");'>删除</span></td></tr>";
		}
		$("#doctor_div").html("<table><tr><th style='width:85px;height:20px;'>医生ID</th><th style='width:100px;height:20px;'>用户名</th><th style='width:200px;height:20px;'>密码</th><th style='width:40px;height:20px;'>性别</th><th style='width:125px;height:20px;'>年龄</th><th style='width:400px;height:20px;'>职称</th><th>科室ID</th><th>删除</th></tr>"+str+"</table>");
		}
	});
}
function adminupda(id){//管理员异步更新
	$.ajax({
		type:"get",
		url:"Admin_admin_delete?id="+id,
		async:true,
		success:function(patientslist){
		var json = jQuery.parseJSON(patientslist);
		var list=json[0].patientslist;
		var str="";
		for ( var i in list) {
			str += "<tr><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + list[i].user_name + "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + list[i].user_password + "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + list[i].user_type+ "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + list[i].user_realname + "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + list[i].user_address + "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + list[i].user_tel + "</td><td><span id='"+list[i].user_id+"' onclick='paitentupda("+list[i].user_id+");'>删除</span></td></tr>";
		}
		$("#admin_div").html("<table><tr><th style='width:100px;height:20px;'>用户名</th><th style='width:200px;height:20px;'>密码</th><th style='width:200px;height:20px;'>类型</th><th style='width:125px;height:20px;'>真实姓名</th><th style='width:400px;height:20px;'>地址</th><th style='width:50px;height:20px;'>电话</th><th>删除</th></tr>"+str+"</table>");
		
		}
	});
}
$("#lis-li-1").click(function(){//管理员个人信息
	$(".xinxi_right_1").eq(0).show().siblings().hide();
});
$("#lis-li-2").click(function(event){//所用患者用户
	$(".xinxi_right_1").eq(1).show().siblings().hide();

	$.ajax({
		type:"get",
		url:"Admnin_patient_list",
		async:true,
		success:function(alList){
		var json = jQuery.parseJSON(alList);
		var list=json[0].alList;
		var str="";
		console.log(alList);
		for ( var i in list) {
			str += "<tr><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + list[i].user_name + "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + list[i].user_password + "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + list[i].user_type+ "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + list[i].user_realname + "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + list[i].user_address + "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + list[i].user_tel + "</td><td><span id='"+list[i].user_id+"' onclick='javascript:paitentupda("+list[i].user_id+");'>删除</span></td></tr>";
		}
		$("#huanzhe_div").html("<table><tr><th style='width:100px;height:20px;'>用户名</th><th style='width:200px;height:20px;'>密码</th><th style='width:200px;height:20px;'>类型</th><th style='width:125px;height:20px;'>真实姓名</th><th style='width:400px;height:20px;'>地址</th><th style='width:50px;height:20px;'>电话</th><th>删除</th></tr>"+str+"</table>");
		}
	}); 
});
$("#lis-li-3").click(function() {//所有医生用户

	$(".xinxi_right_1").eq(2).show().siblings().hide();
	$.ajax({
		type:"get",
		url:"Admnin_doctor_list",
		async:true,
		success:function(doctorlList){
		var json = jQuery.parseJSON(doctorlList);
		var doctorlist=json[0].doctorlList;
		var str="";
		//console.log(doctorlist);
		for ( var i in doctorlist) {
			str += "<tr><td id='doctor_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + doctorlist[i].yisheng_id + "</td><td id='doctor_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + doctorlist[i].yisheng_name + "</td><td id='doctor_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + doctorlist[i].yisheng_password + "</td><td id='doctor_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + doctorlist[i].yisheng_sex + "</td><td id='doctor_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" +doctorlist[i].yisheng_age+ "</td><td id='doctor_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" +doctorlist[i].yisheng_zhicheng+ "</td><td id='doctor_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" +doctorlist[i].keshi_id + "</td><td><span id='"+doctorlist[i].yisheng_id+"' onclick='javascript:doctorupda("+doctorlist[i].yisheng_id+");'>删除</span></td></tr>";
		}
		$("#doctor_div").html("<table><tr><th style='width:85px;height:20px;'>医生ID</th><th style='width:100px;height:20px;'>用户名</th><th style='width:200px;height:20px;'>密码</th><th style='width:40px;height:20px;'>性别</th><th style='width:125px;height:20px;'>年龄</th><th style='width:400px;height:20px;'>职称</th><th>科室ID</th><th>删除</th></tr>"+str+"</table>");
		}
	}); 

});
$("#lis-li-4").click(function() {//所有管理员用户

	$(".xinxi_right_1").eq(3).show().siblings().hide();
	$.ajax({
		type:"get",
		url:"Admnin_admin_list",
		async:true,
		success:function(alList){
		var json = jQuery.parseJSON(alList);
		var list=json[0].alList;
		var str="";
		console.log(alList);
		for ( var i in list) {
			str += "<tr><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + list[i].user_name + "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + list[i].user_password + "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + list[i].user_type+ "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + list[i].user_realname + "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + list[i].user_address + "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + list[i].user_tel + "</td><td><span id='"+list[i].user_id+"' onclick='javascript:adminupda("+list[i].user_id+");'>删除</span></td></tr>";
		}
		$("#admin_div").html("<table><tr><th style='width:100px;height:20px;'>用户名</th><th style='width:200px;height:20px;'>密码</th><th style='width:200px;height:20px;'>类型</th><th style='width:125px;height:20px;'>真实姓名</th><th style='width:400px;height:20px;'>地址</th><th style='width:50px;height:20px;'>电话</th><th>删除</th></tr>"+str+"</table>");
		}
	}); 

});
$("#lis-li-5").click(function() {

	$(".xinxi_right_1").eq(4).show().siblings().hide();
});