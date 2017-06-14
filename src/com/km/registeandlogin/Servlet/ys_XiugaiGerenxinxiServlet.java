package com.km.registeandlogin.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.km.pojo.t_yisheng;




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

		String yisheng_id = request.getParameter("yisheng_id");
		int yisheng = Integer.parseInt(yisheng_id);
		String yisheng_name = request.getParameter("yisheng_name");

		String yisheng_sex = request.getParameter("yisheng_sex");
		String yisheng_age = request.getParameter("yisheng_age");
		String yisheng_zhicheng = request.getParameter("yisheng_zhicheng");
		String keshi_id = request.getParameter("keshi_id");
		int keshi = Integer.parseInt(keshi_id);
		ys_XiugaiGerenxinxiServlet xg = new ys_XiugaiGerenxinxiServlet();
		t_yisheng xgxi = new t_yisheng(yisheng, yisheng_name,  yisheng_sex,yisheng_age, yisheng_zhicheng, keshi);
		t_yisheng setAll = xg.getXiugai(xgxi);
		if (setAll == null) {
			request.setAttribute("message", "修改成功");
			request.getRequestDispatcher("gerenxinxi.jsp").forward(request, response);
		} else {
			request.setAttribute("message", "修改失败");
			request.getRequestDispatcher("gerenxinxi.jsp").forward(request, response);

		}

	}

	private t_yisheng getXiugai(t_yisheng xgxi) {
		// TODO Auto-generated method stub
		return null;
	}

}
