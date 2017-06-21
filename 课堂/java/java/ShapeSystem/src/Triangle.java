
public abstract class Triangle extends Shape {

	public Triangle(int width, int heigth) {
		super(width, heigth);
	}

	

	@Override
	public double calcArea() {
		return getWidth() * getHeigth()/2.0;
	}

}
