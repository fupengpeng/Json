package com.jiudianlianxian.test02;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;

public class Test {

	private static SerializeConfig mapping = new SerializeConfig();
//	static {
//		mapping.put(Date.class, new SimpleDateFormatSerializer(
//				"yyyy-MM-dd HH:mm:ss"));
//	}

	public static void main(String[] args) {
		Foo f1 = new Foo();
		Bar bar = new Bar("zhangsan", 55, new Date());
		f1.setBar(bar);
		
		
		String x2 = JSON.toJSONString(f1, mapping);
		System.out.println(x2);
	}


}
