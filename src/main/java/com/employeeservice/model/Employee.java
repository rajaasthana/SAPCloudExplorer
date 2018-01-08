package com.employeeservice.model;

/**
 * Model class to bind the data to view/controller
 * 
 * @author Raja Asthana
 * @since Dec-2017
 */
public class Employee {
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
}
