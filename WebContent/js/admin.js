/**
 * 
 */
function upda(id){
	
	$(".xinxi_right_1").eq(1).show().siblings().hide();
	$.ajax({
		type:"get",
		url:"Admin_huanzhe_updata?id="+id+"",
		async:true,
		success:function(alist){
		var json = jQuery.parseJSON(alist);
		var list=json[0].alist;
		var str="";
		for ( var i in list) {
			str += "<tr><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + list[i].user_name + "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + list[i].user_password + "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + list[i].user_type+ "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + list[i].user_realname + "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + list[i].user_address + "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + list[i].user_tel + "</td><td><span id='"+list[i].user_id+"' onclick='"+upda(parseInt(list[i].user_id))+";return false;'>删除</span></td></tr>";
		}
		$("#huanzhe_div").html("<table><tr><th style='width:100px;height:20px;'>用户名</th><th style='width:200px;height:20px;'>密码</th><th style='width:200px;height:20px;'>类型</th><th style='width:125px;height:20px;'>真实姓名</th><th style='width:400px;height:20px;'>地址</th><th style='width:50px;height:20px;'>电话</th><th>删除</th></tr>"+str+"</table>");
		alert(parseInt(list[i].user_id));
		
		},
		error:function(){
			alert("滚");
		}
	});
}
$("#lis-li-1").click(function(){
	$(".xinxi_right_1").eq(0).show().siblings().hide();
});
$("#lis-li-2").click(function(){
	$(".xinxi_right_1").eq(1).show().siblings().hide();

	$.ajax({
		type:"get",
		url:"Admnin_patient_list",
		async:true,
		success:function(alList){
		var json = jQuery.parseJSON(alList);
		var list=json[0].alList;
		var str="";
		for ( var i in list) {
			str += "<tr><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + list[i].user_name + "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + list[i].user_password + "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + list[i].user_type+ "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + list[i].user_realname + "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + list[i].user_address + "</td><td id='huanzhe_td' style='border-bottom: 1px solid rgba(102, 102, 102, 0.5);text-align:center;'>" + list[i].user_tel + "</td><td><span id='"+list[i].user_id+"' onclick='"+upda(parseInt(list[i].user_id))+";return false;'>删除</span></td></tr>";
		}
		$("#huanzhe_div").html("<table><tr><th style='width:100px;height:20px;'>用户名</th><th style='width:200px;height:20px;'>密码</th><th style='width:200px;height:20px;'>类型</th><th style='width:125px;height:20px;'>真实姓名</th><th style='width:400px;height:20px;'>地址</th><th style='width:50px;height:20px;'>电话</th><th>删除</th></tr>"+str+"</table>");
		},
		error:function(){
			alert("gun");
		}
	});
});
$("#lis-li-3").click(function() {

	$(".xinxi_right_1").eq(2).show().siblings().hide();

});
$("#lis-li-4").click(function() {

	$(".xinxi_right_1").eq(3).show().siblings().hide();

});
$("#lis-li-5").click(function() {

	$(".xinxi_right_1").eq(4).show().siblings().hide();
});