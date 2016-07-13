package com.demo.entity;

public class Teacher {

	private int age;
	private String name;

	public Teacher() {
	}

	public Teacher(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return this.name.hashCode() + age;
	}

}
