package com.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
	
	public int modifyDate(String sql,Object[] obj) throws ClassNotFoundException, SQLException {
		int result = 0;
		Connection conn = ConnUtil.getConn();
		PreparedStatement ps = conn.prepareStatement(sql);
		for(int i=0; i<obj.length ; i++) {
			ps.setObject(i+1, obj[i]);
		}
		result = ps.executeUpdate();
		return result;
	}
	
	public ResultSet getData(String sql,Object[] obj) throws ClassNotFoundException, SQLException {
		Connection conn = ConnUtil.getConn();
		ResultSet result = null;
		PreparedStatement ps = conn.prepareStatement(sql);
		for(int i=0; i<obj.length;i++) {
			ps.setObject(i+1, obj[i]);
		}
		result = ps.executeQuery();
		return result;
	}
}


