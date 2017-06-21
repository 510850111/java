package 类定义;

class Vehicle{
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	
	public Vehicle(int speed,int size){
		this.speed = speed;
		this.size = size;
	}
	
	private int speed = 0;
	private int size = 0;
	
	void move() {
		System.out.println("正在移动,速度为:" + this.speed);
	}
	
		
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void speedUp(int num) {
		this.speed += num;
	}
	void speedDown(int num){
		this.speed -= num;
	}
}

public class Test {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle(500,10);
		System.out.print("当前速度为:" );
		vehicle.move();
		vehicle.setSpeed(500);
		vehicle.move();
		vehicle.speedDown(20);
		vehicle.move();
	}

}
