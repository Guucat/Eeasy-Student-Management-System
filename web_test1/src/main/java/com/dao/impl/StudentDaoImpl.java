 package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.StudentDao;
import com.entity.Student;
import com.util.BaseDao;

public class StudentDaoImpl  extends BaseDao implements StudentDao{

	@Override
	public List<Student> getAllStudent() throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM student";
		ResultSet rs = this.getData(sql,new Object[] {});
		List<Student> list = new ArrayList<Student>();
		while(rs.next()) {
			Student s = new Student();
			s.setStudent_id(rs.getInt(2));
			s.setName(rs.getString(3));
			s.setSex(rs.getString(4));
			s.setChinese(rs.getInt(5));
			s.setMath(rs.getInt(6));
			s.setEnglish(rs.getInt(7));
			list.add(s);
		}
		return list;
	}

	@Override
	public int UpdateStudentInfoDao(Student student) throws ClassNotFoundException, SQLException {
		String sql = "UPDATE student SET student_id = ?, name = ?, sex = ?, chinese = ?, math = ?, english = ? WHERE student_id = ?";
		int rs = this.modifyDate(sql, new Object[] { student.getStudent_id(), student.getName(), student.getSex(), student.getChinese(), student.getMath(), student.getEnglish(), student.getStudent_id()});
		return rs;
	}

	@Override
	public Student getOneStudent(int student_id) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM student WHERE student_id = ?";
		ResultSet rs = this.getData(sql, new Object[] {student_id});
		Student stu = new Student();
		while(rs.next()) {
			stu.setStudent_id(rs.getInt(2));
			stu.setName(rs.getString(3));
			stu.setSex(rs.getString(4));
			stu.setChinese(rs.getInt(5));
			stu.setMath(rs.getInt(6));
			stu.setEnglish(rs.getInt(7));
		}
		return stu;
	}

	@Override
	public int delStudent(int student_id) throws ClassNotFoundException, SQLException {
		String sql = "DELETE FROM student WHERE student_id = ?";
		int num = this.modifyDate(sql, new Object[] {student_id});
		return num;
	}

	@Override
	public int addStudente(Student student) throws ClassNotFoundException, SQLException {
		String sql = "INSERT INTO student (student_id,name,sex,chinese,math,english) values (?,?,?,?,?,?)";
		int num = this.modifyDate(sql, new Object[] {student.getStudent_id(),student.getName(),student.getSex(),student.getChinese(),student.getMath(),student.getEnglish()});
		return num;
	}

	@Override
	public List<Student> getRankBySex(String sex) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM student WHERE sex=? ORDER BY (chinese + math + english) DESC;";
		ResultSet rs = this.getData(sql, new Object[] {sex});
		List<Student> list = new ArrayList<Student>();
		while(rs.next()) {
			Student stu = new Student();
			stu.setStudent_id(rs.getInt(2));
			stu.setName(rs.getString(3));
			stu.setSex(rs.getString(4));
			stu.setChinese(rs.getInt(5));
			stu.setMath(rs.getInt(6));
			stu.setEnglish(rs.getInt(7));
			list.add(stu);
		}
		return list;
		
	}

	@Override
	public List<Student> getRankBySubject(String subject) throws ClassNotFoundException, SQLException {
		String sql_math = "SELECT * FROM student ORDER BY math DESC";
		String sql_chinese = "SELECT * FROM student ORDER BY chinese DESC";
		String sql_english = "SELECT * FROM student ORDER BY english DESC";
		ResultSet rs = null;
		if(subject.equals("chinese")) {  rs = this.getData(sql_chinese,new Object[] {});}
		if(subject.equals("english")) {  rs = this.getData(sql_english,new Object[] {});}
		if(subject.equals("math")) {  rs = this.getData(sql_math,new Object[] {});}
		//System.out.println(subject);
		List<Student> list = new ArrayList<Student>();
		while(rs.next()) {
			Student s = new Student();
			s.setStudent_id(rs.getInt(2));
			s.setName(rs.getString(3));
			s.setSex(rs.getString(4));
			s.setChinese(rs.getInt(5));
			s.setMath(rs.getInt(6));
			s.setEnglish(rs.getInt(7));
			list.add(s);
		}
		return list;
	}


	
}
