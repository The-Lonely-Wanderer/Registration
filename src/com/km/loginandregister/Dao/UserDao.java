package com.km.loginandregister.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.PseudoColumnUsage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.km.loginandregister.util.ConnectionFactory;
import com.km.pojo.t_admin;
import com.km.pojo.t_gonggao;
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
	public t_user getpatientLogin(User user) {// 查询患者用户，用于登录
		Connection conn = ConnectionFactory.getConnectionFactory();
		PreparedStatement ps = null;
		ResultSet set;
		t_user user1 = null;
		try {
			ps = conn.prepareStatement("select * from t_user where user_name=? and user_password=?");
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			set = ps.executeQuery();
			while (set.next()) {
				user1 = new t_user(set.getString("user_name"), set.getString("user_password"));
				if (user1 != null) {
					return user1;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
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
				t_yisheng = new t_yisheng(set.getInt("yisheng_id"), set.getString("yisheng_name"),
						set.getString("yisheng_sex"), set.getString("yisheng_age"), set.getString("yisheng_pw"),
						set.getString("yisheng_zhicheng"), set.getInt("keshi_id"));
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
	 * 用于增加医生用户
	 */
	public List<t_yisheng> insertDoator(t_yisheng t_yisheng) {

		Connection conn = ConnectionFactory.getConnectionFactory();
		PreparedStatement ps;
		t_yisheng t_yisheng1 = new t_yisheng();
		List<t_yisheng> yishenglist=new ArrayList<t_yisheng>();
		int flage;
		try {
			ps = conn.prepareStatement("insert t_yisheng value(0,?,?,?,?,?,?,0)");
			ps.setString(1, t_yisheng.getYisheng_name());
			ps.setString(2, t_yisheng.getYisheng_sex());
			ps.setString(3, t_yisheng.getYisheng_age());
			ps.setString(4, t_yisheng.getYisheng_password());
			ps.setString(5, t_yisheng.getYisheng_zhicheng());
			ps.setInt(6, t_yisheng.getKeshi_id());
			flage = ps.executeUpdate();
			if (flage == 1) {
				yishenglist=getAlldoctorUser();
				return yishenglist;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @ps 增加管理员用户
	 */
	public List<t_admin> insertAdmin(t_admin t_admin) {

		Connection conn = ConnectionFactory.getConnectionFactory();
		PreparedStatement ps;
		List<t_admin> adminlist = null;
		int flage;
		try {
			ps = conn.prepareStatement("insert t_admin value(0,?,?)");
			ps.setString(1, t_admin.getUserName());
			ps.setString(2, t_admin.getUserPassword());
			flage=ps.executeUpdate();
			if(flage==1){
				adminlist=getAlladmin();
				return adminlist;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @ps 用于查询医生用户
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
		System.out.println("agx  :  " + xgxi);
		try {
			ps = connection.prepareStatement(
					"update t_yisheng  set   yisheng_age=?,  yisheng_sex=?,  yisheng_pw=? where yisheng_name=?");
			ps.setString(1, xgxi.getYisheng_age());
			ps.setString(2, xgxi.getYisheng_sex());
			ps.setString(3, xgxi.getYisheng_password());
			ps.setString(4, xgxi.getYisheng_name());
			int aa = ps.executeUpdate();

			if (aa == 1) {

				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

	/**
	 * @ps 用于修改管理员信息,返回boolean
	 */
	public boolean getupdateAdmin(t_admin t_admin) {
		Connection conn = ConnectionFactory.getConnectionFactory();
		PreparedStatement ps;
		int flage = 0;

		try {
			ps = conn.prepareStatement("update t_admin set userName=? and userPassword=? where userId=? ");
			ps.setString(1, t_admin.getUserName());
			ps.setString(2, t_admin.getUserPassword());
			ps.setInt(3, t_admin.getUser_id());
			flage = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (flage == 1) {
			return true;
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
	 * @ps 用于查询管理员用户
	 *
	 */
	public t_admin getadmin(t_admin t_admin) {// 查询管路员用户，用于登录
		Connection conn = ConnectionFactory.getConnectionFactory();
		PreparedStatement ps = null;
		ResultSet set;
		t_admin user1 = new t_admin();
		try {
			ps = conn.prepareStatement("select * from t_admin where username=? and userpassword=?");
			ps.setString(1, t_admin.getUserName());
			ps.setString(2, t_admin.getUserPassword());
			set = ps.executeQuery();
			while (set.next()) {
				user1 = new t_admin(set.getInt("userId"), set.getString("userName"), set.getString("userPassword"));
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

			}
			return doctorlList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @ps 用于获取所有管理员用户 ，返回所有管理员用户的集合
	 */
	public List<t_admin> getAlladmin() {

		Connection connection = ConnectionFactory.getConnectionFactory();
		PreparedStatement ps;
		ResultSet set;
		t_admin t_admin;
		List<t_admin> adminlist = new ArrayList<t_admin>();
		try {
			ps = connection.prepareStatement("select * from t_admin");
			set = ps.executeQuery();
			while (set.next()) {
				t_admin = new t_admin(set.getInt("userId"), set.getString("userName"), set.getString("userPassword"));
				adminlist.add(t_admin);
			}
			return adminlist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @ps 返回所有公告的boolean
	 */
	public boolean addNews(t_gonggao t_gonggao) {
		Connection conn = ConnectionFactory.getConnectionFactory();
		PreparedStatement ps;
		int set;
		try {
			ps = conn.prepareStatement("insert t_gonggao value(0,?,?,?)");
			ps.setString(1, t_gonggao.getGonggao_title());
			ps.setString(2, t_gonggao.getGonggao_content());
			ps.setString(3, t_gonggao.getGonggao_data());
			set = ps.executeUpdate();
			if (set == 1) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * 
	 * @return 查询所有的公告
	 */

	public List<t_gonggao> geT_gonggaos() {
		Connection conn = ConnectionFactory.getConnectionFactory();
		PreparedStatement ps;
		ResultSet set = null;
		List<t_gonggao> t_gonggaoslist = new ArrayList<t_gonggao>();
		t_gonggao t_gonggao;
		try {
			ps = conn.prepareStatement("select * from t_gonggao");
			set = ps.executeQuery();
			while (set.next()) {
				t_gonggao = new t_gonggao(set.getInt("gonggao_id"), set.getString("gonggao_title"),
						set.getString("gonggao_content"), set.getString("gonggao_data"));
				t_gonggaoslist.add(t_gonggao);
			}
			return t_gonggaoslist;

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
	public List<t_yuyue> getYuyue(t_yuyue yuyue) {
		Connection connection = ConnectionFactory.getConnectionFactory();
		PreparedStatement ps = null;
		List<t_yuyue> list = new ArrayList<>();
		ResultSet rs = null;

		try {
			ps = connection.prepareStatement(
					"SELECT ty.* ,tu.user_name  FROM t_yuyue  ty LEFT JOIN t_user tu on ty.userid = tu.user_id where ty.yishengid = ? ");
			ps.setInt(1, yuyue.getYuyue_yishengId());
			rs = ps.executeQuery();
			while (rs.next()) {
				yuyue = new t_yuyue(rs.getString("user_name"), rs.getString("shijian"), rs.getString("beizhu"),
						rs.getInt("id"));
				list.add(yuyue);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
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

	/**
	 * 
	 * @param 传入删除的医生对应的id
	 * @return 返回删除后的所有医生的集合,删除失败返回null
	 */
	public List<t_admin> deleteAdmin(int id) {
		// TODO Auto-generated method stub
		Connection conn = ConnectionFactory.getConnectionFactory();
		PreparedStatement ps;
		List<t_admin> adminlList = new ArrayList<t_admin>();
		int i;
		try {
			ps = conn.prepareStatement("delete from t_admin where userId=?");
			ps.setInt(1, id);
			i = ps.executeUpdate();
			if (i == 1) {
				adminlList = getAlladmin();
				return adminlList;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @ps 用于删除公告,返回boolean
	 */
	public boolean Admin_deletenews(int id) {

		Connection conn = ConnectionFactory.getConnectionFactory();
		PreparedStatement ps;
		int flage;
		try {
			ps=conn.prepareStatement("delete from t_gonggao where gonggao_id=?");
			ps.setInt(1,id);
			flage=ps.executeUpdate();
			if(flage==1){
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}

















