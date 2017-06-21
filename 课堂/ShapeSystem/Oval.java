
public class Oval extends Shape{
	public final static double PI = 3.14;
	
	public Oval(int w, int h){
		super(w, h);
	}

	@Override
	public double calcPerimeter() {
		int a = Math.max(getWidth(), getHeight()) / 2;
		int b = Math.min(getWidth(), getHeight()) / 2;
		return 2 * b * PI + 4 * (a - b);
	}

	@Override
	public double calcArea() {
		int a = getWidth() / 2;
		int b = getHeight() / 2;
		return a * b * PI;
	}

}
