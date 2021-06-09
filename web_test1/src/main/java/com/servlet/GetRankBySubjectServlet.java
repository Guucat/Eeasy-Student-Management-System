package com.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Student;
import com.service.StudentService;
import com.service.impl.StudentServiceImpl;

@WebServlet("/GetRankBySubjectServlet")
public class GetRankBySubjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentService ss = new StudentServiceImpl();
		try {
			String subject = request.getParameter("subject");
			if(subject.equals("chinese")) {
				List<Student> list =  ss.getRankBySubject(subject);
				request.setAttribute("StudentBySubjectList", list);
				request.getRequestDispatcher("/web/ShowStudentByChinese.jsp").forward(request, response);
			}else if(subject.equals("math")){
				List<Student> list =  ss.getRankBySubject(subject);
				request.setAttribute("StudentBySubjectList", list);
				request.getRequestDispatcher("/web/ShowStudentByMath.jsp").forward(request, response);
			}else if(subject.equals("english")){
				List<Student> list =  ss.getRankBySubject(subject);
				request.setAttribute("StudentBySubjectList", list);
				request.getRequestDispatcher("/web/ShowStudentByEnglish.jsp").forward(request, response);
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
