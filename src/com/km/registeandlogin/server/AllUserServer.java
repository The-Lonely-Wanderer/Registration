package com.km.registeandlogin.server;

import java.util.ArrayList;
import java.util.List;
import com.km.loginandregister.Dao.UserDao;
import com.km.registeandlogin.vo.User;

public class AllUserServer {
	public List<User> getlist(){
		List<User> list=new ArrayList<User>();
		UserDao userDao=new UserDao();
		list=userDao.getAllUser();	
		return list;
	}
	
}
