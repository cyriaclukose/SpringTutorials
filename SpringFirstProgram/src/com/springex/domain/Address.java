package com.springex.domain;

import java.io.Serializable;

public class Address implements Serializable {
	
	private String street;
	private String zipcode;
	private String state;
	
	public Address()
	{
		System.out.println("Address instance created");
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", zipcode=" + zipcode + ", state=" + state + "]";
	}
	
	
	
	

}
