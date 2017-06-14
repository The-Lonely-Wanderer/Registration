package com.km.registeandlogin.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.km.pojo.t_user;
import com.km.registeandlogin.server.hz_RegisterService;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/registerfrom")
public class hz_PatientRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public hz_PatientRegisterServlet() {
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String user_name = request.getParameter("username");
		String user_password = request.getParameter("password");
		String repassword = request.getParameter("repassword");
		String user_type = request.getParameter("user_type");
		String user_realname = request.getParameter("user_realname");
		String user_address = request.getParameter("user_address");
		String user_te = request.getParameter("user_tel");
		int user_tel=Integer.parseInt(user_te);
		if (!"".equals(user_name) || !"".equals(user_password) || !"".equals(repassword)
				|| null != user_name || null != user_password || null != repassword) {
			if (user_password.equals(repassword)) {
				hz_RegisterService rServer = new hz_RegisterService();
				t_user user = new t_user(user_name,user_password,user_type,user_realname,user_tel,user_address);
				user = rServer.RegisterServer(user);
				if (user==null) {
					request.setAttribute("message", "注册成功请登录...");
					request.getRequestDispatcher("Login.jsp").forward(request, response);
				} else {
					request.getRequestDispatcher("register.jsp").forward(request, response);
				}

			} else {
				request.setAttribute("message", "两次密码不一致");
				request.getRequestDispatcher("register.jsp").forward(request, response);
			}
		}
	}
}
