package com.km.registeandlogin.server;

import java.util.List;

import com.km.loginandregister.Dao.hz_Dao;
import com.km.pojo.t_yuyue;

public class Ys_XiugaiyuyueService {
	hz_Dao dao = new hz_Dao();

	public t_yuyue getxiugai(t_yuyue yuyue) {
		return dao.getxiugaihuanzhe(yuyue);
	}
	

}
