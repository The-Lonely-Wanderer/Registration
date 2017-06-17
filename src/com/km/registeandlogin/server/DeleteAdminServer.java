package com.km.registeandlogin.server;

import java.util.List;

import com.km.loginandregister.Dao.UserDao;
import com.km.pojo.t_admin;

public class DeleteAdminServer {

	public List<t_admin> deleteAdmin(int id) {
	
		List<t_admin> adminlist;
		UserDao userDao=new UserDao();
		adminlist=userDao.deleteAdmin(id);
		
		if(adminlist!=null){
			return adminlist;
		}
		return null;
	}

	
	
	
	
	
}
