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
import com.km.pojo.t_user;
import com.km.registeandlogin.server.DeleteAdminServer;
import com.km.registeandlogin.server.DeleteUserServer;

/**
 * Servlet implementation class Admnin_admin_list
 */
@WebServlet("/Admin_admin_delete")
public class Admnin_admin_DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admnin_admin_DeleteServlet() {
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
		String id = request.getParameter("id");
		int id2 = Integer.parseInt(id);
		System.out.println(id2);
		List<t_admin> adminslist;
		DeleteAdminServer deleteAdmin = new DeleteAdminServer();
		adminslist = deleteAdmin.deleteAdmin(id2);
		JSONObject jsonObject = new JSONObject();
		JSONArray jsonArray = new JSONArray();
		jsonObject.put("adminslist", adminslist);
		jsonArray.add(jsonObject);
		PrintWriter out = response.getWriter();
		out.println(jsonArray.toJSONString());
		out.close();	
		
	}

}
