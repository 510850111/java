
public class Square implements Shape {

	private double radius;

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 3.14 * radius;
	}

	Square(double radius){
		this.radius = radius;
		
	}
}
