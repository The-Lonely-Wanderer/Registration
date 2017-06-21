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
import com.km.registeandlogin.server.Hz_QuxiaoyuyueService;
import com.km.registeandlogin.server.Ys_XiugaiyuyueService;

/**
 * Servlet implementation class ys_XiugaiyuyueServlet
 * @ps: 修改预约
 */
@WebServlet("/xiugaiyuyueaction")
public class ys_XiugaiyuyueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ys_XiugaiyuyueServlet() {
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
		String beizhu = request.getParameter("beizhu");
		//预约id
		String yuyueid = request.getParameter("id");
		int yuyue_id=Integer.parseInt(yuyueid);
		System.out.println("预约id"+yuyue_id);
		
		// 医生id
//		HttpSession session = request.getSession();
//		t_yisheng use = (t_yisheng) session.getAttribute("t_yisheng");		
//		int yisheng_id = use.getYisheng_id();
	
		t_yuyue yuyue = new t_yuyue(yuyue_id,"",beizhu);
		Ys_XiugaiyuyueService qxyy = new Ys_XiugaiyuyueService();
		t_yuyue list = qxyy.getxiugai(yuyue);
		if(list==null){
			
		}
////		System.out.println("集合"+list);
//		JSONArray jsonArray = new JSONArray();
//		// 将需要发送到页面的数据封装到 jsonObject 中
//		for (int i = 0; i < list.size(); i++) {
//			// 使用json返回所需要的参数
//			JSONObject jsonObject = new JSONObject();
//			jsonObject.put("Yuyue_id", list.get(i).getYuyue_id());
//			jsonObject.put("Yisheng_name", list.get(i).getYisheng_name());
//			jsonObject.put("Yuyue_shijian", list.get(i).getYuyue_shijian());
//			jsonObject.put("Yuyue_beizhu", list.get(i).getYuyue_beizhu());
//			jsonArray.add(jsonObject);
//		}
//
//		// 将 jsonObject 封装进 jsonArray中
//		PrintWriter out = response.getWriter();
//		out.println(jsonArray.toJSONString());
////		System.out.println("取消预约"+jsonArray);
//		out.close();
	}

	}


