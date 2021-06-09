package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.dao.UserDao;
import com.util.BaseDao;

public class UserDaoImpl extends BaseDao implements UserDao {

	@Override
	public boolean login(String user, String pwd) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM user WHERE user_name = ? ";
		ResultSet rs = this.getData(sql,new Object[] {user});
		if(rs.next()) {
			String r_pwd = rs.getString(2);
			if(r_pwd.equals(pwd)) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}

		
	}
}
	


//	public boolean login(String user, String pwd) throws SQLException {
//		boolean flag = false;
//		BaseDao dao = new BaseDao();
//		String sql = "SELECT * FROM user WHERE user_name = ?";
//		Object[] obj = {user};
//		
//		ResultSet result = dao.getData(sql, obj);
////		String r_pwd =  result.getString(1);
//		try {
//			while(result.next()) {
//				try {
//					//System.out.println(result.getInt(1) + "*******" + result.getString(2) );
//					String r_pwd = result.getString(2);
//					if(r_pwd == user) {
//						flag = true;
//					}else {
//						flag = false;
//					}
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	return flag;
//	}
//}
