package com.demo.test;

import java.util.List;
import java.util.TreeSet;

public class StringDemo {

	public static void main(String[] args) {
		/*
		 * String str1="hello";//ֱ���� String str2=new String("hello");//ֱ��Ӧ������ֱ����
		 * System.out.println(str1.equals(str2));//true
		 * System.out.println(str1==str2);//false
		 * System.out.println(str1.hashCode()==str2.hashCode());//true
		 */
		/*
		 * TreeSet<Integer> sets=new TreeSet<Integer>();//��Ȼ���� Random random=new
		 * Random(); for(int i=0;i<20;i++){ int value=random.nextInt(20);
		 * System.out.println(value);
		 * sets.add(value);//��ӵ����ݺ����е����ݽ��бȽ�--->comparaTo }
		 * System.out.println("********************"); for(Integer i:sets){//1.5
		 * ��ǿforѭ�� System.out.println(i); }
		
		Set<Student> students =new HashSet<Student>();
		students.add(new Student(10, "����"));
		students.add(new Student(10, "����"));
		students.add(new Student(10, "����"));
		students.add(new Student(15, "����"));
		for (Student student : students) {
			System.out.println(student);
		}
		 */
		TreeSet<Student> students = new TreeSet<Student>();//�ڲ����Ǹ�TreeMap
		students.add(new Student(10, "����"));
		students.add(new Student(10, "����"));
		students.add(new Student(10, "����"));
		students.add(new Student(15, "����"));
		for (Student student : students) {
			System.out.println(student);
		}
		/*
		
		//�ڶ���-->ͨ���ƶ��Ƚ���
		TreeSet<Student> students2=new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return 0;
			}
		});
		
		/*
		char[] chars={'a','v','c'};//ֵ
		String str="hello";
		change(chars, str);
		System.out.print(new String(chars));//��ֵ����ַ----->��ֵ---String Ϊһ�����ɱ���--->StringBuilder,StringBuffer
		System.out.print(str);
		
		int a=80;//ֵ--->����ʲô��˼--->����-->��ַ	 ����--->ֵ
		int b=0;
		change(a, b);*/
		final Student student=new Student(10, "����");//final�������������͵ľֲ�����--->���ò��ɱ�
//		student.name="����";
		
		StudentDao studentDao=new StudentDao();
		List<Student> lists = studentDao.findAll();
	}

	public static void change(char[] chars,String str){
		chars[0]='c';
		str="test demo";
	}
	
	public static void change(int a,int b){//��������(ͬһ����)--->��д(����)
		a=90;
		b=80;
	}
	
	// �ڲ���-->�Ǿ�̬�ڲ���--->this
	// ��ǰ��
	static class Student implements Comparable<Student> {//ͬ��

		private int age;
		private String name;//final���ε����ԣ�jvmֱ�ӽ��г�ʼ��-->�ֶ����г�ʼ��
		
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
			if (obj instanceof Student) {// �Ƿ�student��ʵ������
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
