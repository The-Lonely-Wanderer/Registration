package com.km.registeandlogin.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.km.pojo.t_yisheng;
import com.km.registeandlogin.server.ys_GerenxinxiService;

/**
 * Servlet implementation class ys_GerenxinxiServlet
 * 
 * @ps 医生的个人信息；
 */
@WebServlet("/gerenxinxiaction")
public class ys_GerenxinxiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ys_GerenxinxiServlet() {
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

		ys_GerenxinxiService gs = new ys_GerenxinxiService();

		HttpSession session = request.getSession();

		t_yisheng ys = (t_yisheng) session.getAttribute("yisheng_name");

		t_yisheng yisheng = gs.getYishengxinxi(ys);

		request.setAttribute("yisheng_name", yisheng);

		request.getRequestDispatcher("gerenxinxi.jsp").forward(request, response);

	}

}
