package com.dark.RelationsHibernate;

import jakarta.persistence.*;

@Entity
public class Student {
	@Id
	private int rollon;
	private String name;
	private int marks;
	@OneToOne   // will make the relations automatically either a forgien key or a mapping table according to type of relation
	// can use mappedby("tablename") to get it mapped to avoid extra table
	private Laptop laptop;
	
	public Student(int rollon, String name, int marks, Laptop laptop) {
		super();
		this.rollon = rollon;
		this.name = name;
		this.marks = marks;
		this.laptop = laptop;
	}
	public int getRollon() {
		return rollon;
	}
	public void setRollon(int rollon) {
		this.rollon = rollon;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollon=" + rollon + ", name=" + name + ", marks=" + marks + "]";
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
}
