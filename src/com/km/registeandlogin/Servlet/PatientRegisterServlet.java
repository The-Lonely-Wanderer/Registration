package com.km.registeandlogin.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.km.registeandlogin.server.RegisterServer;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/registerfrom")
public class PatientRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PatientRegisterServlet() {
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

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String repassword = request.getParameter("repassword");
		boolean flage;
		if (!"".equals(username) || !"".equals(password) || !"".equals(repassword)
				|| null != username || null != password || null != repassword) {
			if (password.equals(repassword)) {
				RegisterServer rServer = new RegisterServer();
				flage = rServer.registerserver(username,password);
				System.out.println(flage);
				if (flage) {
					request.setAttribute("message", "注册成功请登录...");
					request.getRequestDispatcher("Login.jsp").forward(request, response);
				} else {
					request.setAttribute("message", "注册异常，请重新注册...");
					request.getRequestDispatcher("register.jsp").forward(request, response);
				}

			} else {
				request.setAttribute("message", "两次密码不一致");
				request.getRequestDispatcher("register.jsp").forward(request, response);
			}
		}
	}
}
