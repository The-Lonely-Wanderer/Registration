package com.km.registeandlogin.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.km.pojo.t_gonggao;
import com.km.registeandlogin.server.Gonggao_server;

/**
 * Servlet implementation class Index_servlet
 */
@WebServlet("/Index_servlet")
public class Index_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Index_servlet() {
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
		
//		request.getAttribute("username");
		HttpSession session=request.getSession();
		List<t_gonggao> gonggao_list;
		Gonggao_server gonggao_server=new Gonggao_server();
		gonggao_list=gonggao_server.getgonggao();
		session.setAttribute("gonggao_list", gonggao_list);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
