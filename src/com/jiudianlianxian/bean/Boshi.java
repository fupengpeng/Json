package com.jiudianlianxian.bean;

public class Boshi {

	private String name;
	private String sex;
	private boolean has_girlfriend;
	private double age;
	private Object car;
	private String[] major;
	private String comment;
	public Boshi() {
	}
	
	public Boshi(String name, String sex, boolean has_girlfriend, double age,
			Object car, String[] major, String comment) {
		super();
		this.name = name;
		this.sex = sex;
		this.has_girlfriend = has_girlfriend;
		this.age = age;
		this.car = car;
		this.major = major;
		this.comment = comment;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public boolean isHas_girlfriend() {
		return has_girlfriend;
	}
	public void setHas_girlfriend(boolean has_girlfriend) {
		this.has_girlfriend = has_girlfriend;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public Object getCar() {
		return car;
	}
	public void setCar(Object car) {
		this.car = car;
	}
	public String[] getMajor() {
		return major;
	}
	public void setMajor(String[] major) {
		this.major = major;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	
	
	
}
