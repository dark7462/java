package com.dark.RelationsHibernate;

import jakarta.persistence.*;

@Entity
public class AppObj {
	
	private int id;
	private String name;
	public AppObj() {
		
	}
	public AppObj(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Id
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
	@Override
	public String toString() {
		return "AppObj [id=" + id + ", name=" + name + "]";
	}
}
