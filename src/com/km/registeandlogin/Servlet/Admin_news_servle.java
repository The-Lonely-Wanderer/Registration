package com.km.registeandlogin.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.km.pojo.t_gonggao;
import com.km.registeandlogin.server.Admin_news_server;

/**
 * Servlet implementation class Admin_news_servle
 */
@WebServlet("/Admin_news_servle")
public class Admin_news_servle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admin_news_servle() {
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
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		List<t_gonggao> news=new ArrayList<t_gonggao>();
		
		Admin_news_server admin_news_server=new Admin_news_server();
		news=admin_news_server.getAllNews();
		JSONObject jsonObject=new JSONObject();
		JSONArray jsonArray=new JSONArray();
		jsonObject.put("Allnews", news);
		jsonArray.add(jsonObject);
		PrintWriter out=response.getWriter();
		out.println(jsonArray.toJSONString());
		out.close();	
	}

}
