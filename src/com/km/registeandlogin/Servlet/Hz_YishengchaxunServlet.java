package com.km.registeandlogin.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.km.pojo.t_keshi;
import com.km.pojo.t_yisheng;
import com.km.registeandlogin.server.Hz_KeshiyuyueAjaxService;
import com.km.registeandlogin.server.Hz_YichengxhekanService;

/**
 * Servlet implementation class Hz_YishengchaxunServlet
 */
@WebServlet("/Hz_YishengchaxunServlet")
public class Hz_YishengchaxunServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hz_YishengchaxunServlet() {
        super();
        // TODO Auto-generated constructor stub
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
		
		String username = request.getParameter("id");
//		System.out.println(username.);
		int keshi_id=Integer.parseInt(username);
		System.out.println("医生查询"+keshi_id);


		
		t_keshi keshi = new t_keshi(keshi_id);
		Hz_YichengxhekanService look = new Hz_YichengxhekanService();
		List<t_yisheng> list = look.getlook(keshi);
		System.out.println("list"+list);
		JSONArray jsonArray = new JSONArray();
		// 将需要发送到页面的数据封装到 jsonObject 中
		for (int i = 0; i < list.size(); i++) {
			// 使用json返回所需要的参数
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("Kehsi_name", list.get(i).getYisheng_name());
			jsonObject.put("getYisheng_sex", list.get(i).getYisheng_sex());
			jsonObject.put("getYisheng_age", list.get(i).getYisheng_age());
			jsonObject.put("getYisheng_zhicheng", list.get(i).getYisheng_zhicheng());
			jsonArray.add(jsonObject);
		}
		PrintWriter out = response.getWriter();
		out.println(jsonArray.toJSONString());
		System.out.println("jsonArray" + jsonArray);
		out.close();

	}
		
	}

