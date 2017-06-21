
public class Entry {
	public static void main(String[] args) {
		Shape[] a = new Shape[4];
		a[0] = new Rectangle(4, 4);
		a[1] = new Oval(4, 4);
		a[2] = new RightTriangle(4, 4);
		a[4] = new IsoscelesTriangle(4, 4);
		for(Shape s: a){
			System.out.printf("p= %.2f,a=%.2f\n",
					s.calcPerimeter(),s.calcArea());
		}
		
	}
}
