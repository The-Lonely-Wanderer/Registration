package com.km.registeandlogin.Servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.km.registeandlogin.server.LoginServer;

/**
 * Servlet implementation class DoctorLoginServlet
 */
@WebServlet("/DoctorLoginServlet")
public class DoctorLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoctorLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String rString = request.getParameter("nocheck"); // 设置请求属性S
		request.setAttribute("username", username);
		// 登录
		boolean login;
		LoginServer lServer = new LoginServer();
		login = lServer.Login(username, password);
		
		if (login == true) {
			// 创建cookie,设置属性
			if ("ok".equals(rString)) {
				Cookie cookieusername = new Cookie("username", username);
				Cookie cookiepassword = new Cookie("passsword", password);
				cookieusername.setMaxAge(60 * 60 * 24 * 7);
				cookiepassword.setMaxAge(60 * 60 * 24 * 7);
				response.addCookie(cookieusername);
				response.addCookie(cookiepassword);
			}
			// 创建会话，设置会话属性
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			session.setMaxInactiveInterval(60 * 60 * 1);
			// 创建上下文，设置上下文属性
			ServletContext application = getServletContext();
			int counta=(int)application.getAttribute("count");// 获取count
			counta++;
			application.setAttribute("count", counta);// 将新增的人数重新赋值给count
			request.getRequestDispatcher("loginsuccess.jsp").forward(request, response);
		} else {
			request.setAttribute("message", "账号或密码错误");
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}
		
		
		
		
		
	}

}
