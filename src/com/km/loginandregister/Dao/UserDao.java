package com.km.loginandregister.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.km.loginandregister.util.ConnectionFactory;
import com.km.pojo.t_admin;

import com.km.pojo.t_yisheng;
import com.km.pojo.t_yuyue;
import com.km.pojo.t_user;
import com.km.registeandlogin.vo.User;

public class UserDao {

	// 患者
	/**
	 * @ps 用于查询患者用户，用于登录
	 *
	 */
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
				user1 = new User(set.getString("user_name"), set.getString("user_password"));
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
	 */

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

	// 医生
	/**
	 * @ps 用于查询医生用户，用于登录
	 *
	 */
	public t_yisheng getdoctorLogin(t_yisheng user) {// 查询医生用户，用于登录
		Connection conn = ConnectionFactory.getConnectionFactory();
		PreparedStatement ps = null;
		ResultSet set;
		t_yisheng t_yisheng = null;
		try {
			ps = conn.prepareStatement("select * from t_yisheng where yisheng_name=? and yisheng_pw=?");
			ps.setString(1, user.getYisheng_name());
			ps.setString(2, user.getYisheng_password());
			set = ps.executeQuery();
			while (set.next()) {
				t_yisheng = new t_yisheng(set.getString("yisheng_name"), set.getString("yisheng_pw"));
				if (t_yisheng != null) {
					return t_yisheng;
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	/**
	 * @ps 用于查询医生用户，用于注册
	 *
	 */
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

	/**
	 * @ps:查看医生信息；
	 */
	public t_yisheng getYishengxinxi(t_yisheng ys) {

		Connection connection = ConnectionFactory.getConnectionFactory();
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			ps = connection.prepareStatement(
					"select yisheng_id ,yisheng_sex, yisheng_age, yisheng_zhicheng,keshi_id  from t_yisheng where yisheng_name =?");
			ps.setString(1, ys.getYisheng_name());
			rs = ps.executeQuery();
			while (rs.next()) {
				ys = new t_yisheng(rs.getInt("yisheng_id"), rs.getString("yisheng_sex"), rs.getString("yisheng_age"),
						rs.getString("yisheng_zhicheng"), rs.getInt("keshi_id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return ys;
	}

	/**
	 * @ps 修改医生信息
	 */
	public boolean getXiugai(t_yisheng xgxi) {
		Connection connection = ConnectionFactory.getConnectionFactory();
		PreparedStatement ps = null;

		try {
			ps = connection.prepareStatement(
					"update t_yisheng  set yisheng_name=?, yisheng_sex=?,yisheng_age=?,yisheng_zhicheng=?,keshi_id=? where yisheng_id =?");
			ps.setString(1, xgxi.getYisheng_name());
			ps.setString(2, xgxi.getYisheng_sex());
			ps.setString(3, xgxi.getYisheng_age());
			ps.setString(4, xgxi.getYisheng_zhicheng());
			ps.setInt(5, xgxi.getKeshi_id());
			ps.setInt(6, xgxi.getYisheng_id());
			int aa = ps.executeUpdate();
			if (aa == 1) {
				System.out.println("aa" + aa);
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

	// 管理员
	/**
	 * @ps 用于查询管理员用户，用于登录
	 *
	 */
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
	 */
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

	// 所有患者用户
	/**
	 * @ps 用于获取所有患者用户
	 *
	 */
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
				t_user1 = new t_user(set.getInt("user_id"), set.getString("user_name"), set.getString("user_password"),
						set.getString("user_type"), set.getString("user_realname"), set.getString("user_address"),
						set.getLong("user_tel"));
				alList.add(t_user1);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return alList;
	}

	/**
	 * @ps 用于获取所有医生用户
	 *
	 */
	public List<t_yisheng> getAlldoctorUser() {// 获取数据库内所有的医生用户信息
		System.out.println("调用getAlldoctorUser");
		Connection conn = ConnectionFactory.getConnectionFactory();
		PreparedStatement ps = null;
		ResultSet set;
		List<t_yisheng> doctorlList = new ArrayList<t_yisheng>();
		t_yisheng t_yisheng;
		try {
			ps = conn.prepareStatement("select * from t_yisheng");
			
			set = ps.executeQuery();
			while (set.next()) {
				t_yisheng = new t_yisheng(set.getInt("yisheng_id"), set.getString("yisheng_name"),
						set.getString("yisheng_pw"), set.getString("yisheng_sex"), set.getString("yisheng_age"),
						set.getString("yisheng_zhicheng"), set.getInt("keshi_id"));
				doctorlList.add(t_yisheng);
				
				System.out.println(t_yisheng);
				return doctorlList;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// 用于医生查询预约的患者；
	/**
	 * @ps 医生查询预约；
	 */
	public List<t_yuyue> getYuyue() {
		Connection connection = ConnectionFactory.getConnectionFactory();
		PreparedStatement ps = null;
		List<t_yuyue> list = new ArrayList<>();
		ResultSet rs = null;
		t_yuyue yuyue = null;

		try {
			ps = connection.prepareStatement("select  *from t_yuyue");
			rs = ps.executeQuery();
			while (rs.next()) {
				yuyue = new t_yuyue(rs.getString("yuyue_userId"), rs.getString("yuyue_yishengId"),
						rs.getString("yuyue_shijian"), rs.getString("yuyue_beizhu"));
				list.add(yuyue);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}
	// 访问人数

	/**
	 * @ps 删除患者
	 */
	public List<t_user> deleteUser(int id) {
		Connection conn = ConnectionFactory.getConnectionFactory();
		PreparedStatement ps;
		List<t_user> alList = new ArrayList<t_user>();
		int i;
		try {
			ps = conn.prepareStatement("delete from t_user where user_id=?");
			ps.setInt(1, id);
			i = ps.executeUpdate();
			if (i == 1) {
				alList = getAllUser();
				return alList;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @ps 删除医生
	 */
	public List<t_yisheng> deleteDoctor(int id) {
		Connection conn = ConnectionFactory.getConnectionFactory();
		PreparedStatement ps;
		List<t_yisheng> alList = new ArrayList<t_yisheng>();
		int i;
		try {
			ps = conn.prepareStatement("delete from t_yisheng where yisheng_id=?");
			ps.setInt(1, id);
			i = ps.executeUpdate();
			if (i == 1) {
				alList = getAlldoctorUser();
				return alList;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// 访问人数
	/**
	 * @ps 用于通过人数
	 *
	 */
	public int getdoctorcount() {// 查询网站访问人数
		Connection conn = ConnectionFactory.getConnectionFactory();
		PreparedStatement ps = null;
		ResultSet set;
		int count = 0;
		try {
			ps = conn.prepareStatement("select * from counts");
			set = ps.executeQuery();
			while (set.next()) {
				count = set.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

	public List<t_admin> deleteAdmin(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
