package com.service.impl;

import java.sql.SQLException;

import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;
import com.entity.User;
import com.service.UserService;

public class UserServiceImpl implements UserService{
	
	private UserDao udao = new UserDaoImpl();
	@Override
	public boolean login(String user, String pwd) throws ClassNotFoundException, SQLException     {
		return udao.login(user, pwd);
	}
	@Override
	public int addUser(User user) throws ClassNotFoundException, SQLException {
		return udao.addUser(user);
	}
	
}
