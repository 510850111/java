import java.nio.channels.Pipe;


public class Oval extends Shape{
	public final static double PI = 3.14;

	public Oval(int width, int heigth) {
		super(width, heigth);
	}

	@Override
	public double calcPerimeter() {
		int a = Math.max(getWidth(), getHeigth()) / 2;
		int b = Math.min(getHeigth(), getWidth()) / 2;
		return 2 * PI * b + 4 * (a - b) ;
	}

	@Override
	public double calcArea() {
		int a = getWidth() / 2,b = getHeigth() / 2;
		return PI * a * b;
	}

}
