package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;

//ʹ��JDBC��ʽ�������ݿ�
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
//			//���Է���ķ�ʽ��������
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			//��ȡ���Ӷ���
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ijdb", "ijdbuser", "password");
//			//1.ͨ�����Ӷ����ȡ�������ݿ�Ķ���statement
//			Statement statement = conn.createStatement(); 
//			//2.Ԥ����
//			//String sql = "SELECT * FROM joke WHERE id = ? AND text = ?"
////			PreparedStatement ps = conn.prepareStatement(sql);
////			ps.setInt(1, 5);
////			ps.setString(2,"Hello");
////			ResultSet rs = ps.executeQuery();
//			
//			
//			//��дSQL���
//			//String sql = "SELECT joketext FROM joke WHERE id=1";
//			String sql = "SELECT * FROM joke";
//			//ͨ������õı���������ִ��SQL���
//			ResultSet rs = statement.executeQuery(sql);
//			//����ѭ��ȡ������
//			while(rs.next()){
//				System.out.println(rs.getString("joketext"));
//			}
//		}catch(ClassNotFoundException e) {
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}	
//}
//}