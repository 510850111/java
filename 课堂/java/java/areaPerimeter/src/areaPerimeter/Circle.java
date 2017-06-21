package areaPerimeter;

import java.awt.geom.Area;

public class Circle {
	public double pi = 3.14;
	private int radius;
	private double Are;
	private double Per;
	
	@Override
	public String toString(){
//		Integer.parseInt("12.3")  //�ַ���ת��������
	    
		return String.format("�����%lf,�߳���%lf", Are,Per);
	}
	
	public Circle(int radius){
		setRadius(radius);
	}
	
	public  double  area(){
		 Are = pi * radius * radius;
		return Are;
	}
	
	public double perimeter() {
		 Per = 2 * pi * radius;
		return Per;
	}
	
	public void setRadius(int radius){
		this.radius = radius;
	}
	
	public  int getRadius(){
		return radius;
	}
}
