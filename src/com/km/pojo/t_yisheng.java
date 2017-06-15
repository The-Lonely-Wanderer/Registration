package com.km.pojo;

public class t_yisheng {
	// 1.医生的编号、名字、密码、性别、年龄、职称、科室编号、del；
	private int yisheng_id;
	private String yisheng_name;
	private String yisheng_password;
	private String yisheng_sex;
	private String yisheng_age;
	private String yisheng_zhicheng;
	private int keshi_id;
	private String yisheng_del;

	// 2.get set方法；
	public int getYisheng_id() {
		return yisheng_id;
	}

	public void setYisheng_id(int yisheng_id) {
		this.yisheng_id = yisheng_id;
	}

	public String getYisheng_name() {
		return yisheng_name;
	}

	public void setYisheng_name(String yisheng_name) {
		this.yisheng_name = yisheng_name;
	}

	public String getYisheng_password() {
		return yisheng_password;
	}

	public void setYisheng_password(String yisheng_password) {
		this.yisheng_password = yisheng_password;
	}

	public String getYisheng_sex() {
		return yisheng_sex;
	}

	public void setYisheng_sex(String yisheng_sex) {
		this.yisheng_sex = yisheng_sex;
	}

	public String getYisheng_age() {
		return yisheng_age;
	}

	public void setYisheng_age(String yisheng_age) {
		this.yisheng_age = yisheng_age;
	}

	public String getYisheng_zhicheng() {
		return yisheng_zhicheng;
	}

	public void setYisheng_zhicheng(String yisheng_zhicheng) {
		this.yisheng_zhicheng = yisheng_zhicheng;
	}

	public int getKeshi_id() {
		return keshi_id;
	}

	public void setKeshi_id(int keshi_id) {
		this.keshi_id = keshi_id;
	}

	public String getYisheng_del() {
		return yisheng_del;
	}

	public void setYisheng_del(String yisheng_del) {
		this.yisheng_del = yisheng_del;
	}

	// 3.hash code 方法和equals方法；

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + keshi_id;
		result = prime * result + ((yisheng_age == null) ? 0 : yisheng_age.hashCode());
		result = prime * result + ((yisheng_del == null) ? 0 : yisheng_del.hashCode());
		result = prime * result + yisheng_id;
		result = prime * result + ((yisheng_name == null) ? 0 : yisheng_name.hashCode());
		result = prime * result + ((yisheng_password == null) ? 0 : yisheng_password.hashCode());
		result = prime * result + ((yisheng_sex == null) ? 0 : yisheng_sex.hashCode());
		result = prime * result + ((yisheng_zhicheng == null) ? 0 : yisheng_zhicheng.hashCode());
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
		t_yisheng other = (t_yisheng) obj;
		if (keshi_id != other.keshi_id)
			return false;
		if (yisheng_age == null) {
			if (other.yisheng_age != null)
				return false;
		} else if (!yisheng_age.equals(other.yisheng_age))
			return false;
		if (yisheng_del == null) {
			if (other.yisheng_del != null)
				return false;
		} else if (!yisheng_del.equals(other.yisheng_del))
			return false;
		if (yisheng_id != other.yisheng_id)
			return false;
		if (yisheng_name == null) {
			if (other.yisheng_name != null)
				return false;
		} else if (!yisheng_name.equals(other.yisheng_name))
			return false;
		if (yisheng_password == null) {
			if (other.yisheng_password != null)
				return false;
		} else if (!yisheng_password.equals(other.yisheng_password))
			return false;
		if (yisheng_sex == null) {
			if (other.yisheng_sex != null)
				return false;
		} else if (!yisheng_sex.equals(other.yisheng_sex))
			return false;
		if (yisheng_zhicheng == null) {
			if (other.yisheng_zhicheng != null)
				return false;
		} else if (!yisheng_zhicheng.equals(other.yisheng_zhicheng))
			return false;
		return true;
	}

	// 4.无参构造方法；
	public t_yisheng() {
	}

	// 5.有参构造方法；
	public t_yisheng(int yisheng_id, String yisheng_name, String yisheng_password, String yisheng_sex,
			String yisheng_age, String yisheng_zhicheng, int keshi_id, String yisheng_del) {
		this.yisheng_id = yisheng_id;
		this.yisheng_name = yisheng_name;
		this.yisheng_password = yisheng_password;
		this.yisheng_sex = yisheng_sex;
		this.yisheng_age = yisheng_age;
		this.yisheng_zhicheng = yisheng_zhicheng;
		this.keshi_id = keshi_id;
		this.yisheng_del = yisheng_del;
	}
	
	public t_yisheng(String yisheng_name, String yisheng_password) {
		this.yisheng_name = yisheng_name;
		this.yisheng_password = yisheng_password;
	}
	public t_yisheng(int yisheng_id, String yisheng_name, String yisheng_sex, String yisheng_age,
			String yisheng_zhicheng, int keshi_id) {
		this.yisheng_id = yisheng_id;
		this.yisheng_name = yisheng_name;
		this.yisheng_sex = yisheng_sex;
		this.yisheng_age = yisheng_age;
		this.yisheng_zhicheng = yisheng_zhicheng;
		this.keshi_id = keshi_id;

	}

	public t_yisheng(int yisheng_id, String yisheng_sex, String yisheng_age, String yisheng_zhicheng, int kehsi_id) {
		// TODO Auto-generated constructor stub
		this.yisheng_id=yisheng_id;
		this.yisheng_sex=yisheng_sex;
		this.yisheng_age=yisheng_age;
		this.yisheng_zhicheng=yisheng_zhicheng;
		this.keshi_id=kehsi_id;
	}

	// 6.to string 方法；


	@Override
	public String toString() {
		return "t_yisheng [yisheng_id=" + yisheng_id + ", yisheng_name=" + yisheng_name + ", yisheng_password="
				+ yisheng_password + ", yisheng_sex=" + yisheng_sex + ", yisheng_age=" + yisheng_age
				+ ", yisheng_zhicheng=" + yisheng_zhicheng + ", keshi_id=" + keshi_id + ", yisheng_del=" + yisheng_del
				+ "]";
	}

}
