package com.dark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // we need to mention this component which will make this class available for spring to make a bean
public class Student {
	public int id;
	public String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Student() {}
	
	@Autowired // this will create the object when needed 
	Laptop lap;
	
	public void code() {
		lap.complie();
	}
	
}
