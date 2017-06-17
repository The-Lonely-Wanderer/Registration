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

import com.km.pojo.t_admin;
import com.km.pojo.t_user;
import com.km.pojo.t_yisheng;
import com.km.registeandlogin.server.Admin_chaxun;
import com.km.registeandlogin.server.DoctorLoginServer;
import com.km.registeandlogin.server.PatientLoginServer;

/**
 * Servlet implementation class DoctorLoginServlet
 */
@WebServlet("/DoctorLoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
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
		String rString = request.getParameter("nocheck"); // 设置请求属性S
		String select1 = request.getParameter("select");
		ServletContext application = getServletContext();
		HttpSession session = request.getSession();
		request.setAttribute("username", username);

		// 登录
		
		if ("doctor".equals(select1)) {
			System.out.println("医生登录");
			t_yisheng t_yisheng;
			DoctorLoginServer doctorlServer = new DoctorLoginServer();
			t_yisheng = doctorlServer.getDoctor(username, password);
			System.out.println("yisheng"+t_yisheng);
			if (t_yisheng != null) {
				if ("ok".equals(rString)) {
					Cookie cookieusername = new Cookie("username", username);
					Cookie cookiepassword = new Cookie("passsword", password);
					cookieusername.setMaxAge(60 * 60 * 24 * 7);
					cookiepassword.setMaxAge(60 * 60 * 24 * 7);
					response.addCookie(cookieusername);
					response.addCookie(cookiepassword);
				}
				session.setAttribute("username", username);
				session.setMaxInactiveInterval(60 * 60 * 1);
				int counta = (int) application.getAttribute("count");// 获取count
				counta++;
				application.setAttribute("count", counta);// 将新增的人数重新赋值给count
				request.getRequestDispatcher("ys_index.jsp").forward(request, response);
			} else {
				request.setAttribute("message", "账号或密码错误");
				request.getRequestDispatcher("Login.jsp").forward(request, response);
			}
		}
		if ("admin".equals(select1)) {
			System.out.println("管理员登录");
			Admin_chaxun admin_chaxun = new Admin_chaxun();
			t_admin t_admin = new t_admin(username, password);
			t_admin t_admin2 = new t_admin();
			t_admin2 = admin_chaxun.getAdmin(t_admin);
			System.out.println("Admin"+t_admin2);
			if (t_admin2 != null) {
				if ("ok".equals(rString)) {
					Cookie cookieusername = new Cookie("username", username);
					Cookie cookiepassword = new Cookie("passsword", password);
					cookieusername.setMaxAge(60 * 60 * 24 * 7);
					cookiepassword.setMaxAge(60 * 60 * 24 * 7);
					response.addCookie(cookieusername);
					response.addCookie(cookiepassword);
				}
				session.setAttribute("username", username);
				session.setMaxInactiveInterval(60 * 60 * 1);
				int counta = (int) application.getAttribute("count");// 获取count
				counta++;
				application.setAttribute("count", counta);// 将新增的人数重新赋值给count
				
				
				request.getRequestDispatcher("admin.jsp").forward(request, response);
				
				
				
			} else {
				request.setAttribute("message", "账号或密码错误");
				request.getRequestDispatcher("Login.jsp").forward(request, response);
			}
		}
		if ("patient".equals(select1)) {
			System.out.println("患者登录");
			PatientLoginServer patientLoginServer = new PatientLoginServer();
			t_user t_user = new t_user(username, password);
			t_user t_user2 = new t_user();
			t_user2 = patientLoginServer.getpatient(t_user);
			System.out.println("t_user2"+t_user2);
			if (t_user2 != null) {
				if ("ok".equals(rString)) {
					Cookie cookieusername = new Cookie("username", username);
					Cookie cookiepassword = new Cookie("passsword", password);
					cookieusername.setMaxAge(60 * 60 * 24 * 7);
					cookiepassword.setMaxAge(60 * 60 * 24 * 7);
					response.addCookie(cookieusername);
					response.addCookie(cookiepassword);
				}
				session.setAttribute("username", username);
				session.setMaxInactiveInterval(60 * 60 * 1);
				int counta = (int) application.getAttribute("count");// 获取count
				counta++;
				application.setAttribute("count", counta);// 将新增的人数重新赋值给count
				request.getRequestDispatcher("hz_index.jsp").forward(request, response);
			} else {
				request.setAttribute("message", "账号或密码错误");
				request.getRequestDispatcher("Login.jsp").forward(request, response);
			}
		}

	}

}
