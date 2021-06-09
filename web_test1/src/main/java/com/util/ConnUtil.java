package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;

//使用JDBC方式连接数据库
public class ConnUtil {
	public static Connection getConn() throws ClassNotFoundException, SQLException {
		Connection conn = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stu", "stu", "123456");
		return conn;
	}
}
//	public static void main(String[] args) {
//		try {
//			//先以反射的方式加载驱动
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			//获取连接对象
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ijdb", "ijdbuser", "password");
//			//1.通过连接对象获取操作数据库的对象statement
//			Statement statement = conn.createStatement(); 
//			//2.预编译
//			//String sql = "SELECT * FROM joke WHERE id = ? AND text = ?"
////			PreparedStatement ps = conn.prepareStatement(sql);
////			ps.setInt(1, 5);
////			ps.setString(2,"Hello");
////			ResultSet rs = ps.executeQuery();
//			
//			
//			//编写SQL语句
//			//String sql = "SELECT joketext FROM joke WHERE id=1";
//			String sql = "SELECT * FROM joke";
//			//通过定义好的报表对象来执行SQL语句
//			ResultSet rs = statement.executeQuery(sql);
//			//遍历循环取出数据
//			while(rs.next()){
//				System.out.println(rs.getString("joketext"));
//			}
//		}catch(ClassNotFoundException e) {
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}	
//}
//}
