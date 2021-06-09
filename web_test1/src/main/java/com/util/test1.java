package com.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

//import com.util.BaseDao;

public class test1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		BaseDao dao = new BaseDao();
//		String sql = "UPDATE joke SET joketext = ? WHERE id = ?";
//		Object[] obj = {"got iiieet",5};
//		int result = dao.modifyDate(sql,obj);
//		System.out.println(result);
		BaseDao dao = new BaseDao();
		String sql = "SELECT * FROM user ";
		Object[] obj = {};
		ResultSet result = dao.getData(sql, obj);
		System.out.println(sql);
		try {
			while(result.next()) {
				try {
					//System.out.println(result.getInt(1) + "*******" + result.getString(2) );
					System.out.println(result.getString(2));
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
//		if(result>0) {
//			System.out.println("修改成功");
//			System.out.println(result);
//		}else {
//			System.out.println("修改失败");
//		}
//		
	}
}
