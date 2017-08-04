package com.jiudianlianxian.json;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ReanJSONObjectSample {

	public static void main(String[] args) {
		
		File file = new File
				(ReanJSONObjectSample.class.getResource("/wangxiaoer.json").getFile());
		
		try {
			@SuppressWarnings("deprecation")
			String content = FileUtils.readFileToString(file);
			
			JSONObject jsonObject = new JSONObject(content);
			
			System.out.println("–’√˚ «£∫" + jsonObject.getString("name"));
			System.out.println(jsonObject.getDouble("age"));
			System.out.println(jsonObject.getBoolean("has_girlfriend"));
			JSONArray jsonArray = jsonObject.getJSONArray("major");
			System.out.println(jsonArray.toString());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
