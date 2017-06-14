package com.km.loginandregister.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public static Connection getConnectionFactory(){
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://192.168.1.110:3306/registration","root","kemeng1993");

//			connection=DriverManager.getConnection("jdbc:mysql://192.168.1.110:3306/registration","root","kemeng1993");
			System.out.println("成功连接");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return connection;
	}
}
