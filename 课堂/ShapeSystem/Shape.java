
public abstract class Shape {
	private int width;
	private int height;
	
	public abstract double calcPerimeter();
	public abstract double calcArea();
	
	public Shape(){}
	
	public Shape(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
}
