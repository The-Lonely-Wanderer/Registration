package com.km.registeandlogin.server;

import com.km.loginandregister.Dao.UserDao;
import com.km.registeandlogin.vo.User;

public class LoginServer {
	public boolean Login(String username,String password){
		boolean login;
		User user=new User(username, password);
		UserDao uDao=new UserDao();
		login=uDao.getpatientLogin(user);
		if(login==true){
			return true;
		}else{
			return false;
		}
	}	
}
