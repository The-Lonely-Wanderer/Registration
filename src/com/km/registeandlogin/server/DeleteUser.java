package com.km.registeandlogin.server;

import java.util.List;

import com.km.loginandregister.Dao.UserDao;
import com.km.pojo.t_user;

public class DeleteUser {
	/**
	 * @ps删除患者
	 */
	public List<t_user> deleteuser( int id){
		List<t_user> list;
		UserDao userDao=new UserDao();
		list=userDao.deleteUser(id);
		if(list!=null){
			return list;
		}else{
			
			return null;
		}
	}
}
