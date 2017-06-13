package com.km.registeandlogin.server;
import com.km.loginandregister.Dao.UserDao;
import com.km.registeandlogin.vo.User;

public class RegisterServer {
	public boolean registerserver(String username, String password) {
		boolean flage;
		User user = new User(username, password);
		UserDao userDao = new UserDao();
		flage = userDao.insertpatientuser(user);
		if (flage == true) {
			return true;
		} else {
			return false;
		}
	}
}
