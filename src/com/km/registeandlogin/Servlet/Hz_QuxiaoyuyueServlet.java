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
import com.km.pojo.t_yuyue;
import com.km.registeandlogin.server.Hz_QuxiaoyuyueService;

/**
 * Servlet implementation class Hz_QuxiaoyuyueServlet
 */
@WebServlet("/Hz_QuxiaoyuyueServlet")
public class Hz_QuxiaoyuyueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hz_QuxiaoyuyueServlet() {
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String yuyueid = request.getParameter("id");
		int yuyue_id=Integer.parseInt(yuyueid);
		
		HttpSession session = request.getSession();
		// 患者id
		t_user use = (t_user) session.getAttribute("t_user2");
		int yuyue_userId = use.getUser_id();
		
		t_yuyue yuyue = new t_yuyue(yuyue_id,yuyue_userId);
		Hz_QuxiaoyuyueService qxyy = new Hz_QuxiaoyuyueService();
		List<t_yuyue> list = qxyy.quxiao(yuyue);
//		System.out.println("集合"+list);
		JSONArray jsonArray = new JSONArray();
		// 将需要发送到页面的数据封装到 jsonObject 中
		for (int i = 0; i < list.size(); i++) {
			// 使用json返回所需要的参数
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("Yuyue_id", list.get(i).getYuyue_id());
			jsonObject.put("Yisheng_name", list.get(i).getYisheng_name());
			jsonObject.put("Yuyue_shijian", list.get(i).getYuyue_shijian());
			jsonObject.put("Yuyue_beizhu", list.get(i).getYuyue_beizhu());
			jsonArray.add(jsonObject);
		}

		// 将 jsonObject 封装进 jsonArray中
		PrintWriter out = response.getWriter();
		out.println(jsonArray.toJSONString());
//		System.out.println("取消预约"+jsonArray);
		out.close();
	}

}
