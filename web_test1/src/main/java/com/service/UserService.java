package com.service;

import java.sql.SQLException;

public interface UserService {
	public boolean login(String user,String pwd) throws SQLException, ClassNotFoundException;
}
