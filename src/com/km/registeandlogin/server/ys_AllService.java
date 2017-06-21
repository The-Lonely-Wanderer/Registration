package com.km.registeandlogin.server;

import java.util.List;

import com.km.loginandregister.Dao.UserDao;
import com.km.pojo.t_yuyue;

public class ys_AllService {

	UserDao dao = new UserDao();

	public List<t_yuyue> getAll(t_yuyue yuyue) {
		return dao.getYuyue(yuyue);
	}

}
