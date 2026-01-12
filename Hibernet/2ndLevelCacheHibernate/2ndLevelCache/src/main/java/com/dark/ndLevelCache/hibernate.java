package com.dark.ndLevelCache;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class hibernate{
	
	private int id;
	private String name;
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
		return "hibernate [id=" + id + ", name=" + name + "]";
	}
	
}
