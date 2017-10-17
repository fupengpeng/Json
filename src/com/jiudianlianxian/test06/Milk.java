package com.jiudianlianxian.test06;

import java.util.List;

public class Milk {
	private String name;
	private String brand;
	private String type;
	private User user;
	
	private String[] colour;
	
	private List<User> users;
	
	
	
	
	
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public String[] getColour() {
		return colour;
	}
	public void setColour(String[] colour) {
		this.colour = colour;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

}
