package areaPerimeter;

public class Triangle {
	private int length;
	private int hight;
	
	public Triangle(int length,int hight){
		setLength(length);
		setHight(hight);
	}
	
	public double area() {
		double Are = length * hight / 2;
		return Are;
	}
	
//	public double perimeter() {
//		double Per = 
//		return Per;
//	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public void setHight(int hight) {
		this.hight = hight;
	}
	
	public int getLength(){
		return length;
	}
	
	public int getHight(){ {
		return hight;
	}
		
	}
}
