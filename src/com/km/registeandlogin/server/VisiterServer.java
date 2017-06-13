package com.km.registeandlogin.server;

import com.km.loginandregister.Dao.UserDao;

public class VisiterServer {
	int count;
	public int getcounts(){
		UserDao userDao=new UserDao();
		count=userDao.getcount();
		
		return count;
	}
	public void updatecounts(int i) {
		
		UserDao userDao=new UserDao();
		userDao.updatecount(i);
	}
}
