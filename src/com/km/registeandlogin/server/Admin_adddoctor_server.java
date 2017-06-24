package com.km.registeandlogin.server;

import java.util.ArrayList;
import java.util.List;

import com.km.loginandregister.Dao.UserDao;
import com.km.pojo.t_yisheng;

public class Admin_adddoctor_server {
	/**
	 * 增加医生用户，返回boolean
	 */

	public List<t_yisheng> adddoctor(t_yisheng t_yisheng) {
		List<t_yisheng> yishenglist=new ArrayList<t_yisheng>();
		UserDao userDao = new UserDao();
		yishenglist = userDao.insertDoator(t_yisheng);
		if (yishenglist!=null) {
			return yishenglist;
		} else {
			return null;
		}
	}

}
