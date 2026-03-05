package com.dark.model;

public class Student {
	private int aid;
	private String aname;
	
	public Student(int aid, String aname) {
		super();
		this.aid = aid;
		this.aname = aname;
	}
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	
	@Override
	public String toString() {
		return "Student [aid=" + aid + ", aname=" + aname + "]";
	}
}
