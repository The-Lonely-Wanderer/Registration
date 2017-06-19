package com.km.registeandlogin.server;

import java.util.ArrayList;
import java.util.List;

import com.km.loginandregister.Dao.UserDao;
import com.km.pojo.t_gonggao;

public class Gonggao_server {

	/**
	 * @ps 获取公告
	 */
	public List<t_gonggao> getgonggao() {

		List<t_gonggao> t_gonggaos = new ArrayList<t_gonggao>();
		UserDao userDao = new UserDao();
		t_gonggaos = userDao.geT_gonggaos();
		if (t_gonggaos != null) {
			return t_gonggaos;
		} else {

			return null;
		}

	}
}
