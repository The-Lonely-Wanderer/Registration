package com.km.pojo;

public class t_admin {
	// 1.管理员的编号、名字、密码；
	private int user_id;
	private String userName;
	private String userPassword;

	// 2.get、set方法；
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	// 3.hash code方法和equals方法；

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((userPassword == null) ? 0 : userPassword.hashCode());
		result = prime * result + user_id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		t_admin other = (t_admin) obj;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (userPassword == null) {
			if (other.userPassword != null)
				return false;
		} else if (!userPassword.equals(other.userPassword))
			return false;
		if (user_id != other.user_id)
			return false;
		return true;
	}

	// 4.无参构造方法；
	public t_admin() {

	}

	// 5.有参构造方法；
	public t_admin(int user_id, String userName, String userPassword) {
		this.user_id = user_id;
		this.userName = userName;
		this.userPassword = userPassword;
	}

	public t_admin(String userName, String userPassword) {
		this.userName = userName;
		this.userPassword = userPassword;
	}

	// 6.to string方法；
	@Override
	public String toString() {
		return "t_admin [user_id=" + user_id + ", userName=" + userName + ", userPw=" + userPassword + "]";
	}

}
