package com.km.registeandlogin.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.km.pojo.t_user;
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
		
		String username = request.getParameter("id");
		int yisheng_id=Integer.parseInt(username);
		String user_huanzhe = request.getParameter("user_huanzhe");
		String beizhu = request.getParameter("beizhu");
		Hz_KeshiyishengyuyueService ams = new Hz_KeshiyishengyuyueService();
		
//		List<t_user> list = ams.getall();
//		request.setAttribute("list", list);
		request.getRequestDispatcher("chaxun.jsp").forward(request, response);
	}

}
