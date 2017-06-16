package com.km.registeandlogin.server;

import java.util.ArrayList;
import java.util.List;
import com.km.loginandregister.Dao.UserDao;
import com.km.pojo.t_user;
import com.km.registeandlogin.vo.User;

public class AllUserServer {
	public List<t_user> getlist(){
		List<t_user> list=new ArrayList<t_user>();
		UserDao userDao=new UserDao();
		list=userDao.getAllUser();
		return list;
	}
	
}
