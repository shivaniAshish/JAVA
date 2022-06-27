package com.iq.student;

public class Student {
	private int std_id;
	private String std_name,std_course;
	private double fee;
	public Student(int std_id, String std_name, String std_course, double fee) {
		super();
		this.std_id = std_id;
		this.std_name = std_name;
		this.std_course = std_course;
		this.fee = fee;
	}
	public Student() {
		
	}
	public int getStd_id() {
		return std_id;
	}
	public void setStd_id(int id) {
		this.std_id = id;
	}
	public String getStd_name() {
		return std_name;
	}
	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}
	public String getStd_course() {
		return std_course;
	}
	public void setStd_course(String std_course) {
		this.std_course = std_course;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	
	

}
