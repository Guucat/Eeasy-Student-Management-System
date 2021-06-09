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

@WebServlet("/GetRankBySexServlet")
public class GetRankBySexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentService ss = new StudentServiceImpl();
		try {
			String fm = request.getParameter("sex");
			if(fm.equals("male")) {
				String sex = "ÄÐ";
				List<Student> list =  ss.getRankBySex(sex);
				request.setAttribute("StudentBySexList", list);
			}else {
				String sex = "Å®";
				List<Student> list =  ss.getRankBySex(sex);
				request.setAttribute("StudentBySexList", list);
			}
			request.getRequestDispatcher("/web/ShowStudentBySex.jsp").forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}
