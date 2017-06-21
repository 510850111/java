
public  class Rectangle extends Shape{

	public Rectangle(int width, int heigth) {
		super(width, heigth);
	}

	@Override
	public double calcPerimeter() {
		return (getHeigth()+getWidth()) * 2; 
	}

	@Override
	public double calcArea() {
		return getHeigth() *getWidth();
	}

}
