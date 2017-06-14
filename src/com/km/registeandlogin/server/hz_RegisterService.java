package com.km.registeandlogin.server;

import com.km.loginandregister.Dao.hz_Dao;
import com.km.pojo.t_user;


public class hz_RegisterService {

	hz_Dao dao = new hz_Dao();
	public  t_user RegisterServer(t_user user) {
			
		return dao.RegisterServer(user);
	}
}
