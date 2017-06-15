package com.km.registeandlogin.server;

import java.util.List;

import com.km.loginandregister.Dao.hz_Dao;
import com.km.pojo.t_keshi;
import com.km.pojo.t_user;

public class Hz_KeshiyuyueAjaxService {
	//处理科室预约查询的service
	hz_Dao dao = new hz_Dao();
	public List<t_keshi> selectUsername() {
		
		return dao.hz_ajaxkeshiyuyue();

}

}
