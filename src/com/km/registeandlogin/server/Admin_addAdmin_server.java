package com.km.registeandlogin.server;

import com.km.loginandregister.Dao.UserDao;
import com.km.pojo.t_admin;

public class Admin_addAdmin_server {

	/**
	 * @ps 增加管理员用户
	 */

	public boolean insertAdmin(t_admin t_admin) {

		boolean flage;
		UserDao userDao = new UserDao();

		flage = userDao.insertAdmin(t_admin);

		if (flage == true) {

			return true;
		} else {

			return false;
		}

	}

}
