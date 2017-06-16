package com.km.registeandlogin.server;

import java.util.List;

import com.km.loginandregister.Dao.hz_Dao;
import com.km.pojo.t_keshi;
import com.km.pojo.t_yisheng;

public class Hz_YichengxhekanService {
	hz_Dao dao = new hz_Dao();

	public List<t_yisheng> getlook(t_keshi keshi) {
	
		return dao.getlook(keshi);
	}

}
