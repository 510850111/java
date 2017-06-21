
public class Rectangle extends Shape{
	
	public Rectangle(int w, int h){
		super(w, h);
	}

	@Override
	public double calcPerimeter() {
		return (getWidth()+getHeight())*2;
	}

	@Override
	public double calcArea() {
		return getWidth() * getHeight();
	}
}
