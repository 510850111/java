package areaPerimeter;

import java.awt.geom.Area;

public class Rectangle {
	private int length;
	private int wide;
	
	public Rectangle(int length,int wide){
		setLength(length);
		setWide(wide);
	}
	
	public int area(){
		int Are = length * wide;
		return Are;
	}
	
	public int  perimeter() {
		int Per = 2 * (length + wide);
		return Per;
	}
	
	public void setLength(int length){
		this.length = length;
	}
	
	public void setWide(int wide){
		this.wide = wide;
	}
	
	public int getLength(){
		return length;
	}
	
	public int getWide(){
		return wide;
	}
}
