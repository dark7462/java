package com.dark.DemoRest;

import java.util.ArrayList;
import java.util.List;

public class studentRepository {
	private static List<student> stu;
	
	public studentRepository() {
		stu = new ArrayList<student>();
		student s1 = new student(101,"anurag");
		student s2 = new student(102,"piyush");
		
		stu.add(s1);
		stu.add(s2);
		
	}
	public static List <student> getStudentRepository() {
		return stu;
	}
	public student getStudent(int id) {
		for(student s : stu) {
			if(s.getId() == id) return s;
		}
		return null;
	}
	
}
