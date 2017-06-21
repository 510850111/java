
public class Entry {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[4];
		shapes[0] = new Rectangle(4, 4);
		shapes[1] = new Oval(4, 4);
		shapes[2] = new RightTriangle(4, 4);
		shapes[3] = new IsoscelesTriangle(4, 4);
		for(Shape s : shapes){
			System.out.printf("perimeter=%.2f,area=%.2f\n",
					s.calcPerimeter(), s.calcArea());
		}
	}
sa
}
