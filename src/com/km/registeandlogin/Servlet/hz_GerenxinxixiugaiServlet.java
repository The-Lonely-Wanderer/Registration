package com.km.registeandlogin.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.km.pojo.t_user;
import com.km.registeandlogin.server.hz_GerenxinxiService;

/**
 * Servlet implementation class gerenxinxixiugai
 * 个人信息修改
 */
@WebServlet("/gerenxinxixiugai")
public class hz_GerenxinxixiugaiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public hz_GerenxinxixiugaiServlet() {
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
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String user_password = request.getParameter("user_password");
		String user_type = request.getParameter("user_type");
		String user_realname = request.getParameter("user_realname");
		String user_address = request.getParameter("user_address");
		String user_te = request.getParameter("user_tel");
		long user_tel = Long.parseLong(user_te);
//		int user_tel=Integer.parseInt(user_te);
		
		HttpSession session=request.getSession();	
		String usersession = (String) session.getAttribute("username");
		
		t_user user = new t_user(usersession ,user_password, user_type, user_realname, user_address,user_tel);
		hz_GerenxinxiService gs = new hz_GerenxinxiService();
		t_user userall = gs.getxiugai(user);
		if(userall==null){
			request.setAttribute("massage", "修改成功！");
			request.getRequestDispatcher("hz_index.jsp").forward(request, response);
		}
		
	}

}
