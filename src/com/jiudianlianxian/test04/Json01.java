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
        
		
		//�����ַ�ʽ  
	    Map mapType = JSON.parseObject(msg,Map.class); 
	   
	    System.out.println("�������JSON��,ָ���������ͣ�������JSON�ַ���!!!");  
	    for (Object obj : mapType.keySet()){  
	    	if ("login".equals(mapType.get(obj))) {
	    		
	    		//����ǵ�½������ʹ�õ�¼�����ʵ����գ�Ȼ���ٽ�����������ȡ�����ݽ������ݿ������
				Object login = mapType.get(obj);
				//��¼��������ѯ���ݿ����������ƥ�䣬��½�ɹ�����ʾ
				System.out.println("data = " + mapType.get(obj));
				System.out.println("hahahha");
				
				
				//��¼�ɹ���������ʾ��Ϣ����Ϣ���У����͸��ͻ���
				
			}
	        System.out.println("keyΪ��"+obj+"  ֵΪ��"+mapType.get(obj));  
	    }
	    
	    
	}

}
