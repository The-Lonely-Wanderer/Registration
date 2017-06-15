package com.km.registeandlogin.server;

import com.km.loginandregister.Dao.UserDao;
import com.km.pojo.t_yisheng;

public class ys_XiugaiGerenxinxiService {
	UserDao dao = new UserDao();
	public t_yisheng getXiugai(t_yisheng xgxi) {
		return dao.getXiugai(xgxi) ;
	}

}
