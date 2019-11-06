package com.springex.domain;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private String id;
	
	private String name;
	
	private Address address;
	
	public Employee() {
		
		System.out.println("object intialized");
	}
	public Employee(Address adress) {
		System.out.println("constructor injection");
	this.address=adress;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	
}
