package com.demo.test;

import java.lang.reflect.Field;

public class Demo {

	public static void main(String[] args) throws Exception {
		String str="»ðºü";
		Class<? extends String> clazz = str.getClass();
		Field field = clazz.getDeclaredField("value");
		field.setAccessible(true);
		field.set(str, new char[]{'ÕÅ','Èý'});
		System.out.println(str);
	}
	
}
