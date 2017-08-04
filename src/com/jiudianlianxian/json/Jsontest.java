package com.jiudianlianxian.json;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

public class Jsontest {

	public static void main(String[] args) {
		try {
//			String json = "{'code':'0000'}";
//			JSONObject jsonObj = new JSONObject(json);
//			String code = jsonObj.getString("code");
//			 
//			System.out.println(jsonObj);
//			 
//			jsonObj.put("uid", code.substring(0, 1).toUpperCase());
//			System.out.println(jsonObj);
//			jsonObj.put("data", code.substring(2, 3).toUpperCase());
//			System.out.println(jsonObj);
//			 
//			String[] likes = new String[] { "JavaScript", "Skiing", "Apple Pie" };
//			jsonObj.put("likes", likes);
//			 
//			System.out.println(jsonObj);
//			 
//			Map <String, String> ingredients = new HashMap <String, String>();
//			ingredients.put("apples", "3kg");
//			ingredients.put("sugar", "1kg");
//			ingredients.put("pastry", "2.4kg");
//			ingredients.put("bestEaten", "outdoors");
//			jsonObj.put("ingredients", ingredients);
//			System.out.println(jsonObj);
			
			String json = "{'code':'0000'}";
			JSONObject jsonObj = new JSONObject(json);
//			String name = jsonObj.getString("code");
			 
			System.out.println(jsonObj);
			 
			jsonObj.put("initial", "222");
			System.out.println(jsonObj);
			 
			jsonObj.put("aa", "999");
			System.out.println(jsonObj);
			
			String[] likes = new String[] { "JavaScript", "Skiing", "Apple Pie" };
			jsonObj.put("likes", likes);
			 
			System.out.println(jsonObj);
			 
			Map <String, String> ingredients = new HashMap <String, String>();
			ingredients.put("apples", "3kg");
			ingredients.put("sugar", "1kg");
			ingredients.put("pastry", "2.4kg");
			ingredients.put("bestEaten", "outdoors");
			jsonObj.put("ingredients", ingredients);
			System.out.println(jsonObj);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
