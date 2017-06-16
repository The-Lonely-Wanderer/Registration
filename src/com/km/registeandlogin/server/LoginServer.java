package com.km.registeandlogin.server;

import com.km.loginandregister.Dao.UserDao;
import com.km.pojo.t_yisheng;
import com.km.registeandlogin.vo.User;

public class LoginServer {
	public t_yisheng getDoctor(String username,String password){
		t_yisheng t_yisheng;
		t_yisheng user=new t_yisheng(username, password);
		UserDao uDao=new UserDao();
		t_yisheng=uDao.getdoctorLogin(user);
		if(t_yisheng!=null){
			return t_yisheng;
		}else{
			return null;
		}
	}	
}
