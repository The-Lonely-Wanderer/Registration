package com.km.loginandregister.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.km.loginandregister.util.ConnectionFactory;
import com.km.pojo.t_user;

public class hz_Dao {

	// 患者个人信息查询
	public t_user getgerenxinxi(t_user usersession) {
		Connection conn = ConnectionFactory.getConnectionFactory();
		PreparedStatement ps = null;

		try {
			ps = conn.prepareStatement(
					"select  user_password, user_type, user_realname , user_address,user_tel from t_user where user_name = ?");
			ps.setString(1, usersession.getUser_name());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				usersession = new t_user(rs.getString("user_password"), rs.getString("user_type"),
						rs.getString("user_realname"), rs.getString("user_address"), rs.getInt("user_tel"));
				System.out.println(usersession.getUser_name());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usersession;
	}

	// 患者修改个人信息
	public t_user getxiugai(t_user user) {
		Connection conn = ConnectionFactory.getConnectionFactory();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(
					"update t_user set user_password=? ,user_type=?, user_realname=?,user_address=?,user_tel=? where user_name=?");
			ps.setString(1, user.getUser_password());
			ps.setString(2, user.getUser_type());
			ps.setString(3, user.getUser_realname());
			ps.setString(4, user.getUser_address());
			ps.setInt(5, user.getUser_tel());
			ps.setString(6, user.getUser_name());
			ps.execute();
			System.out.println("患者用户修改成功");
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
			ps = conn.prepareStatement("insert into t_user values(?,?,?,?,?,?,no)");
			ps.setString(1, user.getUser_name());
			ps.setString(2, user.getUser_password());
			ps.setString(3, user.getUser_type());
			ps.setString(4, user.getUser_realname());
			ps.setString(5, user.getUser_address());
			ps.setInt(6, user.getUser_tel());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}
}
