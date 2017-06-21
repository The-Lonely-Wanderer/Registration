package com.km.pojo;

public class t_yuyue {
	// 1.预约的编号、患者编号、医生编号、预约时间、备注信息、排期时间、专家建议；
	private int yuyue_id;
	private int yuyue_userId;
	private int yuyue_yishengId;
	private String yuyue_shijian;
	private String yuyue_beizhu;
	private String yuyue_paiqishijian;
	private String yuyue_zhuanjiajianyi;
	private String yisheng_name;
	private String huanzhe_name;

	
	// 2.get set方法
	public String getHuanzhe_name() {
		return huanzhe_name;
	}

	public void setHuanzhe_name(String huanzhe_name) {
		this.huanzhe_name = huanzhe_name;
	}

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

	public String getYuyue_zhuanjiajianyi() {
		return yuyue_zhuanjiajianyi;
	}

	public void setYuyue_zhuanjiajianyi(String yuyue_zhuanjiajianyi) {
		this.yuyue_zhuanjiajianyi = yuyue_zhuanjiajianyi;
	}

	public String getYisheng_name() {
		return yisheng_name;
	}

	public void setYisheng_name(String yisheng_name) {
		this.yisheng_name = yisheng_name;
	}

	// 3.hash code方法和equals方法；

	// 4.无参构造方法；
	public t_yuyue() {
	}

	


	// 5.有参构造方法；
	public t_yuyue(int yuyue_id, int yuyue_userId, int yuyue_yishengId, String yuyue_shijian, String yuyue_beizhu,
			String yuyue_paiqishijian, String yuyue_zhuanjiajianyi) {
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

	public t_yuyue(int yuyue_id,String yisheng_name, String yuyue_shijian, String yuyue_beizhu) {
		this.yisheng_name = yisheng_name;
		this.yuyue_shijian = yuyue_shijian;
		this.yuyue_beizhu = yuyue_beizhu;
		this.yuyue_id = yuyue_id;
	}

	

	public t_yuyue(int t_yuyue_id,int yuyue_userId) {
		this.yuyue_id = t_yuyue_id;
		this.yuyue_userId = yuyue_userId;
	}



	public t_yuyue(String user_name, String yuyue_shijian, String yuyue_beizhu,int yuyue_id) {
		this.huanzhe_name = user_name;
		this.yuyue_shijian = yuyue_shijian;
		this.yuyue_beizhu = yuyue_beizhu;
		this.yuyue_id = yuyue_id;
	}

	public t_yuyue(int yuyue_yishengid, String String) {
		this.yuyue_yishengId = yuyue_yishengid;
		
	}

	public t_yuyue(int yuyue_id, String yuyue_paiqishijian, String yuyue_zhuanjiajianyi) {
		this.yuyue_id = yuyue_id;
		this.yuyue_paiqishijian = yuyue_paiqishijian;
		this.yuyue_zhuanjiajianyi = yuyue_zhuanjiajianyi;
	}

	// 6.to string方法；
	@Override
	public String toString() {
		return "t_yuyue [yuyue_id=" + yuyue_id + ", yuyue_userId=" + yuyue_userId + ", yuyue_yishengId="
				+ yuyue_yishengId + ", yuyue_shijian=" + yuyue_shijian + ", yuyue_beizhu=" + yuyue_beizhu
				+ ", yuyue_paiqishijian=" + yuyue_paiqishijian + ", yuyue_zhuanjiajianyi=" + yuyue_zhuanjiajianyi
				+ ", yisheng_name=" + yisheng_name + ", huanzhe_name=" + huanzhe_name + "]";
	}

}
