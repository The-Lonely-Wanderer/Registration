package com.km.registeandlogin.server;

import java.util.List;

import com.km.loginandregister.Dao.UserDao;
import com.km.pojo.t_yisheng;

public class Admin_doctor_Server {
	/**
	 * @ps 调用userDao.getAlldoctorUser()
	 * @return 返回t_yisheng 集合对象
	 */
	public static List<t_yisheng> getdoctoclist() {
			
		List<t_yisheng> t_yisheng;
		UserDao userDao=new UserDao();
		t_yisheng=userDao.getAlldoctorUser();
			if(t_yisheng!=null){
				return t_yisheng;
			}
		return null;
	}
}
