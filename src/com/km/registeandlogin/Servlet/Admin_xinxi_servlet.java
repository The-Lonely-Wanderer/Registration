package com.km.registeandlogin.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.km.pojo.t_admin;
import com.km.registeandlogin.server.Admin_chaxun;
import com.km.registeandlogin.vo.User;

/**
 * Servlet implementation class Admin_xinxi_servlet
 */
@WebServlet("/Admin_xinxi_servlet")
public class Admin_xinxi_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Admin_xinxi_servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		t_admin t_admin = new t_admin(username, password);
		t_admin t_admin1 = new t_admin();
		Admin_chaxun admin_chaxun = new Admin_chaxun();	
		t_admin1  = admin_chaxun.getAdmin(t_admin);
		request.setAttribute("adminusername", t_admin1.getUserName());
		request.setAttribute("adminpassword", t_admin1.getUserPassword());
		request.getRequestDispatcher("admin.jsp").forward(request, response);
	}

}
