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

@WebServlet("/AddStudentInfoServlet")
public class AddStudentInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String student_id = request.getParameter("student_id");
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		String chinese = request.getParameter("chinese");
		String math = request.getParameter("math");
		String english = request.getParameter("english");
		Student student = new Student();
		student.setStudent_id(Integer.parseInt(student_id));
		student.setName(name);
		student.setSex(sex);
		student.setChinese(Integer.parseInt(chinese));
		student.setMath(Integer.parseInt(math));
		student.setEnglish(Integer.parseInt(english));
		StudentService ss = new StudentServiceImpl();
		try {
			if(ss.addStudente(student)!=0){
				response.sendRedirect("/web_test1/GetAllStudents");
			}else {
				response.sendRedirect("/web_test1/web/error.jsp");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
