package com.km.registeandlogin.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.km.pojo.t_yisheng;
import com.km.registeandlogin.server.ys_XiugaiGerenxinxiService;

/**
 * Servlet implementation class ys_XiugaiGerenxinxiServlet @ps医生个人信息修改；
 */
@WebServlet("/xiugaiaction")
public class ys_XiugaiGerenxinxiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ys_XiugaiGerenxinxiServlet() {
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
		HttpSession session = request.getSession();
		t_yisheng ys = (t_yisheng) session.getAttribute("t_yisheng");

		String yisheng_name = ys.getYisheng_name();
		String yisheng_age = request.getParameter("yisheng_age");
		String yisheng_sex = request.getParameter("yisheng_sex");
		String yisheng_password = request.getParameter("yisheng_pw");

		t_yisheng xgxi = new t_yisheng(yisheng_name, yisheng_age, yisheng_sex, yisheng_password);

		ys_XiugaiGerenxinxiService xg = new ys_XiugaiGerenxinxiService();

		boolean setAll = xg.getXiugai(xgxi);
		if (setAll == true) {

			request.setAttribute("message", "修改成功");
			request.getRequestDispatcher("ys_index.jsp").forward(request, response);

			System.out.println("success");

		} else {
			request.setAttribute("message", "修改失败");
			request.getRequestDispatcher("ys_index.jsp").forward(request, response);
			System.out.println("false");
		}

	}

}
