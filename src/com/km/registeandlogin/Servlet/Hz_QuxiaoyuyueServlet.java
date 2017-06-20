package com.km.registeandlogin.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		t_yuyue yuyue = new t_yuyue(yuyue_id);
		Hz_QuxiaoyuyueService qxyy = new Hz_QuxiaoyuyueService();
		boolean qx = qxyy.quxiao(yuyue);
		String message;
		if (qx) {
			message = "预约成功！";
		} else {
			message = "预约失败！";
		}
	}

}
