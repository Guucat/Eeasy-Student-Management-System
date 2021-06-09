package com.entity;

public class Student {
	private int id;
	private int student_id;
	private String name;
	private String sex;
	private int chinese;
	private int math;
	private int english;
	
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getChinese() {
		return chinese;
	}
	public void setChinese(int chinese) {
		this.chinese = chinese;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", student_id=" + student_id + ", name=" + name + ", sex=" + sex + ", chinese="
				+ chinese + ", math=" + math + ", english=" + english + "]";
	}

	
	
}
