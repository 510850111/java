
public class RightTriangle extends Triangle{

	public RightTriangle(int w, int h) {
		super(w, h);
	}

	@Override
	public double calcPerimeter() {
		int a = getWidth(), b = getHeight();
		double c = Math.sqrt(a * a + b * b);
		return a+b+c;
	}

}
