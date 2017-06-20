package com.km.registeandlogin.server;

import com.km.loginandregister.Dao.UserDao;
import com.km.pojo.t_yisheng;

public class Admin_adddoctor_server {
	/**
	 * 增加医生用户，返回boolean
	 */

	public boolean adddoctor(t_yisheng t_yisheng) {
		boolean falge;
		UserDao userDao = new UserDao();
		falge = userDao.insertDoator(t_yisheng);
		if (falge == true) {
			return true;
		} else {
			return false;
		}
	}

}
