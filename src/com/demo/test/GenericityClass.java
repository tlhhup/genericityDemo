package com.demo.test;

import java.util.ArrayList;
import java.util.List;

public class GenericityClass {

	public static void main(String[] args) {
		/*
		ArrayList collection = new ArrayList();
		collection.add(1);
		collection.add(1L);
		collection.add("abc");
		int i = (Integer) collection.get(1);
		*/
		List<Integer> datas=new ArrayList<Integer>();
		datas.add(123);//泛型
		
		print(datas);//List<Integer>---->List<Object>的子类
	}
	
	public static void print(List<?> datas){//不知道集合里面存储类型是什么类型的数据
		for(Object obj:datas){
			System.out.println(obj);
		}
	}
	
	public <T> void add(T a,T b){//泛型方法
		
	}
	
}
