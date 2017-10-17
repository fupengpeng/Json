package com.jiudianlianxian.test06;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class Test {
	public static void main(String[] args) {
		Test test = new Test();
		test.test01();
		
		
	}
	
	public void test01(){
		 Milk milk = new Milk();  
	     milk.setName("草莓牛奶");  
	     milk.setBrand("银桥");  
	     milk.setType("酸牛奶"); 
	     
	     User user = new User();
	     user.setAge(15);
	     user.setName("张三");
	     
	     milk.setUser(user);
	     
	     
	     String[] colour = {"红色","白色","橙色"};
	     milk.setColour(colour);
	     
	     User user01 = new User();
	     user01.setAge(12);;
	     user01.setName("张三弟");
	     
	     User user02 = new User();
	     user02.setName("张三妹");
	     user02.setAge(11);
	     
	     List<User> users = new ArrayList<User>();
	     users.add(user01);
	     users.add(user02);
	     
	     milk.setUsers(users);
	     
	     
	     // Gson().toJson(Object)实现javaBean到json数据转换  
	     String gsonString = new Gson().toJson(milk);  
	     System.out.println(gsonString);  
	     
	     
	     // Gson().fromJson(json, clazz)实现json到javaBean的转换  
	     Milk milk2 = new Gson().fromJson(gsonString, Milk.class);  
	     List<User> zhangsans = milk2.getUsers();
	     User ZhangsanMei = zhangsans.get(1);
	     System.out.println("ZhangsanMei  = " + ZhangsanMei);
	     System.out.println(milk2.getName());  
	}
}
