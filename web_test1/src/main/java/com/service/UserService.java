package com.service;

import java.sql.SQLException;

import com.entity.User;

public interface UserService {
	public boolean login(String user,String pwd) throws SQLException, ClassNotFoundException;
	
	public int addUser(User user) throws ClassNotFoundException, SQLException;
}
