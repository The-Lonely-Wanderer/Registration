package com.km.registeandlogin.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.km.pojo.t_user;
import com.km.registeandlogin.server.Hz_KeshiyuyueService;


/**
 * Servlet implementation class Hz_KeshiyuyueServlet
 */
@WebServlet("/Hz_KeshiyuyueServlet")
public class Hz_KeshiyuyueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hz_KeshiyuyueServlet() {
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
		Hz_KeshiyuyueService ams = new Hz_KeshiyuyueService();
		List<t_user> list = ams.getall();
		request.setAttribute("list", list);
		request.getRequestDispatcher("chaxun.jsp").forward(request, response);
	}

}
