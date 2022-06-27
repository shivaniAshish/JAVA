package com.iq.student.client;

import com.google.protobuf.TextFormat.ParseException;
import com.iq.student.Student;
import com.iq.student.dao.impl.StudentDaoImpl;

public class StudentClient {
	public static void main(String[] args) throws ParseException {
		Student student = new Student(101, "sam", "MBA", 350000.00);
		StudentDaoImpl daoImpl=new StudentDaoImpl();
		daoImpl.save(student);
//		List<Student> list=daoImpl.getAllStudent();
//		for (Student student2 : list) {
//			System.out.println(student2);
//		}
//		daoImpl.delete(1006);
		
//		Student student=daoImpl.getById(1009);
//		System.out.println(student);
		
//		Student student=daoImpl.getByName("sony");
//		System.out.println(student);
		
		
	}

}
