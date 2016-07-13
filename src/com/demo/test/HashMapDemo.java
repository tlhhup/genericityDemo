package com.demo.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.demo.entity.Teacher;

public class HashMapDemo {

	public static void main(String[] args) {
		//map使用自定义类型的数据作为key
		Map<Teacher, String> map=new HashMap<Teacher, String>();
		
		map.put(new Teacher(12,"张三"), "张三");
		map.put(new Teacher(11,"张三1"), "张三1");
		for(Entry<Teacher, String> entry:map.entrySet()){
			System.out.println(entry.getKey().toString());
			System.out.println(entry.getValue());
		}
	}
	
}
