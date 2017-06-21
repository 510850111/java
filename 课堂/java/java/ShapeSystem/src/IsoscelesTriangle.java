
public class IsoscelesTriangle extends Triangle{

	public IsoscelesTriangle(int width, int heigth) {
		super(width, heigth);
	}

	@Override
	public double calcPerimeter() {
		int a = getWidth(),b = getHeigth();
		double c = Math.sqrt(a * a /4.0 + b * b); 
		return a + 2 * c;
	}

}
