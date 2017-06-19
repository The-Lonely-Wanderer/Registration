package com.km.registeandlogin.server;

import java.util.ArrayList;
import java.util.List;

import com.km.loginandregister.Dao.UserDao;
import com.km.pojo.t_gonggao;

public class Admin_news_server {
	/**
	 * 用于获取最新公告
	 * @return 返回所有最新公告的集合
	 */
	public List<t_gonggao> getAllNews() {
		List<t_gonggao> Allnews=new ArrayList<t_gonggao>();
		UserDao uDao=new UserDao();
		Allnews=uDao.getAllNews();
		if(Allnews!=null){
			return Allnews;
		}
		return null;
	}

}
