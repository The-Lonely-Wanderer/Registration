<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.km.pojo.t_keshi"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>患者主页面</title>

<link rel="stylesheet" type="text/css" href="/Registration/css/top.css">
<link rel="stylesheet" type="text/css" href="css/hz_index.css">
<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/Registration/js/top.js"></script>
</head>
<body>
	<div id="top">
		<div id="menu">

			<div id="menu_li">
				<svg xmlns="http://www.w3.org/2000/svg"
					xmlns:xlink="http://www.w3.org/1999/xlink" t="1498015967100"
					class="icon" style="float:left;" viewBox="0 0 1024 1024" version="1.1"
					p-id="1048" width="50" height="50">
				<defs>
				<style type="text/css" />
				</defs>
				<path
					d="M924.711 762.128c1.092-3.265 1.71-6.763 1.71-10.405v-382.149c0-18.121-14.69-32.801-32.81-32.801h-182.603v406.756c0 6.532-1.178 12.777-3.26 18.597h-21.422c1.092-3.265 1.71-6.763 1.71-10.405v-524.851c0-18.115-14.694-32.801-32.81-32.801h-286.477c-18.119 0-32.8 14.685-32.8 32.801v524.851c0 3.642 0.618 7.139 1.709 10.405h-21.412c-2.083-5.822-3.261-12.066-3.261-18.597v-406.756h-178.228c-18.115 0-32.801 14.681-32.801 32.801v382.149c0 3.642 0.618 7.139 1.701 10.405h-56.383v67.802h929.439v-67.802h-52.006zM200.358 628.161h-47.018v-47.013h47.018v47.013zM200.358 545.615h-47.018v-47.018h47.018v47.018zM200.358 465.796h-47.018v-47.021h47.018v47.021zM273.626 628.161h-47.018v-47.013h47.018v47.013zM273.626 545.615h-47.018v-47.018h47.018v47.018zM273.626 465.796h-47.018v-47.021h47.018v47.021zM584.989 759.935h-138.050v-172.23h138.050v172.23zM511.994 440.085c-63.854 0-115.626-51.769-115.626-115.623 0-63.868 51.779-115.638 115.626-115.638 63.867 0 115.638 51.769 115.638 115.638 0 63.862-51.77 115.623-115.638 115.623v0 0zM810.511 628.161h-47.013v-47.013h47.013v47.013zM810.511 545.615h-47.013v-47.018h47.013v47.018zM810.511 465.796h-47.013v-47.021h47.013v47.021zM883.771 628.161h-47.013v-47.013h47.013v47.013zM883.771 545.615h-47.013v-47.018h47.013v47.018zM883.771 465.796h-47.013v-47.021h47.013v47.021zM540.69 295.764h44.289v57.396h-44.289v44.303h-57.396v-44.303h-44.284v-57.396h44.284v-44.289h57.396v44.289zM540.69 295.764z"
					fill="#18b03d" p-id="1049" /></svg>
				<ul>
					<a href="Index_servlet?username=${sessionScope.t_user2.user_name}&flage=${sessionScope.flage}"><li>首页</li></a>
					<a href="index.jsp"><li>挂号服务</li></a>
					<a href="index.jsp"><li>预约管理</li></a>
					<a href="index.jsp"><li>医院简介</li></a>
				</ul>
				<div id="mene_li_right">
					<ul>
						<a ><li>${sessionScope.t_user2.user_name}</li></a>
						<a href="/Registration/register.jsp"><li>注册</li></a>
						<a href="/Registration/LoginOutServlet"><li>注销</li></a>
					</ul>
				</div>
			</div>
		</div>
		<div>
			<img class="top_s" src="img/6.jpg" width="100%" height="500px" /> <img
				class="top_s" src="img/2.jpg" width="100%" height="500px" /> <img
				class="top_s" src="img/4.jpg" width="100%" height="500px" /> <img
				class="top_s" src="img/1.jpg" width="100%" height="500px" />
		</div>
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
					<li class="lis">预约挂号
						<div class="xinxi_div">
							<ul>
								<li id="lis-li-3" class="lis-li">科室预约</li>
								<li id="lis-li-4" class="lis-li">医生预约</li>
							</ul>
						</div>
					</li>
					<li class="lis">预约查询
						<div class="xinxi_div">
							<ul>
								<li id="lis-li-5" class="lis-li">已经预约</li>
							</ul>
						</div>
					</li>
				</ul>
			</div>
			<div id="xinxi_right" align="center">

				<%--个人信息查询 --%>
				<div class="xinxi_right_1">
					<p>
						<b>查看个人基本信息 </b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
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
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 欢迎：<b>【${sessionScope.t_user2.user_name}】</b>
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
								<td bgcolor="#9CCFFF" height="35px">
									<div align="center">
										<font size="2">患者账户：<input type="text"
											disabled="disabled" value="${sessionScope.t_user2.user_name}" /></font>
									</div>
								</td>
							</tr>
							<tr>
								<td bgcolor="#9CCFFF" height="35px">
									<div align="center">
										<font size="2">患者密码：<input type="text"
											disabled="disabled"
											value="${sessionScope.t_user2.user_password}" /></font>
									</div>
								</td>
							</tr>
							<tr>
								<td bgcolor="#9CCFFF" height="35px">
									<div align="center">
										<font size="2">患者类型：<input type="text"
											disabled="disabled" value="${sessionScope.t_user2.user_type}" /></font>
									</div>
								</td>
							</tr>
							<tr>
								<td bgcolor="#9CCFFF" height="35px">
									<div align="center">
										<font size="2">患者姓名：<input type="text"
											disabled="disabled"
											value="${sessionScope.t_user2.user_realname}" /></font>
									</div>
								</td>
							</tr>
							<tr>
								<td bgcolor="#9CCFFF" height="35px">
									<div align="center">
										<font size="2">收货地址：<input type="text"
											disabled="disabled"
											value="${sessionScope.t_user2.user_address}" /></font>
									</div>
								</td>
							</tr>
							<tr>
								<td bgcolor="#9CCFFF" height="35px">
									<div align="center">
										<font size="2">手机号码：<input type="text"
											disabled="disabled" value="${sessionScope.t_user2.user_tel}" /></font>
									</div>
								</td>
							</tr>
						</table>
						<p align="center">
							<b><font size="4">点击<a href="#">这里</a>返回主页
							</font></b>
						</p>
				</div>

				<%--个人信息修改 --%>
				<div class="xinxi_right_1">
					<p>
						<b>修改个人基本信息</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 欢迎：【<b>${param.username}】</b>
					</p>
					<form action="gerenxinxixiugai" method="post">
						<table width="75%" border="0" align="center">
							<tr>
								<td bgcolor="#9CCFFF">
									<div align="center">
										<font size="4"><b>修改</b></font>
									</div>
								</td>
							</tr>
							<tr>
								<td bgcolor="#9CCFFF" height="35px">
									<div align="center">
										<font size="2">患者密码：<input type="text"
											value="${sessionScope.t_user2.user_password}"
											name="user_password" /></font>
									</div>
								</td>
							</tr>
							<tr>
								<td bgcolor="#9CCFFF" height="35px">
									<div align="center">
										<font size="2">患者类型：<input type="text"
											value="${sessionScope.t_user2.user_type}" name="user_type" /></font>
									</div>
								</td>
							</tr>
							<tr>
								<td bgcolor="#9CCFFF" height="35px">
									<div align="center">
										<font size="2">患者姓名：<input type="text"
											value="${sessionScope.t_user2.user_realname}"
											name="user_realname" /></font>
									</div>
								</td>
							</tr>
							<tr>
								<td bgcolor="#9CCFFF" height="35px">
									<div align="center">
										<font size="2">收货地址：<input type="text"
											value="${sessionScope.t_user2.user_address}"
											name="user_address" /></font>
									</div>
								</td>
							</tr>
							<tr>
								<td bgcolor="#9CCFFF" height="35px">
									<div align="center">
										<font size="2">手机号码：<input type="text"
											value="${sessionScope.t_user2.user_tel}" name="user_tel" /></font>
									</div>
								</td>
							</tr>
						</table>
						<p align="center">
							<input type="submit" value="修改">
						</p>
						<img alt="" src="" height="250px">
						<p align="center">
							<b><font size="4">点击<a href="#">这里</a>返回主页
							</font></b>
						</p>
						<span>${massage}</span>
					</form>
				</div>

				<%--科室查看 --%>
				<div class="xinxi_right_1">
					<p>
						<b>科室预约</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
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
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 欢迎：【<b>${param.username}】</b>
					</p>
					<table width="75%" border="0" align="center">
						<tr>
							<td bgcolor="#9CCFFF" height="35px" colspan="4">
								<div align="center">
									<font size="4"><b>科室</b></font>
								</div>
							</td>
						</tr>
						<tr>
							<th bgcolor="#9CCFFF" height="35px" colspan="2">
								<div align="center">
									<font size="4"><b>科室名称</b></font>
								</div>
							</th>
							<th bgcolor="#9CCFFF" height="35px">
								<div align="center">
									<font size="4"><b>科室简介</b></font>
								</div>
							</th>
							<th bgcolor="#9CCFFF" height="35px">
								<div align="center">
									<font size="4"><b>操作</b></font>
								</div>
							</th>
						</tr>
						<%--拿的科室的值 --%>
						<tr>
							<td bgcolor="#9CCFFF" height="35px" colspan="4">
								<div align="center" class="zhi1"></div>
							</td>
						</tr>
						<tr>
							<td bgcolor="#9CCFFF" height="35px" colspan="4">
								<div align="center">
									<table width="100%" border="0" align="center">
										<tr>
											<td bgcolor="#9CCFFF" height="35px" colspan="5">
												<div align="center">
													<font size="4"><b>该科室医生</b></font>
												</div>
											</td>
										</tr>
										<tr>
											<th bgcolor="#9CCFFF" height="35px">
												<div align="center">
													<font size="4"><b>医生姓名</b></font>
												</div>
											</th>
											<th bgcolor="#9CCFFF" height="35px">
												<div align="center">
													<font size="4"><b>性别</b></font>
												</div>
											</th>
											<th bgcolor="#9CCFFF" height="35px">
												<div align="center">
													<font size="4"><b>年龄</b></font>
												</div>
											</th>
											<th bgcolor="#9CCFFF" height="35px">
												<div align="center">
													<font size="4"><b>医生简介</b></font>
												</div>
											</th>
											<th bgcolor="#9CCFFF" height="35px">
												<div align="center">
													<font size="4"><b>操作</b></font>
												</div>
											</th>
										</tr>
										<tr>
											<td bgcolor="#9CCFFF" height="35px" colspan="5">
												<div align="center">
													<font size="4" class="keshiyisheng"><b> </b> </font>
												</div>
											</td>
										</tr>
										<%--患者填写预约患者医生备注 --%>
										<tr>
											<td bgcolor="#9CCFFF" height="35px" colspan="5">
												<div align="center">
													<font size="4"><b> 患者名字</br> <input type="text"
															id="user_huanzhe" value="${param.username}"
															align="center"></br> 备注</br> <textarea name="MSG"
																id="beizhu" cols=40 rows=4>
													病因:
										</textarea> </br>

													</b> </font>

												</div>
												<div align="center">
													<font size="4" class="amigespan"><b> </b> </font>
												</div>
											</td>
										</tr>
									</table>
								</div>
							</td>
						</tr>


					</table>
					<p align="center">
						<b><font size="4">点击<a href="#">这里</a>返回主页
						</font></b>
					</p>
				</div>
				<%-- 医生预约--%>
				<div class="xinxi_right_1">
					<p>
						<b>医生预约</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
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
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 欢迎：【<b>${param.username}】</b>
					</p>
					<table width="75%" border="0" align="center">
						<tr>
							<td bgcolor="#9CCFFF" height="35px" colspan="5">
								<div align="center">
									<font size="4"><b>该科室医生</b></font>
								</div>
							</td>
						</tr>
						<tr>
							<th bgcolor="#9CCFFF" height="35px">
								<div align="center">
									<font size="4"><b>医生姓名</b></font>
								</div>
							</th>
							<th bgcolor="#9CCFFF" height="35px">
								<div align="center">
									<font size="4"><b>性别</b></font>
								</div>
							</th>
							<th bgcolor="#9CCFFF" height="35px">
								<div align="center">
									<font size="4"><b>年龄</b></font>
								</div>
							</th>
							<th bgcolor="#9CCFFF" height="35px">
								<div align="center">
									<font size="4"><b>医生简介</b></font>
								</div>
							</th>
							<th bgcolor="#9CCFFF" height="35px">
								<div align="center">
									<font size="4"><b>操作</b></font>
								</div>
							</th>
						</tr>
						<tr>
							<td bgcolor="#9CCFFF" height="35px" colspan="5">
								<div align="center">
									<font size="4" class="keshiyisheng"><b> </b> </font>
								</div>
							</td>
						</tr>
						<%--患者填写预约患者医生备注 --%>
						<tr>
							<td bgcolor="#9CCFFF" height="35px" colspan="5">
								<div align="center">
									<font size="4"><b> 患者名字</br> <input type="text"
											id="user_huanzhe" value="${param.username}" align="center"></br>
											备注</br> <textarea name="MSG" id="beizhu" cols=40 rows=4>
													病因:
										</textarea> </br>

									</b> </font>

								</div>
								<div align="center">
									<font size="4" class="amigespan"><b> </b> </font>
								</div>
							</td>
						</tr>
					</table>
				</div>


				<div class="xinxi_right_1">
					<p>
						<b>已经预约</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
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
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 欢迎：【<b>${param.username}】</b>
					</p>
					<table width="75%" border="0" align="center">
						<tr>
							<td bgcolor="#9CCFFF" height="35px" colspan="4">
								<div align="center">
									<font size="4"><b>已经预约</b></font>
								</div>
							</td>
						</tr>
						<tr>
							<th bgcolor="#9CCFFF" height="35px">
								<div align="center">
									<font size="4"><b>医生姓名</b></font>
								</div>
							</th>
							<th bgcolor="#9CCFFF" height="35px">
								<div align="center">
									<font size="4"><b>预约时间</b></font>
								</div>
							</th>
							<th bgcolor="#9CCFFF" height="35px">
								<div align="center">
									<font size="4"><b>备注</b></font>
								</div>
							</th>
							<th bgcolor="#9CCFFF" height="35px">
								<div align="center">
									<font size="4"><b>操作</b></font>
								</div>
							</th>
						</tr>
						<tr>
							<td bgcolor="#9CCFFF" height="35px" colspan="5">
								<div align="center">
									<font size="4" class="chaxunyuyue"><b> </b> </font>
								</div>
							</td>
							<div align="center">
								<font size="4" class="amigespan"><b> </b> </font>
							</div>
						</tr>
					</table>
				</div>

			</div>
		</div>
		<div id="gonggao" align="center">
			<p>
			<h1>
				<b><font color="red">最新公告</font></b>
			</h1>
			</p>
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
	<div id="sbottom">
		医院挂号系统-2017-6-19<br /> <br />项目成员:柯蒙蒙，孟恒，杨圣林
	</div>
	<script src="js/hz_index.js" type="text/javascript" type="stylesheet"></script>
	<script src="js/hz_Ajax.js" type="text/javascript" type="stylesheet"></script>
	<script src="js/Hz_Huanzheyuyuechaxun.js" type="text/javascript"
		type="stylesheet"></script>
</body>
</html>