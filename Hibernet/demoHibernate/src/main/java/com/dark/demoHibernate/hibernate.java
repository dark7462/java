package com.dark.demoHibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity // for making it a entitiy of jpa
// @Entity(name = "Entity_name") can also specifiy the Entity name with the annortations
// @Table(name = "Table_name") can also specifiy the Table name with the annortations
public class hibernate{
	
	private int id;
	private String name;
	
	@Id // on primary is nessary
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
