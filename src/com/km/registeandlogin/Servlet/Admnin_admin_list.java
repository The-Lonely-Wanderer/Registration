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
import com.km.registeandlogin.server.Admin_admin_server;

/**
 * Servlet implementation class Admnin_admin_list
 */
@WebServlet("/Admnin_admin_list")
public class Admnin_admin_list extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admnin_admin_list() {
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
		t_admin t_admin;
		List<t_admin> adminlist;
		Admin_admin_server admin_admin_server=new Admin_admin_server();
		adminlist=admin_admin_server.getAllAdmin();
		
		JSONObject jsonObject=new JSONObject();
		JSONArray jsonArray=new JSONArray();
		jsonObject.put("adminlist",adminlist);
		jsonArray.add(jsonObject);
		PrintWriter out=response.getWriter();
		out.println(jsonArray);
		out.close();
	}

}
