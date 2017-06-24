package com.km.registeandlogin.server;

import java.util.List;

import com.km.loginandregister.Dao.UserDao;
import com.km.pojo.t_admin;

public class Admin_addAdmin_server {

	/**
	 * @ps 增加管理员用户
	 */

	public List<t_admin> insertAdmin(t_admin t_admin) {

		List<t_admin> adminlist;
		UserDao userDao = new UserDao();

		adminlist = userDao.insertAdmin(t_admin);

		if (adminlist!=null) {

			return adminlist;
		} else {

			return null;
		}

	}

}
