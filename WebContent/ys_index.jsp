<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@page import="com.km.pojo.t_yuyue"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>医生页面</title>
<link rel="stylesheet" type="text/css" href="css/yisheng.css">
<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
</head>
<body>
	<div id="top">
		<img src="img/1.jpg" width="100%" height="500px" /> <img
			src="img/2.jpg" width="100%" height="500px" /> <img src="img/5.jpg"
			width="100%" height="500px" /><img src="img/4.jpg" width="100%"
			height="500px" /> <img src="img/3.jpg" width="100%" height="500px" />
	</div>
	<div id="banner">
		<div id="xinxi">
			<div id="xinxi_left" style="background:#9CCFFF; color:#FFF">
				<ul>
					<li class="lis">个人信息
						<div class="xinxi_div">
							<ul>
								<li id="lis-li-1" class="lis-li">查看</li>

								<li id="lis-li-2" class="lis-li">修改</li>
							</ul>
						</div>
					</li>
					<li class="lis">预约查询
						<div class="xinxi_div">
							<ul>
								<li id="lis-li-3" class="lis-li">查看</li>

								<li id="lis-li-4" class="lis-li">修改</li>

							</ul>
						</div>
					</li>
					<li class="lis">医院动态
						<div class="xinxi_div">
							<ul>
								<li id="lis-li-5" class="lis-li">最新消息</li>
							</ul>
						</div>
					</li>
				</ul>
			</div>
			<div id="xinxi_right" align="center">
				<div class="xinxi_right_1">
				<p>
						<b>查看医生个人信息 </b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 欢迎：<b>【${sessionScope.t_yisheng.yisheng_name}】</b>
					</p>
					<table width="75%" border="0" align="center">
							<tr>
								<td bgcolor="#9CCFFF">
									<div align="center">
										<font size="4"><b>个人信息</b></font>
									</div>
								</td>
							</tr>
							<tr>
								<td bgcolor="#9CCFFF" height="45px">
									<div align="center">
										<font size="2">工&nbsp;&nbsp;&nbsp;号:<input type="text"
											disabled="disabled" value="${sessionScope.t_yisheng.yisheng_id}" /></font>
									</div>
								</td>
							</tr>
							<tr>
								<td bgcolor="#9CCFFF" height="45px">
									<div align="center">
										<font size="2">姓&nbsp;&nbsp;&nbsp;名:<input type="text"
											disabled="disabled" value="${sessionScope.t_yisheng.yisheng_name}" /></font>
									</div>
								</td>
							</tr>
							<tr>
								<td bgcolor="#9CCFFF" height="45px">
									<div align="center">
										<font size="2">年&nbsp;&nbsp;&nbsp;龄:<input type="text"
											disabled="disabled" value="${sessionScope.t_yisheng.yisheng_age}" /></font>
									</div>
								</td>
							</tr>
							<tr>
								<td bgcolor="#9CCFFF" height="45px">
									<div align="center">
										<font size="2">性&nbsp;&nbsp;&nbsp;别:<input type="text"
											disabled="disabled" value="${sessionScope.t_yisheng.yisheng_sex}" /></font>
									</div>
								</td>
							</tr>
							<tr>
								<td bgcolor="#9CCFFF" height="45px">
									<div align="center">
										<font size="2">职&nbsp;&nbsp;&nbsp;称:<input type="text"
											disabled="disabled" value="${sessionScope.t_yisheng.yisheng_zhicheng}" /></font>
									</div>
								</td>
							</tr>
							</table>
				</div>
				<div class="xinxi_right_1">
				<p>
						<b>修改医生个人信息</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 欢迎：<b>【${sessionScope.t_yisheng.yisheng_name}】</b>
					</p>
					<form action="xiugaiaction"  method="post">
					<table width="75%" border="0" align="center">
							<tr>
								<td bgcolor="#9CCFFF">
									<div align="center">
										<font size="4"><b>修改信息</b></font>
									</div>
								</td>
							</tr>
							<tr>
								<td bgcolor="#9CCFFF" height="45px">
									<div align="center">
										<font size="2">姓&nbsp;&nbsp;&nbsp;名:<input type="text" name="yisheng_name"></font>
									</div>
								</td>
							</tr>
							<tr>
								<td bgcolor="#9CCFFF" height="45px">
									<div align="center">
										<font size="2">年&nbsp;&nbsp;&nbsp;龄:<input type="text" name="yisheng_age"></font>
									</div>
								</td>
							</tr>
							<tr>
								<td bgcolor="#9CCFFF" height="45px">
									<div align="center">
										<font size="2">性&nbsp;&nbsp;&nbsp;别:<input type="text" name="yisheng_sex"></font>
									</div>
								</td>
							</tr>
							<tr>
								<td bgcolor="#9CCFFF" height="45px">
									<div align="center">
										<font size="2">职&nbsp;&nbsp;&nbsp;称:<input type="text" name="yisheng_zhicheng"></font>
									</div>
								</td>
							</tr>
							</table>
						<input type= "submit"  value ="修改" name ="xiugai">
					</form>
	<%--
			String message = (String) request.getAttribute("message");
			if (message != null && !"".equals(message)) {
				System.out.println("连接success");
		%>
		<span style="display: block;"><%=message%> </span>
		<%
			}
		--%>
				<span style="display: block;">${message } </span>
		
				</div>
				<div class="xinxi_right_1">
					<p>查看预约</p><br/><br/>				
							欢迎：${yisheng_name }  登录
					<form action="chakanyuyueaction">
						<table style="border: 1px solid ;">
							<tr>
							<th>患者名字丨</th>
							<th>患者症状丨</th>
							<th>预约医生丨</th>
							<th>预约时间丨</th>
						</tr>
						</table>				
						<input type="submit" value="修改信息"> <input type="submit" value="返回主页">
					</form>
				</div>
				<div class="xinxi_right_1">
					<p>修改预约时间</p><br />
					<form action="xiugaiyuyueaction">
						<table style="border: 1px solid ;">
							<tr>
							<th>患者名字丨</th>
							<th>患者症状丨</th>
							<th>预约医生丨</th>
							<th>预约时间丨</th>
							<th>排期时间丨</th>
							<th>专家建议丨</th>
							</tr>
						</table>
					</form>
					<div class="xinxi_right_1">
						<p>最新消息</p>
						<form action=""></form>
					</div>
				</div>
			</div>
		</div>
		<div id="gonggao" align="center">
			<h1>
				<b><font color="red">最新公告</font></b>
			</h1>
			<div id="gonggao">
				<c:forEach items="${sessionScope.gonggao_list}" var="gonggao">
					<table border="0px" width="45%" height="40px">
						<tr>
							<td width="50%" align="left" bgcolor="#9CCFFF"><span
								class="gonggaosp" style="color: black;">
									&nbsp;&nbsp;&nbsp;<b>${gonggao.gonggao_title}--></b> <span
									style="color: red;">${gonggao.gonggao_data}</span>
							</span></td>
							<td bgcolor="#9CCFFF"><span class="gonggao_con">${gonggao.gonggao_content}</span>
							</td>
						</tr>
					</table>
				</c:forEach>
			</div>
		</div>
	</div>
	<script src="js/doctor.js" type="text/javascript" type="stylesheet"></script>
</body>
</html>