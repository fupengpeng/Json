package com.jiudianlianxian.test02;

import java.util.Date;
import java.util.Random;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;

public class Bar {

	public static SerializeConfig mapping = new SerializeConfig();
	
	private String barName;
	private int barAge;
	private Date barDate = new Date();

	public static SerializeConfig getMapping() {
		return mapping;
	}

	public static void setMapping(SerializeConfig mapping) {
		Bar.mapping = mapping;
	}
	
	public Bar() {
	}

	public Bar(String barName, int barAge, Date barDate) {
		super();
		this.barName = barName;
		this.barAge = barAge;
		this.barDate = barDate;
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
	
	
	

}
