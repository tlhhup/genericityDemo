package com.demo.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 绘制所有图形
 * @author ping
 *
 */
public class Canvas {

	public static void draw(List<? extends Shape> shapes){//上边界--->通配符 shape类型或者它子类
		for(Shape shape:shapes){
			shape.draw();
		}
	}
	
	public static void main(String[] args) {
		/*List<Shape> shapes=new ArrayList<Shape>();
		shapes.add(new Retangle());
		shapes.add(new Circle());
		
		draw(shapes);//多态来处理
		
		List<Retangle> retangles=new ArrayList<Retangle>(); 
		draw(retangles);*/
		ArrayList<Integer> src=new ArrayList<Integer>();
		ArrayList<Number> dest=new ArrayList<Number>();
		copy(dest, src);
		
		
		List<? super Integer> datas=new ArrayList<Number>();
	}
	
	//上边-->原始的数据类型
	public static <T,V> Collection<?> copy(Collection<? super T> dest,List<T> src){
		for(int i=0;i<src.size();i++){
			dest.add(src.get(i));
		}
		return dest;
	}
	
}
