import java.io.PushbackReader;


public abstract class Shape {
	private int width;
	private int heigth;
	
	public abstract double calcPerimeter(); 
	public abstract double calcArea(); 
	
	public Shape (int width,int heigth){
		this.width = width;
		this.heigth = heigth;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeigth() {
		return heigth;
	}
	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}
	
}
