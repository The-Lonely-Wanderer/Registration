package com.km.registeandlogin.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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

		String yisheng_name = request.getParameter("yisheng_name");
		String yisheng_sex = request.getParameter("yisheng_sex");
		String yisheng_age = request.getParameter("yisheng_age");
		String yisheng_zhicheng = request.getParameter("yisheng_zhicheng");
		String keshi_id = request.getParameter("keshi_id");
		if ("".equals(keshi_id)) {
			keshi_id = "11";
		}
		int keshi = Integer.parseInt(keshi_id);
		String yisheng_id = request.getParameter("yisheng_id");
		
		if ("".equals(yisheng_id)) {
			yisheng_id ="11";
		}
		int yisheng = Integer.parseInt(yisheng_id);
		ys_XiugaiGerenxinxiService xg = new ys_XiugaiGerenxinxiService();
		t_yisheng xgxi = new t_yisheng(yisheng, yisheng_name, yisheng_sex, yisheng_age, yisheng_zhicheng, keshi);
		boolean setAll = xg.getXiugai(xgxi);
		System.out.println("setall"+setAll);
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
