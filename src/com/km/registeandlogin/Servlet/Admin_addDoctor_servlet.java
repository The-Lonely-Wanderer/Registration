package com.km.registeandlogin.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.km.pojo.t_yisheng;
import com.km.registeandlogin.server.Admin_adddoctor_server;

/**
 * Servlet implementation class Admin_addDoctor_servlet
 */
@WebServlet("/Admin_addDoctor_servlet")
public class Admin_addDoctor_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Admin_addDoctor_servlet() {
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
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String doctorusername = request.getParameter("doctorusername").trim();
		String doctorpassword = request.getParameter("doctorpassword").trim();
		String doctorsex = request.getParameter("doctorsex").trim();
		String doctorage = request.getParameter("doctorage").trim();
		String doctorzhicheng = request.getParameter("doctorzhicheng").trim();
		int doctorkeshiid = Integer.parseInt(request.getParameter("doctorkeshiid").trim());
		List<t_yisheng> yishenglist=new ArrayList<t_yisheng>();
		t_yisheng t_yisheng = new t_yisheng(doctorusername,doctorpassword,doctorsex,doctorage,doctorzhicheng,
				doctorkeshiid);
		Admin_adddoctor_server adddoctor_server = new Admin_adddoctor_server();
		yishenglist = adddoctor_server.adddoctor(t_yisheng);
		JSONObject jsonObject=new JSONObject();
		JSONArray jsonArray=new JSONArray();
		jsonObject.put("yishenglist",yishenglist);
		jsonArray.add(jsonObject);
		PrintWriter out=response.getWriter();
		out.println(jsonArray.toJSONString());
		out.close();
	}

}
