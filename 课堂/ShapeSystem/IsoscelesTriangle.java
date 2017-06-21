
public class IsoscelesTriangle extends Triangle{

	public IsoscelesTriangle(int w, int h) {
		super(w, h);
	}

	@Override
	public double calcPerimeter() {
		int a = getWidth(), b = getHeight();
		double c = Math.sqrt(a*a/4 + b*b);
		return a + 2 * c;
	}

}
