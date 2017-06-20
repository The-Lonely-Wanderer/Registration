package com.km.pojo;

public class t_yuyue {
	// 1.预约的编号、患者编号、医生编号、预约时间、备注信息、排期时间、专家建议；
	private int yuyue_id;
	private int yuyue_userId;
	private int yuyue_yishengId;
	private String yuyue_shijian;
	private String yuyue_beizhu;
	private String yuyue_paiqishijian;
	private int yuyue_zhuanjiajianyi;
	private String yisheng_name;

	// 2.get set方法
	public int getYuyue_id() {
		return yuyue_id;
	}

	public void setYuyue_id(int yuyue_id) {
		this.yuyue_id = yuyue_id;
	}

	public int getYuyue_userId() {
		return yuyue_userId;
	}

	public void setYuyue_userId(int yuyue_userId) {
		this.yuyue_userId = yuyue_userId;
	}

	public int getYuyue_yishengId() {
		return yuyue_yishengId;
	}

	public void setYuyue_yishengId(int yuyue_yishengId) {
		this.yuyue_yishengId = yuyue_yishengId;
	}

	public String getYuyue_shijian() {
		return yuyue_shijian;
	}

	public void setYuyue_shijian(String yuyue_shijian) {
		this.yuyue_shijian = yuyue_shijian;
	}

	public String getYuyue_beizhu() {
		return yuyue_beizhu;
	}

	public void setYuyue_beizhu(String yuyue_beizhu) {
		this.yuyue_beizhu = yuyue_beizhu;
	}

	public String getYuyue_paiqishijian() {
		return yuyue_paiqishijian;
	}

	public void setYuyue_paiqishijian(String yuyue_paiqishijian) {
		this.yuyue_paiqishijian = yuyue_paiqishijian;
	}

	public int getYuyue_zhuanjiajianyi() {
		return yuyue_zhuanjiajianyi;
	}

	public void setYuyue_zhuanjiajianyi(int yuyue_zhuanjiajianyi) {
		this.yuyue_zhuanjiajianyi = yuyue_zhuanjiajianyi;
	}

	public String getYisheng_name() {
		return yisheng_name;
	}

	public void setYisheng_name(String yisheng_name) {
		this.yisheng_name = yisheng_name;
	}

	// 3.hash code方法和equals方法；

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((yisheng_name == null) ? 0 : yisheng_name.hashCode());
		result = prime * result + ((yuyue_beizhu == null) ? 0 : yuyue_beizhu.hashCode());
		result = prime * result + yuyue_id;
		result = prime * result + ((yuyue_paiqishijian == null) ? 0 : yuyue_paiqishijian.hashCode());
		result = prime * result + ((yuyue_shijian == null) ? 0 : yuyue_shijian.hashCode());
		result = prime * result + yuyue_userId;
		result = prime * result + yuyue_yishengId;
		result = prime * result + yuyue_zhuanjiajianyi;
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
		t_yuyue other = (t_yuyue) obj;
		if (yisheng_name == null) {
			if (other.yisheng_name != null)
				return false;
		} else if (!yisheng_name.equals(other.yisheng_name))
			return false;
		if (yuyue_beizhu == null) {
			if (other.yuyue_beizhu != null)
				return false;
		} else if (!yuyue_beizhu.equals(other.yuyue_beizhu))
			return false;
		if (yuyue_id != other.yuyue_id)
			return false;
		if (yuyue_paiqishijian == null) {
			if (other.yuyue_paiqishijian != null)
				return false;
		} else if (!yuyue_paiqishijian.equals(other.yuyue_paiqishijian))
			return false;
		if (yuyue_shijian == null) {
			if (other.yuyue_shijian != null)
				return false;
		} else if (!yuyue_shijian.equals(other.yuyue_shijian))
			return false;
		if (yuyue_userId != other.yuyue_userId)
			return false;
		if (yuyue_yishengId != other.yuyue_yishengId)
			return false;
		if (yuyue_zhuanjiajianyi != other.yuyue_zhuanjiajianyi)
			return false;
		return true;
	}
	// 4.无参构造方法；
	public t_yuyue() {
	}

	


	// 5.有参构造方法；
	public t_yuyue(int yuyue_id, int yuyue_userId, int yuyue_yishengId, String yuyue_shijian, String yuyue_beizhu,
			String yuyue_paiqishijian, int yuyue_zhuanjiajianyi) {
		super();
		this.yuyue_id = yuyue_id;
		this.yuyue_userId = yuyue_userId;
		this.yuyue_yishengId = yuyue_yishengId;
		this.yuyue_shijian = yuyue_shijian;
		this.yuyue_beizhu = yuyue_beizhu;
		this.yuyue_paiqishijian = yuyue_paiqishijian;
		this.yuyue_zhuanjiajianyi = yuyue_zhuanjiajianyi;
	}

	

	public t_yuyue(int yuyue_userId, int yuyue_yishengId, String yuyue_shijian, String yuyue_beizhu) {
		super();
		this.yuyue_userId = yuyue_userId;
		this.yuyue_yishengId = yuyue_yishengId;
		this.yuyue_shijian = yuyue_shijian;
		this.yuyue_beizhu = yuyue_beizhu;
	}

	public t_yuyue(int yuyue_userId, int yuyue_yishengId,  String yuyue_beizhu) {
		super();
		this.yuyue_userId = yuyue_userId;
		this.yuyue_yishengId = yuyue_yishengId;
		this.yuyue_beizhu = yuyue_beizhu;
	}






	public t_yuyue(int yuyue_userId) {
		this.yuyue_userId = yuyue_userId;
	}
//	public t_yuyue(int yuyue_id) {
//		this.yuyue_id = yuyue_id;
//	}

	public t_yuyue(int yuyue_id,String yisheng_name, String yuyue_shijian, String yuyue_beizhu) {
		this.yisheng_name = yisheng_name;
		this.yuyue_shijian = yuyue_shijian;
		this.yuyue_beizhu = yuyue_beizhu;
		this.yuyue_id = yuyue_id;
	}

	

//	public t_yuyue(int t_yuyue_id) {
//		this.yuyue_id = t_yuyue_id;
//	}

	// 6.to string方法；
	@Override
	public String toString() {
		return "t_yuyue [yuyue_id=" + yuyue_id + ", yuyue_userId=" + yuyue_userId + ", yuyue_yishengId="
				+ yuyue_yishengId + ", yuyue_shijian=" + yuyue_shijian + ", yuyue_beizhu=" + yuyue_beizhu
				+ ", yuyue_paiqishijian=" + yuyue_paiqishijian + ", yuyue_zhuanjiajianyi=" + yuyue_zhuanjiajianyi + "]";
	}

}
