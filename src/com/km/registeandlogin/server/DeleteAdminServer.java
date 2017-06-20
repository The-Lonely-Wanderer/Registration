package com.km.registeandlogin.server;

import java.util.List;

import com.km.loginandregister.Dao.UserDao;
import com.km.pojo.t_admin;

public class DeleteAdminServer {

	public List<t_admin> deleteAdmin(int id) {
		/**
		 *  @param 传入删除的医生对应的id
		 * @return  返回删除后的所有医生的集合,删除失败后返回null
		 */
		List<t_admin> adminlist;
		UserDao userDao=new UserDao();
		adminlist=userDao.deleteAdmin(id);
		
		if(adminlist!=null){
			return adminlist;
		}
		return null;
	}

	
	
	
	
	
}
