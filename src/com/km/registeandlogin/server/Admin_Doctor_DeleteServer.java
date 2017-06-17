package com.km.registeandlogin.server;

import java.util.List;

import com.km.loginandregister.Dao.UserDao;
import com.km.pojo.t_yisheng;

public class Admin_Doctor_DeleteServer {
	/**
	 * 
	 * @param 传入需要删除的医生id
	 * @return 返回更新后的所有医生对象集合，删除失败则返回null
	 */
	public List<t_yisheng> doctordelete(int id) {
		// TODO Auto-generated method stub
		List<t_yisheng> yishenglist;
		UserDao userDao=new UserDao();
		yishenglist=userDao.deleteDoctor(id);
		if(yishenglist!=null){
			return yishenglist;
		}
		return null;
	}

}
