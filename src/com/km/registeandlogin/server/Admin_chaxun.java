package com.km.registeandlogin.server;

import com.km.loginandregister.Dao.UserDao;
import com.km.pojo.t_admin;
import com.km.registeandlogin.vo.User;

public class Admin_chaxun {
	
	/**
	 * 
	 * @param 传入登陆的管理员对象 t_admin
	 * @return 返回 当前登陆的管理员对象，用于登陆
	 */
	public t_admin getAdmin(t_admin t_admin){
		 t_admin user2=new t_admin();
		UserDao userDao=new UserDao();
		user2=userDao.getadmin(t_admin);
		if(user2!=null){
			return user2;
		}else{
			return null;
			}
	}
	
	 
}
