package com.km.registeandlogin.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.km.pojo.t_admin;
import com.km.pojo.t_yisheng;
import com.km.registeandlogin.server.Admin_addAdmin_server;
import com.km.registeandlogin.server.Admin_adddoctor_server;

/**
 * Servlet implementation class Admin_add_servlet
 */
@WebServlet("/Admin_add_servlet")
public class Admin_add_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admin_add_servlet() {
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
		String adminusername = request.getParameter("adminusername").trim();
		String adminpassword = request.getParameter("adminpassword").trim();
		List<t_admin> adminlist;
		t_admin t_admin=new t_admin(adminusername,adminpassword);
		Admin_addAdmin_server ad=new Admin_addAdmin_server();
		adminlist=ad.insertAdmin(t_admin);
		JSONObject jsonObject=new JSONObject();
		JSONArray jsonArray=new JSONArray();
		jsonObject.put("adminlist",adminlist);
		jsonArray.add(jsonObject);
		PrintWriter out=response.getWriter();
		out.println(jsonArray);
		out.close();
	
	}

}
