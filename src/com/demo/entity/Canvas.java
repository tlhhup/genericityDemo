package com.demo.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * ��������ͼ��
 * @author ping
 *
 */
public class Canvas {

	public static void draw(List<? extends Shape> shapes){//�ϱ߽�--->ͨ��� shape���ͻ���������
		for(Shape shape:shapes){
			shape.draw();
		}
	}
	
	public static void main(String[] args) {
		/*List<Shape> shapes=new ArrayList<Shape>();
		shapes.add(new Retangle());
		shapes.add(new Circle());
		
		draw(shapes);//��̬������
		
		List<Retangle> retangles=new ArrayList<Retangle>(); 
		draw(retangles);*/
		ArrayList<Integer> src=new ArrayList<Integer>();
		ArrayList<Number> dest=new ArrayList<Number>();
		copy(dest, src);
		
		
		List<? super Integer> datas=new ArrayList<Number>();
	}
	
	//�ϱ�-->ԭʼ����������
	public static <T,V> Collection<?> copy(Collection<? super T> dest,List<T> src){
		for(int i=0;i<src.size();i++){
			dest.add(src.get(i));
		}
		return dest;
	}
	
}
