package com.km.registeandlogin.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.km.pojo.t_user;
import com.km.pojo.t_yuyue;
import com.km.registeandlogin.server.Hz_KeshiyishengyuyueService;


/**
 * Servlet implementation class Hz_KeshiyuyueServlet
 */
@WebServlet("/Hz_KeshiyishengyuyueServlet")
public class Hz_KeshiyishengyuyueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hz_KeshiyishengyuyueServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * 科室下的医生预约
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		HttpSession session = request.getSession();
		
		//医生id
		String id = request.getParameter("id");
		int yuyue_yishengId=Integer.parseInt(id);
		
		//患者id
		t_user use = (t_user) session.getAttribute("t_user2");
		int yuyue_userId = use.getUser_id();
		
		//患者备注给医生看的
		String beizhu = request.getParameter("beizhu");
		t_yuyue yuyue = new t_yuyue(yuyue_userId, yuyue_yishengId, beizhu);
		Hz_KeshiyishengyuyueService ams = new Hz_KeshiyishengyuyueService();
		boolean yuyueyisheng = ams.getyuyueyisheng(yuyue);
		String message;
		if (yuyueyisheng) {
			message = "预约成功！";
		} else {
			message = "预约失败！";
		}
		
		
		
//		List<t_user> list = ams.getall();
//		request.setAttribute("list", list);
//		request.getRequestDispatcher("chaxun.jsp").forward(request, response);
	}

}
