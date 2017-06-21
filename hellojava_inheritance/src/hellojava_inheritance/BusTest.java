package hellojava_inheritance;

public class BusTest {
	public void main(String[] args) {
		// TODO Auto-generated method stub
		Car  car= new Car();
		car.V = 60;
		Bus bus = new Bus();
		bus.V =70;
		bus.p =50 ;
		car.drive();
		bus.drive();
		bus.carry();
		bus.sum();
	}
}
