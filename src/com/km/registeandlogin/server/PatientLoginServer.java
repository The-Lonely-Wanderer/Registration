package com.km.registeandlogin.server;

import com.km.loginandregister.Dao.hz_Dao;
import com.km.pojo.t_user;

public class PatientLoginServer {
	/**
	 * 
	 * @param t_user
	 * @ps 调用 dao层 getgerenxinxi(t_user)方法 判断 接收到的t_user 是否为空  为空返回null否则返回t_user;
	 */
	public t_user getpatient(t_user t_user) {
			
		hz_Dao hz_Dao=new hz_Dao();
		t_user t_user2=new t_user();
		t_user2=hz_Dao.getgerenxinxi(t_user);
		if(t_user2!=null){
			return t_user2;
		}
		return null;
	}

}
