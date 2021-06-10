package com.dao;

import java.sql.SQLException;

import com.entity.User;

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
	
	public int addUser(User user) throws ClassNotFoundException, SQLException;
}
