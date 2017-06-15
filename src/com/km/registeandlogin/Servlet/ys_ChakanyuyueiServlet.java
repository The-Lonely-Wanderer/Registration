package com.km.registeandlogin.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.km.pojo.t_user;
import com.km.pojo.t_yuyue;
import com.km.registeandlogin.server.ys_AllService;

/**
 * Servlet implementation class ys_ChakanyuyueServlet
 * 
 * @ps 查看预约；
 */
@WebServlet("/chakanaction")
public class ys_ChakanyuyueiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ys_ChakanyuyueiServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ys_AllService service = new ys_AllService();
		List<t_yuyue> list = service.getAll();

		request.setAttribute("list", list);
		request.getRequestDispatcher("ys_index.jsp").forward(request, response);

	}

}
