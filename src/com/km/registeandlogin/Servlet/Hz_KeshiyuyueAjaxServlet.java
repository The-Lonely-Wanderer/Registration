package com.km.registeandlogin.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.km.pojo.t_keshi;
import com.km.registeandlogin.server.Hz_KeshiyuyueAjaxService;

/**
 * Servlet implementation class Hz_KeshiyuyueAjaxServlet
 */

@WebServlet("/Hz_KeshiyuyueAjaxServlet")
public class Hz_KeshiyuyueAjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Hz_KeshiyuyueAjaxServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response) 科室预约Ajax
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 接收页面传来的参数
		// String username = request.getParameter("username");
		// System.out.println(username);
		System.out.println("进入Ajax");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		Hz_KeshiyuyueAjaxService ajax = new Hz_KeshiyuyueAjaxService();
		List<t_keshi> list = ajax.selectUsername();

		// //获取一个上下文对象
		// ServletContext application = getServletContext();
		// application.setAttribute("count", count);

		// HttpSession session = request.getSession();
		// session.setAttribute("list", list);

		JSONArray jsonArray = new JSONArray();
		// 将需要发送到页面的数据封装到 jsonObject 中
		for (int i = 0; i < list.size(); i++) {
			// 使用json返回所需要的参数
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("Kehsi_name", list.get(i).getKehsi_name());
			jsonObject.put("Keshi_jianjie", list.get(i).getKeshi_jianjie());
			jsonObject.put("Keshi_id", list.get(i).getKeshi_id());
			jsonArray.add(jsonObject);
		}

		// 将 jsonObject 封装进 jsonArray中

		PrintWriter out = response.getWriter();
		out.println(jsonArray.toJSONString());
		System.out.println("jsonArray" + jsonArray);

//		HttpSession session = request.getSession();
//		session.setAttribute("list", list);
		out.close();

	}
}
