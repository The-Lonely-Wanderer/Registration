package com.km.registeandlogin.server;

import java.util.List;

import com.km.loginandregister.Dao.UserDao;
import com.km.pojo.t_user;

public class Admin_patient_server {
	/**
	 * @ps 用于查询所有患者的方法
	 * @return 返回一个List<t_user> alList 对象
	 */
	public List<t_user> get_Admin_patient() {
		List<t_user> alList;
		UserDao userDao = new UserDao();
		alList=userDao.getAllUser();
		return null;
	}
}
