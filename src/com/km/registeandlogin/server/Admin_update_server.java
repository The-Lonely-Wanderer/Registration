package com.km.registeandlogin.server;

import com.km.loginandregister.Dao.UserDao;
import com.km.pojo.t_admin;

public class Admin_update_server {
	public boolean Admin_update(t_admin t_admin) {
		boolean fla;
		UserDao userDao = new UserDao();
		fla = userDao.getupdateAdmin(t_admin);
		if (fla == true) {
			return true;
		} else {
			return false;
		}

	}
}
