
public abstract class Triangle extends Shape{
	
	public Triangle(int w, int h){
		super(w, h);
	}

	@Override
	public abstract double calcPerimeter();

	@Override
	public double calcArea() {
		return (getWidth() * getHeight()) / 2;
	}

}
