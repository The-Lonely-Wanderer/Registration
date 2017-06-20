package com.km.registeandlogin.server;

import java.util.List;

import com.km.loginandregister.Dao.hz_Dao;
import com.km.pojo.t_yuyue;

public class Hz_QuxiaoyuyueService {
	hz_Dao dao = new hz_Dao();
	public List<t_yuyue> quxiao(t_yuyue yuyue) {
		
		return dao.quxiao(yuyue);
	}

}
