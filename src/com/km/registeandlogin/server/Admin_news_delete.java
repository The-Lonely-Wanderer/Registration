package com.km.registeandlogin.server;
import com.km.loginandregister.Dao.UserDao;

public class Admin_news_delete {
	/**
	 * @ps 获取传入的id 返回boolean值；
	 * 
	 */

	public boolean Admin_deletenews(int id) {

		boolean flage;
		UserDao uDao = new UserDao();
		flage = uDao.Admin_deletenews(id);
		if (flage == true) {
			return true;
		} else {

			return false;

		}

	}

}
