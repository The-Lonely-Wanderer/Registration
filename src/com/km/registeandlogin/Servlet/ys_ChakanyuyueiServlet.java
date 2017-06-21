package com.km.registeandlogin.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.km.pojo.t_user;
import com.km.pojo.t_yisheng;
import com.km.pojo.t_yuyue;
import com.km.registeandlogin.server.ys_AllService;

/**
 * Servlet implementation class ys_ChakanyuyueServlet
 * 
 * @ps 查看预约；
 */
@WebServlet("/chakanaction")
public class ys_ChakanyuyueiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ys_ChakanyuyueiServlet() {
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
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");

		HttpSession session = request.getSession();
		// 医生id
		t_yisheng use = (t_yisheng) session.getAttribute("t_yisheng");
		int yuyue_yishengid = use.getYisheng_id();

		t_yuyue yuyue = new t_yuyue(yuyue_yishengid, "");
		ys_AllService service = new ys_AllService();
		List<t_yuyue> list = service.getAll(yuyue);
		JSONArray jsonArray = new JSONArray();
		// 将需要发送到页面的数据封装到 jsonObject 中
		for (int i = 0; i < list.size(); i++) {
			// 使用json返回所需要的参数
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("Yuyue_id", list.get(i).getYuyue_id());
			jsonObject.put("Huanzhe_name", list.get(i).getHuanzhe_name());
			jsonObject.put("Yuyue_shijian", list.get(i).getYuyue_shijian());
			jsonObject.put("Yuyue_beizhu", list.get(i).getYuyue_beizhu());
			jsonArray.add(jsonObject);
		}

		// 将 jsonObject 封装进 jsonArray中

		PrintWriter out = response.getWriter();
		out.println(jsonArray.toJSONString());
		// System.out.println(jsonArray);
		// HttpSession session = request.getSession();
		// session.setAttribute("list", list);
		out.close();

	}

}
