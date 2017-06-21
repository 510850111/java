
public class RightTriangle extends Triangle{

	public RightTriangle(int width, int heigth) {
		super(width, heigth);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcPerimeter() {
		int a = getWidth(),b = getHeigth();
		double c = Math.sqrt(a * a +b * b);
		return a + b + c;
	}

}
