package com.dao;

import java.sql.SQLException;

public interface UserDao {
	/**
	 * 
	 * @param user �û���
	 * @param pwd ����
	 * @return
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public boolean login(String user,String pwd) throws ClassNotFoundException, SQLException;
}
