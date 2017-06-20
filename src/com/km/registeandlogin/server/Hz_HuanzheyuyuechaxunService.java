package com.km.registeandlogin.server;

import java.util.List;

import com.km.loginandregister.Dao.hz_Dao;
import com.km.pojo.t_yuyue;

public class Hz_HuanzheyuyuechaxunService {
	hz_Dao dao = new hz_Dao();
	public List<t_yuyue> gethuanzheyuyueall(t_yuyue yuyue) {
		return dao.gethuanzheyuyueall(yuyue);
	}

}
