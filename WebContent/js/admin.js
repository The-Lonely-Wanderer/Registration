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
		success:function(doctordelete){
		var json = jQuery.parseJSON(doctordelete);
		var doctorlist=json[0].doctordelete;
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
		success:function(adminslist){
		var json = jQuery.parseJSON(adminslist);
		var Adminlist=json[0].adminslist;
		var str="";
		//console.log(Adminlist);
		for ( var i in Adminlist) {
			str += "<tr><td id='admin_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + Adminlist[i].user_id + "</td><td id='admin_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + Adminlist[i].userName+ "</td><td id='admin_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + Adminlist[i].userPassword+ "</td>" +
					"<td><span id='"+Adminlist[i].user_id+"' onclick='javascript:adminupda("+Adminlist[i].user_id+");'>删除</span></td></tr>";
		}
		$("#admin_div").html("<table><tr><th style='width:100px;height:20px;'>管理员ID</th><th style='width:200px;height:20px;'>用户名</th><th style='width:50px;height:20px;'>密码</th><th>删除</th></tr>"+str+"</table>");
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
		//console.log(alList);
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
		success:function(adoctorlList){
		var json = jQuery.parseJSON(adoctorlList);
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
		success:function(adminlist){
		var json = jQuery.parseJSON(adminlist);
		var Adminlist=json[0].adminlist;
		var str="";
		//console.log(Adminlist);
		for ( var i in Adminlist) {
			str += "<tr><td id='admin_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + Adminlist[i].user_id + "</td><td id='admin_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + Adminlist[i].userName+ "</td><td id='admin_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + Adminlist[i].userPassword+ "</td>" +
					"<td><span id='"+Adminlist[i].user_id+"' onclick='javascript:adminupda("+Adminlist[i].user_id+");'>删除</span></td></tr>";
		}
		$("#admin_div").html("<table><tr><th style='width:100px;height:20px;'>管理员ID</th><th style='width:200px;height:20px;'>用户名</th><th style='width:50px;height:20px;'>密码</th><th>删除</th></tr>"+str+"</table>");
		}
	}); 

});
$("#lis-li-5").click(function() {//公告
	$(".xinxi_right_1").eq(4).show().siblings().hide();
	
	$.ajax({
		type:"get",
		url:"Admin_news_servle",
		async:true,
		success:function(Allnews){
			var json=jQuery.parseJSON(Allnews);
			var Allnew=json[0].Allnews;
			//console.log(Allnew);
			str="";
			for(var i in Allnew){
				str+="<p id='"+Allnew[i].gonggao_id+"' class='message'>"+Allnew[i].gonggao_title+"//"+Allnew[i].gonggao_data+"<span id='a'>查看/编辑</span><div id="+Allnew[i].gonggao_id+">"+Allnew[i].gonggao_content+"<span >关闭</span></div></p>";
			}
			$("#message_div").html(str);
		}
	
	});
});
$("#changebut").click(function(){
	$("#changeform").show();
});

$("#no").click(function(){
	$("#changeform").hide();
});


$(".newsp").click(function(){
	var _index=$(this).index();
//	alert(_index);
	$(".newsp .gonggao_con").eq(_index).slideDown(300);
});

$(".newsp .gonggao_con .close").click(function(event){
//	var _index=$(this).index();
	$(this).parent(".gonggao_con").slideUp(300);
	  event.stopPropagation();
});

$("#ok").click(function(){
	$("#changeform").submit();
});














