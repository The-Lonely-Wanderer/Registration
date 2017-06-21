package com.km.loginandregister.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.km.loginandregister.util.ConnectionFactory;
import com.km.pojo.t_keshi;
import com.km.pojo.t_user;
import com.km.pojo.t_yisheng;
import com.km.pojo.t_yuyue;

public class hz_Dao {

	// 患者个人信息查询

	/**
	 * 
	 * @param usersession
	 * @ps 传入 t_user对象 返回t_user对象
	 */
	
	public t_user getgerenxinxi(t_user user_name) {
		Connection conn = ConnectionFactory.getConnectionFactory();
		PreparedStatement ps = null;
		t_user t_user1=new t_user();
		try {
			ps = conn.prepareStatement(
					"select  * from t_user where user_name = ?");
			ps.setString(1, user_name.getUser_name());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				t_user1 = new t_user(rs.getInt("user_id"),rs.getString("user_name"),rs.getString("user_password"), rs.getString("user_type"),

						rs.getString("user_realname"), rs.getString("user_address"), rs.getLong("user_tel"));
				
				return t_user1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	// 患者修改个人信息
	public t_user getxiugai(t_user user) {
		Connection conn = ConnectionFactory.getConnectionFactory();
		PreparedStatement ps = null;
		System.out.println(user);
		try {
			ps = conn.prepareStatement(
					"update t_user set user_password=? ,user_type=?, user_realname=?,user_address=?,user_tel=? where user_name=?");
			ps.setString(1, user.getUser_password());
			
			ps.setString(2, user.getUser_type());
			ps.setString(3, user.getUser_realname());
			ps.setString(4, user.getUser_address());
			ps.setLong(5, user.getUser_tel());
			ps.setString(6, user.getUser_name());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	// 用户注册
	public t_user RegisterServer(t_user user) {
		Connection conn = ConnectionFactory.getConnectionFactory();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement("insert into t_user values(?,?,?,?,?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, user.getUser_name());
			ps.setString(3, user.getUser_password());
			ps.setString(4, user.getUser_type());
			ps.setString(5, user.getUser_realname());
			ps.setString(6, user.getUser_address());
			ps.setLong(7, user.getUser_tel());
			ps.setString(8, "no");
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	// 处理科室预约查询的service
	public List<t_keshi> hz_ajaxkeshiyuyue() {
		Connection conn = ConnectionFactory.getConnectionFactory();
		PreparedStatement ps = null;
		List<t_keshi> list = new ArrayList<t_keshi>();
		try {
			ps = conn.prepareStatement("select keshi_id , keshi_anme,keshi_jianjie ,keshi_yisheng from t_keshi");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				t_keshi user = new t_keshi(rs.getInt("keshi_id") ,rs.getString("keshi_anme"), rs.getString("keshi_jianjie"),rs.getInt("keshi_yisheng"));
				list.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	//医生查询

	public List<t_yisheng> getlook(t_keshi keshi) {
			Connection conn = ConnectionFactory.getConnectionFactory();
			PreparedStatement ps = null;
			t_yisheng yisheng = new t_yisheng();
			List<t_yisheng> list = new ArrayList<t_yisheng>();
			try {
				ps = conn.prepareStatement("SELECT * from t_yisheng where keshi_id = ?");
				ps.setInt(1, keshi.getKeshi_id());
				ResultSet rs = ps.executeQuery();	
				while (rs.next()) {
					yisheng = new t_yisheng(rs.getInt("yisheng_id"),rs.getString("yisheng_name"), rs.getString("yisheng_sex"),
							rs.getString("yisheng_age"), rs.getString("yisheng_zhicheng"));
//					System.out.println(yisheng.getYisheng_name());
					list.add(yisheng);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
		}
//预约医生插入备注以及信息
	public boolean getyuyueyisheng(t_yuyue yuyue) {
		Connection conn = ConnectionFactory.getConnectionFactory();
		PreparedStatement ps = null;
		Date time = new Date(System.currentTimeMillis());
		try {
			ps = conn.prepareStatement("insert into t_yuyue values(?,(SELECT user_id FROM t_user WHERE user_id = ?),?,?,?,?,?,?)");
			ps.setInt(1, 0);
			ps.setInt(2, yuyue.getYuyue_userId());
			ps.setInt(3, yuyue.getYuyue_yishengId());
			ps.setString(4, ""+time);
			ps.setString(5, yuyue.getYuyue_beizhu());
			ps.setString(6, "no");
			ps.setString(7, null);
			ps.setString(8, null);
			boolean duixiang =  ps.execute();
			if(duixiang){
				return duixiang;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	//患者查询自己的预约
	public List<t_yuyue> gethuanzheyuyueall(t_yuyue yuyue) {
		Connection conn = ConnectionFactory.getConnectionFactory();
		PreparedStatement ps = null;
		List<t_yuyue> list = new ArrayList<t_yuyue>();
		try {
			ps = conn.prepareStatement("select ys.yisheng_name,ty.id ,ty.shijian,ty.beizhu   from t_yuyue ty left join t_yisheng ys on ty.yishengId = ys.yisheng_id where ty.userId = ?");
//			System.out.println(yuyue.getYuyue_userId());
			ps.setInt(1, yuyue.getYuyue_userId());
			ResultSet rs = ps.executeQuery();	
			while (rs.next()) {
				yuyue = new t_yuyue(rs.getInt("id"),rs.getString("yisheng_name"),rs.getString("shijian"),rs.getString("beizhu"));
//				System.out.println(yisheng.getYisheng_name());
				list.add(yuyue);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	//患者取消预约
	public List<t_yuyue> quxiao(t_yuyue yuyue) {
		Connection conn = ConnectionFactory.getConnectionFactory();
		PreparedStatement ps = null;
		List<t_yuyue> alList = new ArrayList<t_yuyue>();
		try {
			
			ps = conn.prepareStatement("delete from t_yuyue where id = ? ");
			ps.setInt(1, yuyue.getYuyue_id());
			
			int i = ps.executeUpdate();
//			System.out.println(i);
			if (i == 1) {
				alList = gethuanzheyuyueall(yuyue);
//				System.out.println(alList);
				return alList;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


		//医生修改患者预约的信息
	public t_yuyue getxiugaihuanzhe(t_yuyue yuyue) {
		Connection conn = ConnectionFactory.getConnectionFactory();
		PreparedStatement ps = null;
		Date time = new Date(System.currentTimeMillis());
		try {
			ps=conn.prepareStatement("update t_yuyue set paiqishijian =? ,zhuanjiajianyi=? where id=?");
			ps.setString(1, ""+time);
			ps.setString(2, yuyue.getYuyue_zhuanjiajianyi());
			ps.setInt(3, yuyue.getYuyue_id());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


}
