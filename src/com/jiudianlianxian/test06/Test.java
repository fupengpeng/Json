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
	     milk.setName("��ݮţ��");  
	     milk.setBrand("����");  
	     milk.setType("��ţ��"); 
	     
	     User user = new User();
	     user.setAge(15);
	     user.setName("����");
	     
	     milk.setUser(user);
	     
	     
	     String[] colour = {"��ɫ","��ɫ","��ɫ"};
	     milk.setColour(colour);
	     
	     User user01 = new User();
	     user01.setAge(12);;
	     user01.setName("������");
	     
	     User user02 = new User();
	     user02.setName("������");
	     user02.setAge(11);
	     
	     List<User> users = new ArrayList<User>();
	     users.add(user01);
	     users.add(user02);
	     
	     milk.setUsers(users);
	     
	     
	     // Gson().toJson(Object)ʵ��javaBean��json����ת��  
	     String gsonString = new Gson().toJson(milk);  
	     System.out.println(gsonString);  
	     
	     
	     // Gson().fromJson(json, clazz)ʵ��json��javaBean��ת��  
	     Milk milk2 = new Gson().fromJson(gsonString, Milk.class);  
	     List<User> zhangsans = milk2.getUsers();
	     User ZhangsanMei = zhangsans.get(1);
	     System.out.println("ZhangsanMei  = " + ZhangsanMei);
	     System.out.println(milk2.getName());  
	}
}
