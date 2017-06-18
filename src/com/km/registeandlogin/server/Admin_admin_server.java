package com.km.registeandlogin.server;

import java.util.List;

import com.km.loginandregister.Dao.UserDao;
import com.km.pojo.t_admin;

public class Admin_admin_server {
	/**
	 * @ps 用于查询所有的管理员用户
	 * @return 查询成功后返回所有管理员用户的集合,查询失败后返回null
	 */
	public List<t_admin> getAllAdmin() {

		List<t_admin> admibList;
		UserDao userDao = new UserDao();
		admibList = userDao.getAlladmin();
		if (admibList != null) {

			return admibList;
		} else {

			return null;
		}

	}

}
