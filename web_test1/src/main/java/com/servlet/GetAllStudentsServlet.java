package com.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.entity.Student;
import com.service.StudentService;
import com.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/GetAllStudents")
public class GetAllStudentsServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentService ss = new StudentServiceImpl();
		try {
			List<Student> list = ss.getAllStudent();
			request.setAttribute("StudentList", list);
			request.getRequestDispatcher("/web/AllStudentsShow.jsp").forward(request, response);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
	
}
	
	
	
