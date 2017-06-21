
public class Entry {

	public static void main(String[] args) {
		Movie m = new Movie("∂¿¡¢»’", Movie.NEW_RELEASE);
		Rental r = new Rental(m, 2);
		Customer tom = new Customer("Tom");
		tom.addRental(r);
		System.out.println(tom.print());
	}

}
