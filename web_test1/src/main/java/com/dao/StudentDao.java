package com.dao;
import java.sql.SQLException;
import java.util.List;

import com.entity.Student;

public interface StudentDao {
	public List<Student> getAllStudent() throws ClassNotFoundException, SQLException; 
	
	public int UpdateStudentInfoDao(Student student) throws ClassNotFoundException, SQLException;
	
	public Student getOneStudent(int student_id) throws ClassNotFoundException, SQLException;
	
	public int delStudent(int student_id) throws ClassNotFoundException, SQLException;
	
	public int addStudente(Student student) throws ClassNotFoundException, SQLException;
	
	public List<Student >getRankBySex(String sex) throws ClassNotFoundException, SQLException;
	
	public List<Student >getRankBySubject(String subject) throws ClassNotFoundException, SQLException;
	
	
}
