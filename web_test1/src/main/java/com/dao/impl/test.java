package com.dao.impl;

import java.sql.SQLException;

import com.dao.UserDao;

public class test {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
	UserDao dao = new UserDaoImpl();
	Boolean flag = dao.login("a", "2");
	System.out.print(flag);
	}
}
