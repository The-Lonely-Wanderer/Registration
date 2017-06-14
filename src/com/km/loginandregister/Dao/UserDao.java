package com.km.loginandregister.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.km.loginandregister.util.ConnectionFactory;
import com.km.pojo.t_admin;
import com.km.pojo.t_user;
import com.km.registeandlogin.vo.User;


public class UserDao {
	
	//患者
	/**
	 * @ps 用于查询患者用户，用于登录
	 *
	 * */
	public boolean getpatientLogin(User user) {// 查询患者用户，用于登录
		Connection conn = ConnectionFactory.getConnectionFactory();
		PreparedStatement ps = null;
		ResultSet set;
		User user1 = null;
		try {
			ps = conn.prepareStatement("select * from t_user where user_name=? and user_password=?");
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			set = ps.executeQuery();
			while (set.next()) {
				user1 = new User(set.getString("username"), set.getString("password"));
				if (user1 != null) {
					return true;
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	/**
	 * @ps 用于增加患者用户，用于注册
	 *
	 * */

	public boolean insertpatientuser(User user) {// 增加患者用户，用于注册
		Connection conn = ConnectionFactory.getConnectionFactory();
		PreparedStatement ps = null;
		int flage;
		try {
			ps = conn.prepareStatement("insert into t_user values(?,?,?)");
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setInt(3, user.getStatus());
			flage = ps.executeUpdate();
			if (flage != 0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	
	//医生
	/**
	 * @ps 用于查询医生用户，用于登录
	 *
	 * */
	public boolean getdoctorLogin(User user) {// 查询医生用户，用于登录
		Connection conn = ConnectionFactory.getConnectionFactory();
		PreparedStatement ps = null;
		ResultSet set;
		User user1 = null;
		try {
			ps = conn.prepareStatement("select * from t_yisheng where username=? and password=?");
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			set = ps.executeQuery();
			while (set.next()) {
				user1 = new User(set.getString("username"), set.getString("password"));
				if (user1 != null) {
					return true;
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	/**
	 * @ps 用于查询医生用户，用于注册
	 *
	 * */
	public User getdoctor(User user) {// 查询医生用户，用于登录
		Connection conn = ConnectionFactory.getConnectionFactory();
		PreparedStatement ps = null;
		ResultSet set;
		User user1 = null;
		try {
			ps = conn.prepareStatement("select * from t_yisheng where username=? and password=?");
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			set = ps.executeQuery();
			while (set.next()) {
				user1 = new User(set.getString("username"), set.getString("password"));
				return user1;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
	//管理员
	/**
	 * @ps 用于查询管理员用户，用于登录
	 *
	 * */
	public boolean getadminLogin(User user) {// 查询管理员用户，用于登录
		Connection conn = ConnectionFactory.getConnectionFactory();
		PreparedStatement ps = null;
		ResultSet set;
		User user1 = null;
		try {
			ps = conn.prepareStatement("select * from t_admin where username=? and password=?");
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			set = ps.executeQuery();
			while (set.next()) {
				user1 = new User(set.getString("username"), set.getString("password"));
				if (user1 != null) {
					return true;
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	/**
	 * @ps 用于查询管理员用户，用于注册
	 *
	 * */
	public t_admin getadmin(t_admin t_admin) {// 查询管路员用户，用于登录
		Connection conn = ConnectionFactory.getConnectionFactory();
		PreparedStatement ps = null;
		ResultSet set;
		t_admin user1 = null;
		try {
			ps = conn.prepareStatement("select * from t_admin where username=? and userpassword=?");
			ps.setString(1, t_admin.getUserName());
			ps.setString(2, t_admin.getUserPassword());
			set = ps.executeQuery();
			while (set.next()) {
				user1 = new t_admin(set.getString("username"), set.getString("userpassword"));
				return user1;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	//所有用户
	/**
	 * @ps 用于获取所有用户
	 *
	 * */
	public List<t_user> getAllUser() {// 获取数据库内所有的用户信息

		Connection conn = ConnectionFactory.getConnectionFactory();
		PreparedStatement ps = null;
		ResultSet set;
		List<t_user> alList = new ArrayList<t_user>();
		t_user t_user1 = null;
		try {
			ps = conn.prepareStatement("select * from t_user");
			set = ps.executeQuery();
			while (set.next()) {
				t_user1 = new t_user(set.getString("user_name"), set.getString("user_password"), set.getString("user_type"), set.getString("user_realname"), set.getString("user_address"),set.getShort("uset_tel"));
				alList.add(t_user1);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return alList;
	}
	//访问人数
	/**
	 * @ps 用于查询访问人数
	 *
<<<<<<< HEAD
	 * */
//	public int getcount() {// 查询网站访问人数
//		Connection conn = ConnectionFactory.getConnectionFactory();
//		PreparedStatement ps = null;
//		ResultSet set;
//		int count = 0;
//		try {
//			ps = conn.prepareStatement("select * from counts");
//			set = ps.executeQuery();
//			while (set.next()) {
//				count = set.getInt(1);
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return count;
//	}
//	//跟新访问人数
//	/**
//	 * @ps 用于更新访问人数
//	 *
//	 * */
//	 * */
//	public int getcount() {// 查询网站访问人数
//		Connection conn = ConnectionFactory.getConnectionFactory();
//		PreparedStatement ps = null;
//		ResultSet set;
//		int count = 0;
//		try {
//			ps = conn.prepareStatement("select * from counts");
//			set = ps.executeQuery();
//			while (set.next()) {
//				count = set.getInt(1);
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return count;
//	}
	//跟新访问人数
	/**
	 * @ps 用于更新访问人数
	 *
	 * */

//	public void updatecount( int count) {//更改访问人数
//		Connection conn = ConnectionFactory.getConnectionFactory();
//		PreparedStatement ps = null;
//		try {
//			ps=conn.prepareStatement("update counts set count=?");
//			ps.setInt(1, count);
//			ps.execute();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}
