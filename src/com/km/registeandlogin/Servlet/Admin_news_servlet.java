package com.km.registeandlogin.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.classfmt.NonNullDefaultAwareTypeAnnotationWalker;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.km.registeandlogin.server.Admin_news_delete;

/**
 * Servlet implementation class Admin_news_servlet
 */
@WebServlet("/Admin_news_servlet")
public class Admin_news_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admin_news_servlet() {
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
		
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		String ids=request.getParameter("id");
		int id=Integer.parseInt(ids);
		boolean flage;
		Admin_news_delete admin_news_detele =new Admin_news_delete();
		flage=admin_news_detele.Admin_deletenews(id);
		JSONObject jsonObject=new JSONObject();
		JSONArray jsonArray=new JSONArray();
		jsonObject.put("flage", flage);
		jsonArray.add(jsonObject);
		PrintWriter out=response.getWriter();
		out.println(jsonArray.add(jsonObject));
		out.close();
	}

}
