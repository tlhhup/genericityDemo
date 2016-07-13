package com.demo.test;

import java.util.List;
import java.util.TreeSet;

public class StringDemo {

	public static void main(String[] args) {
		/*
		 * String str1="hello";//直接量 String str2=new String("hello");//直接应用上面直接量
		 * System.out.println(str1.equals(str2));//true
		 * System.out.println(str1==str2);//false
		 * System.out.println(str1.hashCode()==str2.hashCode());//true
		 */
		/*
		 * TreeSet<Integer> sets=new TreeSet<Integer>();//自然排序 Random random=new
		 * Random(); for(int i=0;i<20;i++){ int value=random.nextInt(20);
		 * System.out.println(value);
		 * sets.add(value);//添加的数据和已有的数据进行比较--->comparaTo }
		 * System.out.println("********************"); for(Integer i:sets){//1.5
		 * 增强for循环 System.out.println(i); }
		
		Set<Student> students =new HashSet<Student>();
		students.add(new Student(10, "张三"));
		students.add(new Student(10, "张三"));
		students.add(new Student(10, "李四"));
		students.add(new Student(15, "王二"));
		for (Student student : students) {
			System.out.println(student);
		}
		 */
		TreeSet<Student> students = new TreeSet<Student>();//内部还是个TreeMap
		students.add(new Student(10, "张三"));
		students.add(new Student(10, "张三"));
		students.add(new Student(10, "李四"));
		students.add(new Student(15, "王二"));
		for (Student student : students) {
			System.out.println(student);
		}
		/*
		
		//第二种-->通过制定比较器
		TreeSet<Student> students2=new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return 0;
			}
		});
		
		/*
		char[] chars={'a','v','c'};//值
		String str="hello";
		change(chars, str);
		System.out.print(new String(chars));//传值、传址----->传值---String 为一个不可变类--->StringBuilder,StringBuffer
		System.out.print(str);
		
		int a=80;//值--->具体什么意思--->引用-->地址	 基本--->值
		int b=0;
		change(a, b);*/
		final Student student=new Student(10, "张三");//final的引用数据类型的局部变量--->引用不可变
//		student.name="李四";
		
		StudentDao studentDao=new StudentDao();
		List<Student> lists = studentDao.findAll();
	}

	public static void change(char[] chars,String str){
		chars[0]='c';
		str="test demo";
	}
	
	public static void change(int a,int b){//方法重载(同一类中)--->复写(子类)
		a=90;
		b=80;
	}
	
	// 内部类-->非静态内部类--->this
	// 当前类
	static class Student implements Comparable<Student> {//同包

		private int age;
		private String name;//final修饰的属性，jvm直接进行初始化-->手动进行初始化
		
		public String getName(){
			return new String(name);
		}

		public Student() {
			
		}

		public Student(int age, String name) {
			this.age = age;
			this.name = name;
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Student) {// 是否student的实例对象
				Student student = (Student) obj;
				return this.name.equals(student.name);
			}
			return super.equals(obj);
		}

		@Override
		public int hashCode() {
			return this.name.hashCode() + age;
		}

		@Override
		public int compareTo(Student o) {
			int result = this.age - o.age;
			if(result==0){
				result=this.name.compareTo(o.name);
			}
			return result;// >0
		}

		@Override
		public String toString() {
			return "Student [age=" + age + ", name=" + name + "]";
		}

	}

}
