package com.jiudianlianxian.test05;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

public class Test01 {
	
	public static void main(String[] args) {
		Test01 test01 = new Test01();
		test01.test01();
	}
	@Test
	public void test01(){
		User user = new User();
		
		user.setName("zhangsan");
		user.setAge(15);
		user.setMember(true);
		
		String[] likes = {"wanshua","lanqiu","zhuoqiu"};
		user.setLikes(likes);
		
		User lisi01 = new User();
		User lisi02 = new User();
		User[] friends = {lisi01,lisi02};
		user.setFriends(friends);
		
		Clothes clothes01 = new Clothes();
		clothes01.setColour("#ffaa55");
		clothes01.setFastener(5);
		JSONObject jsonclothes01 = new JSONObject();
		try {
			jsonclothes01.put("colour", "#ffaa55");
			jsonclothes01.put("fastener", 5);
			System.out.println("jsonclothes01  = " +jsonclothes01 );
		} catch (JSONException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		
		
		Clothes clothes02 = new Clothes();
		clothes02.setColour("#aa8800");
		clothes02.setFastener(6);
		JSONObject jsonclothes02 = new JSONObject();
		try {
			jsonclothes02.put("colour", "#aa8800");
			jsonclothes02.put("fastener", 6);
			System.out.println("jsonclothes02  = " +jsonclothes02 );
		} catch (JSONException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		
		List<Clothes> clothess = new ArrayList<Clothes>();
		clothess.add(clothes01);
		clothess.add(clothes02);
		
		JSONArray jsonArray = new JSONArray() ;
		try {
			jsonArray.put(1,jsonclothes01);
			jsonArray.put(2,jsonclothes02);
			System.out.println("jsonArray  = " +jsonArray );
		} catch (JSONException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
		user.setClothess(clothess);
		
		User father = new User();
		father.setAge(100);
		father.setName("baba");
		
		user.setFather(father);
		
		JSONObject userobject = new JSONObject();
		try {
			userobject.put("name", "zhangsan");
			userobject.put("age", "15");
			userobject.put("member", true);
			userobject.put("likes", likes);
			userobject.put("friends", friends);
			userobject.put("clothess", jsonArray);
			userobject.put("father", father);
			System.out.println("userobject = " + userobject);
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		JSONObject jsonObject = new JSONObject();
		
		try {
			jsonObject.put("user", user);
			System.out.println("jsonObject--user = " + jsonObject);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
