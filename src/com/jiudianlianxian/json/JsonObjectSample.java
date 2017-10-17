package com.jiudianlianxian.json;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import com.jiudianlianxian.bean.Boshi;

public class JsonObjectSample {

	public static void main(String[] args) {
//		JsonObject();
		createJsonObject();
//		createJsonByBean();

	}

	private static void JsonObject() {
		JSONObject wangxiaoer = new JSONObject();

		Object nullObj = null;
		try {
			wangxiaoer.put("name", "��С��");
			wangxiaoer.put("age", 25);
			wangxiaoer.put("birthday", "1993-05-06");
			wangxiaoer.put("school", "������ѧ");
			wangxiaoer.put("major", new String[] { "lifa", "wangjueji" });
			wangxiaoer.put("has_girlfriend", false);
			wangxiaoer.put("car", nullObj);
			wangxiaoer.put("comment", "����һ��ע��");

			System.out.println(wangxiaoer.toString());

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void createJsonObject() {
		Map<String, Object> wangxiaoer = new HashMap<String, Object>();
		Object nullObj = null;

		wangxiaoer.put("name", "��С��");
		wangxiaoer.put("age", 25);
		wangxiaoer.put("birthday", "1993-05-06");
		wangxiaoer.put("school", "������ѧ");
		wangxiaoer.put("major", new String[] { "lifa", "wangjueji" });
		wangxiaoer.put("has_girlfriend", false);
		wangxiaoer.put("car", nullObj);
		wangxiaoer.put("comment", "����һ��ע��");

		
		JSONObject jsonObject = new JSONObject(wangxiaoer);
		System.out.println("wangxiaoerMap=="+jsonObject.toString());

	}

	public static void createJsonByBean(){
		Boshi boshi = new Boshi();
		boshi.setName("��С��");
		boshi.setSex("nan");
		boshi.setHas_girlfriend(false);
		boshi.setAge(25.6);
		boshi.setCar(null);
		boshi.setMajor(new String[]{"lifa","wajueji"});
		boshi.setComment("����һ��ע��");
		System.out.println(new JSONObject(boshi).toString());
		
		
	}
	
}
