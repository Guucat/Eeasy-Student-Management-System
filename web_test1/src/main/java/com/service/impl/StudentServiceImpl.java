package com.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.dao.StudentDao;
import com.dao.impl.StudentDaoImpl;
import com.entity.Student;
import com.service.StudentService;

public class StudentServiceImpl implements StudentService{

	StudentDao studao = new StudentDaoImpl();
	@Override
	public List<Student> getAllStudent() throws ClassNotFoundException, SQLException{
		return studao.getAllStudent();
	}
	
	@Override
	public int UpdateStudentInfoDao(Student student) throws ClassNotFoundException, SQLException {
		return studao.UpdateStudentInfoDao(student);
	}

	@Override
	public Student getOneStudent(int student_id) throws ClassNotFoundException, SQLException {
		return studao.getOneStudent(student_id);
	}

	@Override
	public int delStudent(int student_id) throws ClassNotFoundException, SQLException {
		return studao.delStudent(student_id);
	}

	@Override
	public int addStudente(Student student) throws ClassNotFoundException, SQLException {
		return studao.addStudente(student);
	}

	@Override
	public List<Student> getRankBySex(String sex) throws ClassNotFoundException, SQLException {
		return studao.getRankBySex(sex);
	}

	@Override
	public List<Student> getRankBySubject(String subject) throws ClassNotFoundException, SQLException {
		return studao.getRankBySubject(subject);
	}


}
