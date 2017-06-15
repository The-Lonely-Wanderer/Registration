package com.km.pojo;

public class t_keshi {
	// 1.科室的编号、名字、简介、医生、del；
	private int keshi_id;
	private String kehsi_name;
	private String keshi_jianjie;
	private int keshi_yisheng;
	private String keshi_del;

	// 2.get set方法；
	public int getKeshi_id() {
		return keshi_id;
	}

	public void setKeshi_id(int keshi_id) {
		this.keshi_id = keshi_id;
	}

	public String getKehsi_name() {
		return kehsi_name;
	}

	public void setKehsi_name(String kehsi_name) {
		this.kehsi_name = kehsi_name;
	}

	public String getKeshi_jianjie() {
		return keshi_jianjie;
	}

	public void setKeshi_jianjie(String keshi_jianjie) {
		this.keshi_jianjie = keshi_jianjie;
	}

	public int getKeshi_yisheng() {
		return keshi_yisheng;
	}

	public void setKeshi_yisheng(int keshi_yisheng) {
		this.keshi_yisheng = keshi_yisheng;
	}

	public String getKeshi_del() {
		return keshi_del;
	}

	public void setKeshi_del(String keshi_del) {
		this.keshi_del = keshi_del;
	}

	// 3.hash code方法和equals 方法；
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kehsi_name == null) ? 0 : kehsi_name.hashCode());
		result = prime * result + ((keshi_del == null) ? 0 : keshi_del.hashCode());
		result = prime * result + keshi_id;
		result = prime * result + ((keshi_jianjie == null) ? 0 : keshi_jianjie.hashCode());
		result = prime * result + keshi_yisheng;
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
		t_keshi other = (t_keshi) obj;
		if (kehsi_name == null) {
			if (other.kehsi_name != null)
				return false;
		} else if (!kehsi_name.equals(other.kehsi_name))
			return false;
		if (keshi_del == null) {
			if (other.keshi_del != null)
				return false;
		} else if (!keshi_del.equals(other.keshi_del))
			return false;
		if (keshi_id != other.keshi_id)
			return false;
		if (keshi_jianjie == null) {
			if (other.keshi_jianjie != null)
				return false;
		} else if (!keshi_jianjie.equals(other.keshi_jianjie))
			return false;
		if (keshi_yisheng != other.keshi_yisheng)
			return false;
		return true;
	}

	// 4.无参构造方法；
	public t_keshi() {
	}

	// 5.有参构造方法；
	public t_keshi(int keshi_id, String kehsi_name, String keshi_jianjie, int keshi_yisheng, String keshi_del) {
		super();
		this.keshi_id = keshi_id;
		this.kehsi_name = kehsi_name;
		this.keshi_jianjie = keshi_jianjie;
		this.keshi_yisheng = keshi_yisheng;
		this.keshi_del = keshi_del;
	}

	// 科室预约ajax构造方法
	public t_keshi(int keshi_id,String kehsi_name, String keshi_jianjie, int keshi_yisheng) {
		this.keshi_id = keshi_id;
		this.kehsi_name = kehsi_name;
		this.keshi_jianjie = keshi_jianjie;
		this.keshi_yisheng = keshi_yisheng;
	}



	// 6.to string 方法；
	@Override
	public String toString() {
		return "t_keshi [keshi_id=" + keshi_id + ", kehsi_name=" + kehsi_name + ", keshi_jianjie=" + keshi_jianjie
				+ ", keshi_yisheng=" + keshi_yisheng + ", keshi_del=" + keshi_del + "]";
	}

}
