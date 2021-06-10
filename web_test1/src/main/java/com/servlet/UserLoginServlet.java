package com.servlet;

import java.io.IOException;
import java.sql.SQLException;

import com.service.UserService;
import com.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class UserLoginServlet extends HttpServlet{

	/**
	 * 生成默认序列化ID
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String user = request.getParameter("user");
			String pwd = request.getParameter("pwd");
			//String submit = request.getParameter("submit");
			//System.out.println(submit);
			UserService us = new UserServiceImpl();
			try {
				//System.out.println(us.login(user, pwd));
				if(us.login(user, pwd)) {
					//System.out.println(us.login(user, pwd));
					request.getSession().setAttribute("user", user);
					//request.getRequestDispatcher("/web/LoginSuccess.jsp").forward(request, response);
					//request.getRequestDispatcher("/GetAllStudents").forward(request, response);
					response.sendRedirect("/web_test1/GetAllStudents");
				}else {
					System.out.println(us.login(user, pwd));
					request.getRequestDispatcher("/web/LoginFail.jsp").forward(request, response);
				}
			} catch (ClassNotFoundException | SQLException | ServletException | IOException e) {
				e.printStackTrace();
			}
	}
}
