package com.demo.test;

import java.lang.reflect.Field;

public class Demo {

	public static void main(String[] args) throws Exception {
		String str="���";
		Class<? extends String> clazz = str.getClass();
		Field field = clazz.getDeclaredField("value");
		field.setAccessible(true);
		field.set(str, new char[]{'��','��'});
		System.out.println(str);
	}
	
}
