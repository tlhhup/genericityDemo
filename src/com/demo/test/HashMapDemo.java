package com.demo.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.demo.entity.Teacher;

public class HashMapDemo {

	public static void main(String[] args) {
		//mapʹ���Զ������͵�������Ϊkey
		Map<Teacher, String> map=new HashMap<Teacher, String>();
		
		map.put(new Teacher(12,"����"), "����");
		map.put(new Teacher(11,"����1"), "����1");
		for(Entry<Teacher, String> entry:map.entrySet()){
			System.out.println(entry.getKey().toString());
			System.out.println(entry.getValue());
		}
	}
	
}
