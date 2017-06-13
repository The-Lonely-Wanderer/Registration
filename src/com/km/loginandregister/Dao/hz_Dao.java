package com.km.loginandregister.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.km.loginandregister.util.ConnectionFactory;
import com.km.pojo.t_user;


public class hz_Dao {
	
	//患者个人信息查询
	public t_user getgerenxinxi(t_user usersession) {
		Connection conn = ConnectionFactory.getConnectionFactory();
		PreparedStatement ps = null;
		
		try {
			ps = conn.prepareStatement("select  user_password, user_type, user_realname , user_address from t_user where user_name = ?");
			ps.setString(1, usersession.getUser_name());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				usersession = new t_user(rs.getString("user_password"),rs.getString("user_type"),rs.getString("user_realname"),rs.getString("user_address"));	
			System.out.println(usersession.getUser_name());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usersession;
	}

	public t_user getxiugai(t_user user) {
		Connection conn = ConnectionFactory.getConnectionFactory();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement("update counts set user_password=? ,user_type=?, user_realname=?,user_address=?");
			ps.setString(1, user.getUser_password());
			ps.setString(2, user.getUser_type());
			ps.setString(3, user.getUser_realname());
			ps.setString(4, user.getUser_address());
			ps.execute();
			System.out.println("患者用户修改成功");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}	
}
