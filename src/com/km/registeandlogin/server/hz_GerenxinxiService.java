package com.km.registeandlogin.server;

import com.km.loginandregister.Dao.hz_Dao;
import com.km.pojo.t_user;


public class hz_GerenxinxiService {
	 hz_Dao dao = new hz_Dao();
	//患者个人信息查询
	public t_user getall(t_user usersession) {
		return dao.getgerenxinxi(usersession);
	}
	public t_user getxiugai(t_user user) {
		return dao.getxiugai(user);
	}


}
