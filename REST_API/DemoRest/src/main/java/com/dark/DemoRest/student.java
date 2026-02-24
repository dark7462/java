package com.dark.DemoRest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class student {
	private int id;
	private String name;
	
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
	public student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public student() {
		super();
	}
	@Override
	public String toString() {
		return ("id : " + this.id + "\nName : " + this.name + "\n");
	}
}
