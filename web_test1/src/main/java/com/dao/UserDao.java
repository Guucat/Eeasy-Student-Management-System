package com.dao;

import java.sql.SQLException;

public interface UserDao {
	/**
	 * 
	 * @param user ”√ªß√˚
	 * @param pwd √‹¬Î
	 * @return
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public boolean login(String user,String pwd) throws ClassNotFoundException, SQLException;
}
