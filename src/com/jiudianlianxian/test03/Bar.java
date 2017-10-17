package com.jiudianlianxian.test03;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;

public class Bar {

//	public static SerializeConfig mapping = new SerializeConfig();
	
	private String barName;
	private int barAge;
	private Date barDate = new Date();
	private Map<String, String> map = new HashMap<String, String>(); 
	
	
//	static {
//		mapping.put(Date.class, new SimpleDateFormatSerializer("yyyy-MM-dd"));
//	}
	
	
//	{
//		Random r = new Random();
//		barName = "sss_" + String.valueOf(r.nextFloat());
//		barAge = r.nextInt();
//	}
	

//	public static void main(String[] args) {
//		Object obj = JSON.toJSON(new Bar());
//		String x1 = JSON.toJSONString(new Bar(), true);
//		System.out.println(x1);
//		String x2 = JSON.toJSONString(new Bar(), mapping);
//		System.out.println(x2);
//	}

//	public static SerializeConfig getMapping() {
//		return mapping;
//	}
//
//	public static void setMapping(SerializeConfig mapping) {
//		Bar.mapping = mapping;
//	}
	
	public Bar() {
	}


	
	
	
	public Bar(String barName, int barAge, Date barDate,
			Map<String, String> map, Set<User> user) {
		super();
		this.barName = barName;
		this.barAge = barAge;
		this.barDate = barDate;
		this.map = map;
		this.user = user;
	}


	public String getBarName() {
		return barName;
	}


	public void setBarName(String barName) {
		this.barName = barName;
	}


	public int getBarAge() {
		return barAge;
	}


	public void setBarAge(int barAge) {
		this.barAge = barAge;
	}


	public Date getBarDate() {
		return barDate;
	}


	public void setBarDate(Date barDate) {
		this.barDate = barDate;
	}


	public Map<String, String> getMap() {
		return map;
	}


	public void setMap(Map<String, String> map) {
		this.map = map;
	}


	public Set<User> getUser() {
		return user;
	}


	public void setUser(Set<User> user) {
		this.user = user;
	}


	private Set<User> user = new HashSet<User>();
	

	

}
