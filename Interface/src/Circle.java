
public class Circle implements Shape{
	
	public double x=0,y=0;
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return x*y;
	}
	
	Circle(double x,double y){
		this.x = x;
		this.y = y;
		
	}

	//Scanner sc = new Scanner(System.in);
	//Circle c = new Circle(nowX,nowY);
}
