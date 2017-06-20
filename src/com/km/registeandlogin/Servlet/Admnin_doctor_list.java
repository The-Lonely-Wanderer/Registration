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
import com.km.pojo.t_user;
import com.km.pojo.t_yisheng;
import com.km.registeandlogin.server.Admin_doctor_Server;
import com.km.registeandlogin.server.AllUserServer;

/**
 * Servlet implementation class Admnin_doctor_list
 */
@WebServlet("/Admnin_doctor_list")
public class Admnin_doctor_list extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admnin_doctor_list() {
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
		List<t_yisheng> doctorlList;
		Admin_doctor_Server alldoctorServer=new Admin_doctor_Server();
		doctorlList=alldoctorServer.getdoctoclist();
		JSONObject jsonObject=new JSONObject();
		JSONArray jsonArray=new JSONArray();
		jsonObject.put("doctorlList", doctorlList);
		jsonArray.add(jsonObject);
		PrintWriter out = response.getWriter();
		out.println(jsonArray.toJSONString());
		out.close();
		
	}

}
