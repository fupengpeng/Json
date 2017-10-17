package com.jiudianlianxian.test05;

import java.util.Arrays;
import java.util.List;

public class User {
	
	private String name;
	private int age;
	private boolean member;
	private String[] likes;
	private User[] friends;
	private List<Clothes> clothess;
	private User father;
	
	
	
	public List<Clothes> getClothess() {
		return clothess;
	}
	public void setClothess(List<Clothes> clothess) {
		this.clothess = clothess;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isMember() {
		return member;
	}
	public void setMember(boolean member) {
		this.member = member;
	}
	public String[] getLikes() {
		return likes;
	}
	public void setLikes(String[] likes) {
		this.likes = likes;
	}
	public User[] getFriends() {
		return friends;
	}
	public void setFriends(User[] friends) {
		this.friends = friends;
	}

	public User getFather() {
		return father;
	}
	public void setFather(User father) {
		this.father = father;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", member=" + member
				+ ", likes=" + Arrays.toString(likes) + ", friends="
				+ Arrays.toString(friends) + ", clothess=" + clothess
				+ ", father=" + father + "]";
	}
	
	

	
}
