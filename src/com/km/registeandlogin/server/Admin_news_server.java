package com.km.registeandlogin.server;
import com.km.loginandregister.Dao.UserDao;
import com.km.pojo.t_gonggao;

public class Admin_news_server {
	/**
	 * 用于获取最新公告
	 * @return 返回boolean
	 */
	public boolean addNews(t_gonggao t_gonggao) {
		boolean i;
		UserDao uDao=new UserDao();
		i=uDao.addNews(t_gonggao);
		if(i==true){
			return true;
		}
		return false;
	}

}
