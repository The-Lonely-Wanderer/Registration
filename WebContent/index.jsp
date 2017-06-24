<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/Registration/css/top.css">
<link rel="stylesheet" type="text/css" href="/Registration/css/index.css">
<script type="text/javascript" src="/Registration/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/Registration/js/top.js"></script>

</head>
<body>

	<div id="top">
		<div id="menu">

			<div id="menu_li">
				<svg xmlns="http://www.w3.org/2000/svg"
					xmlns:xlink="http://www.w3.org/1999/xlink" t="1498015967100"
					class="icon" style="float:left;" viewBox="0 0 1024 1024"
					version="1.1" p-id="1048" width="50" height="50"> <defs>
				<style type="text/css" />

				</defs> <path
					d="M924.711 762.128c1.092-3.265 1.71-6.763 1.71-10.405v-382.149c0-18.121-14.69-32.801-32.81-32.801h-182.603v406.756c0 6.532-1.178 12.777-3.26 18.597h-21.422c1.092-3.265 1.71-6.763 1.71-10.405v-524.851c0-18.115-14.694-32.801-32.81-32.801h-286.477c-18.119 0-32.8 14.685-32.8 32.801v524.851c0 3.642 0.618 7.139 1.709 10.405h-21.412c-2.083-5.822-3.261-12.066-3.261-18.597v-406.756h-178.228c-18.115 0-32.801 14.681-32.801 32.801v382.149c0 3.642 0.618 7.139 1.701 10.405h-56.383v67.802h929.439v-67.802h-52.006zM200.358 628.161h-47.018v-47.013h47.018v47.013zM200.358 545.615h-47.018v-47.018h47.018v47.018zM200.358 465.796h-47.018v-47.021h47.018v47.021zM273.626 628.161h-47.018v-47.013h47.018v47.013zM273.626 545.615h-47.018v-47.018h47.018v47.018zM273.626 465.796h-47.018v-47.021h47.018v47.021zM584.989 759.935h-138.050v-172.23h138.050v172.23zM511.994 440.085c-63.854 0-115.626-51.769-115.626-115.623 0-63.868 51.779-115.638 115.626-115.638 63.867 0 115.638 51.769 115.638 115.638 0 63.862-51.77 115.623-115.638 115.623v0 0zM810.511 628.161h-47.013v-47.013h47.013v47.013zM810.511 545.615h-47.013v-47.018h47.013v47.018zM810.511 465.796h-47.013v-47.021h47.013v47.021zM883.771 628.161h-47.013v-47.013h47.013v47.013zM883.771 545.615h-47.013v-47.018h47.013v47.018zM883.771 465.796h-47.013v-47.021h47.013v47.021zM540.69 295.764h44.289v57.396h-44.289v44.303h-57.396v-44.303h-44.284v-57.396h44.284v-44.289h57.396v44.289zM540.69 295.764z"
					fill="#18b03d" p-id="1049" /></svg>
				<ul>
					<a href="index.jsp"><li>主页</li></a>
					<a href="GerenxinxiServlet?flage=${flage}"><li>挂号服务</li></a>
					<a href="index.jsp"><li>预约管理</li></a>
					<a href="index.jsp"><li>医院简介</li></a>
				</ul>
				<div id="mene_li_right">
					<ul>
						<c:choose>
							<c:when test="${username != null}">
								<c:if test="${flage eq 1 }">
									<a href="/Registration/ys_index.jsp"><li>${username}
								</c:if>
								<c:if test="${flage eq 2 }">
									<a href="/Registration/admin.jsp"><li>${username}
								</c:if>
								<c:if test="${flage eq 3 }">
									<a href="/Registration/hz_index.jsp"><li>${username}
								</c:if>
							</c:when>
							<c:otherwise>
								<a href="/Registration/Login.jsp"><li>登录
							</c:otherwise>
						</c:choose>
						</li>
						</a>
						<a href="/Registration/register.jsp"><li>注册</li></a>
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
		<p class="banner_p">医生简介</p>
		<div id="doctor_jianjie">
		
		
		</div>
		<div id="xinxi"></div>
		<p id="new_gonggao">最新公告--></p>
			<div id="gonggao">
			<c:forEach items="${sessionScope.gonggao_list}" var="gonggao">
				<p class="newsp">
					<span class="gonggaosp" style="color: black;">&nbsp;&nbsp;&nbsp;<b>${gonggao.gonggao_title}</b>
						<span>-->${gonggao.gonggao_data}</span ></span> <span class="gonggao_con">${gonggao.gonggao_content}&nbsp;&nbsp;&nbsp;<span
						class="close">关闭</span></span>
				</p>
			</c:forEach>
		</div>
			
		</div>
	</div>
	<div id="sbottom">
		医院挂号系统-2017-6-19<br /> <br />项目成员:柯蒙蒙，孟恒，杨圣林
	</div>
	<script type="text/javascript" src="/Registration/js/index.js"></script>
</body>
</html>