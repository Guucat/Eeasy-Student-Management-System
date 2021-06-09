package com.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Student;
import com.service.StudentService;
import com.service.impl.StudentServiceImpl;

@WebServlet("/getOneStudent")
public class getOneStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentService ss = new StudentServiceImpl();
		try {
			String id = request.getParameter("student_id");	
			if(id != null) {
				int student_id = Integer.parseInt(id);	
				Student stu = ss.getOneStudent(student_id);
				request.setAttribute("student", stu);
				request.getRequestDispatcher("/web/ShowOneStudent.jsp").forward(request, response);
 		}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
}
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
