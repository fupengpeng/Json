package com.jiudianlianxian.test04;

import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import com.alibaba.fastjson.JSON;


public class Json01 {

	
	 
	
	public static void main(String[] args) {
		String msg = "{'info':'login','data':{'username':'zhangsan','sex':'nan','age':'55'}}";
		
		JSONObject jsonObject1;
		try {
			jsonObject1 = new JSONObject(msg);
			String info = jsonObject1.getString("info");
			JSONObject data = jsonObject1.getJSONObject("data");
			System.out.println("data  = " + data.toString());
			System.out.println("username = " + data.getString("username"));
			System.out.println("sex = " + data.getString("sex"));
			System.out.println("age = " + data.getString("age"));
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		
		//第三种方式  
	    Map mapType = JSON.parseObject(msg,Map.class); 
	   
	    System.out.println("这个是用JSON类,指定解析类型，来解析JSON字符串!!!");  
	    for (Object obj : mapType.keySet()){  
	    	if ("login".equals(mapType.get(obj))) {
	    		
	    		//如果是登陆请求，则使用登录请求的实体接收，然后再解析，进而获取到数据进行数据库操作。
				Object login = mapType.get(obj);
				//登录操作，查询数据库操作，数据匹配，登陆成功，提示
				System.out.println("data = " + mapType.get(obj));
				System.out.println("hahahha");
				
				
				//登录成功，保存提示消息到消息队列，发送给客户端
				
			}
	        System.out.println("key为："+obj+"  值为："+mapType.get(obj));  
	    }
	    
	    
	}

}
