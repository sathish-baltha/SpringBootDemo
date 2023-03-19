package com.capgemini.in.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {

	@Id
	private String id;
	private String name;
	private String mobileName;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public Customer(String id, String name, String mobileName) {
		super();
		this.id = id;
		this.name = name;
		this.mobileName = mobileName;
	}
	public Customer() {
		super();
	}
	
}
