package com.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.StudentService;
import com.service.impl.StudentServiceImpl;


@WebServlet("/DelStudentByStudentIdServlet")
public class DelStudentByStudentIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("student_id");
		if(id != null) {
			int student_id = Integer.parseInt(id);
			StudentService stu = new StudentServiceImpl();
			try {
				if(stu.delStudent(student_id) == 1) {
					//request.getRequestDispatcher("/web/AllStudentsShow.jsp");
					response.sendRedirect("/web_test1/GetAllStudents");
				}else {
					request.getRequestDispatcher("/web/error.jsp");
				}
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			
		} 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
