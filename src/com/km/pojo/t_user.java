package com.km.pojo;

public class t_user {
	// 1.患者的编号、名字、密码、类型、真实名字、收货地址、tel、del;
	private int user_id;
	private String user_name;
	private String user_password;
	private String user_type;
	private String user_realname;
	private String user_address;
	private long user_tel;
	private String user_del;

	// 2.get set方法；
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public String getUser_realname() {
		return user_realname;
	}

	public void setUser_realname(String user_realname) {
		this.user_realname = user_realname;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public String getUser_del() {
		return user_del;
	}

	public void setUser_del(String user_del) {
		this.user_del = user_del;
	}

	public long getUser_tel() {
		return user_tel;
	}

	public void setUser_tel(long user_tel) {
		this.user_tel = user_tel;
	}

	// 4.无参构造方法；
	public t_user() {
	}

	// 3.hash code方法和 equals方法；
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((user_address == null) ? 0 : user_address.hashCode());
		result = prime * result + ((user_del == null) ? 0 : user_del.hashCode());
		result = prime * result + user_id;
		result = prime * result + ((user_name == null) ? 0 : user_name.hashCode());
		result = prime * result + ((user_password == null) ? 0 : user_password.hashCode());
		result = prime * result + ((user_realname == null) ? 0 : user_realname.hashCode());
		result = prime * result + (int) (user_tel ^ (user_tel >>> 32));
		result = prime * result + ((user_type == null) ? 0 : user_type.hashCode());
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
		t_user other = (t_user) obj;
		if (user_address == null) {
			if (other.user_address != null)
				return false;
		} else if (!user_address.equals(other.user_address))
			return false;
		if (user_del == null) {
			if (other.user_del != null)
				return false;
		} else if (!user_del.equals(other.user_del))
			return false;
		if (user_id != other.user_id)
			return false;
		if (user_name == null) {
			if (other.user_name != null)
				return false;
		} else if (!user_name.equals(other.user_name))
			return false;
		if (user_password == null) {
			if (other.user_password != null)
				return false;
		} else if (!user_password.equals(other.user_password))
			return false;
		if (user_realname == null) {
			if (other.user_realname != null)
				return false;
		} else if (!user_realname.equals(other.user_realname))
			return false;
		if (user_tel != other.user_tel)
			return false;
		if (user_type == null) {
			if (other.user_type != null)
				return false;
		} else if (!user_type.equals(other.user_type))
			return false;
		return true;
	}

	// 5.有参构造方法；

	public t_user(String user_name, String user_password) {
		this.user_name = user_name;
		this.user_password = user_password;
	}



	public t_user(int user_id, String user_name, String user_password, String user_type, String user_realname,
			String user_address, String user_del, long user_tel) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_password = user_password;
		this.user_type = user_type;
		this.user_realname = user_realname;
		this.user_address = user_address;
		this.user_del = user_del;
		this.user_tel = user_tel;
	}
	public t_user(int user_id, String user_name, String user_password, String user_type, String user_realname,
			String user_address, long user_tel) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_password = user_password;
		this.user_type = user_type;
		this.user_realname = user_realname;
		this.user_address = user_address;
		this.user_tel = user_tel;
	}

	public t_user(String user_password, String user_type, String user_realname, String user_address, long user_tel) {

		this.user_password = user_password;
		this.user_type = user_type;
		this.user_realname = user_realname;
		this.user_address = user_address;
		this.user_tel = user_tel;
	}


	//患者修改的构造方法
	public t_user(String username, String user_password, String user_type, String user_realname,
			String user_address, long user_tel) {
		this.user_name = username;
		this.user_password = user_password;
		this.user_type = user_type;
		this.user_realname = user_realname;
		this.user_address = user_address;
		this.user_tel = user_tel;
	}

	@Override
	public String toString() {
		return "t_user [user_id=" + user_id + ", user_name=" + user_name + ", user_password=" + user_password
				+ ", user_type=" + user_type + ", user_realname=" + user_realname + ", user_address=" + user_address
				+ ", user_del=" + user_del + ", user_tel=" + user_tel + "]";
	}

	// 6.to string 方法；

}
