package com.km.pojo;

public class t_liuyan {
	// 1.留言的编号、标题、内容、日期、患者；
	private int liulyan_id;
	private String liuyan_title;
	private String liuyan_content;
	private String liuyan_date;
	private String liuyan_user;

	// 2.get set 方法；
	public int getLiulyan_id() {
		return liulyan_id;
	}

	public void setLiulyan_id(int liulyan_id) {
		this.liulyan_id = liulyan_id;
	}

	public String getLiuyan_title() {
		return liuyan_title;
	}

	public void setLiuyan_title(String liuyan_title) {
		this.liuyan_title = liuyan_title;
	}

	public String getLiuyan_content() {
		return liuyan_content;
	}

	public void setLiuyan_content(String liuyan_content) {
		this.liuyan_content = liuyan_content;
	}

	public String getLiuyan_date() {
		return liuyan_date;
	}

	public void setLiuyan_date(String liuyan_date) {
		this.liuyan_date = liuyan_date;
	}

	public String getLiuyan_user() {
		return liuyan_user;
	}

	public void setLiuyan_user(String liuyan_user) {
		this.liuyan_user = liuyan_user;
	}

	// 3.hash code 方法和equals 方法；
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + liulyan_id;
		result = prime * result + ((liuyan_content == null) ? 0 : liuyan_content.hashCode());
		result = prime * result + ((liuyan_date == null) ? 0 : liuyan_date.hashCode());
		result = prime * result + ((liuyan_title == null) ? 0 : liuyan_title.hashCode());
		result = prime * result + ((liuyan_user == null) ? 0 : liuyan_user.hashCode());
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
		t_liuyan other = (t_liuyan) obj;
		if (liulyan_id != other.liulyan_id)
			return false;
		if (liuyan_content == null) {
			if (other.liuyan_content != null)
				return false;
		} else if (!liuyan_content.equals(other.liuyan_content))
			return false;
		if (liuyan_date == null) {
			if (other.liuyan_date != null)
				return false;
		} else if (!liuyan_date.equals(other.liuyan_date))
			return false;
		if (liuyan_title == null) {
			if (other.liuyan_title != null)
				return false;
		} else if (!liuyan_title.equals(other.liuyan_title))
			return false;
		if (liuyan_user == null) {
			if (other.liuyan_user != null)
				return false;
		} else if (!liuyan_user.equals(other.liuyan_user))
			return false;
		return true;
	}

	// 4.无参构造方法
	public t_liuyan() {
	}

	// 5.有参构造方法；
	public t_liuyan(int liulyan_id, String liuyan_title, String liuyan_content, String liuyan_date,
			String liuyan_user) {
		super();
		this.liulyan_id = liulyan_id;
		this.liuyan_title = liuyan_title;
		this.liuyan_content = liuyan_content;
		this.liuyan_date = liuyan_date;
		this.liuyan_user = liuyan_user;
	}

	// 6.to string 方法；
	@Override
	public String toString() {
		return "t_liuyan [liulyan_id=" + liulyan_id + ", liuyan_title=" + liuyan_title + ", liuyan_content="
				+ liuyan_content + ", liuyan_date=" + liuyan_date + ", liuyan_user=" + liuyan_user + "]";
	}

}
