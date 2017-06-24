package com.km.registeandlogin.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.km.pojo.t_admin;
import com.km.registeandlogin.server.Admin_update_server;

/**
 * Servlet implementation class Admin_change_servlet
 */
@WebServlet("/Admin_change_servlet")
public class Admin_change_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admin_change_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String username=request.getParameter("newusername");
		String password=request.getParameter("newpassword");
		HttpSession session=request.getSession();
		session.getAttribute("");
		boolean flage;
		t_admin t_admin=new t_admin(username, password);
		
		Admin_update_server admin_update_server=new Admin_update_server();
		flage=admin_update_server.Admin_update(t_admin);
		if(flage!=true){
			request.setAttribute("message","修改异常");
		}else{
			request.setAttribute("message","修改成功，请重新登录");
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}
	}

}
