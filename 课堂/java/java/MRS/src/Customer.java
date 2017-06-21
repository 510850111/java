import java.util.ArrayList;
import java.util.Iterator;


public class Customer {
	private String name;
	private ArrayList<Rental> rentals = new ArrayList<Rental>();
	
	public Customer(String name) {
		this.name = name;
	}
	
	public void addRental(Rental r){
		rentals.add(r);
	}
	
	public String print(){
		double total = 0;
		int points = 0;
		Iterator<Rental> it = rentals.iterator();
		String result = "Rental record for " + getName() + "\n";
		
		while(it.hasNext()){
			Rental r = it.next();
			double amount = r.amountFor();
			points += r.getPoints();
			result += "\t" + r.getMovie().getName() + "\t" + amount + "\n";
			total += amount;
		}
		
		result += "Amount owed is " + total + "\n";
		result += "You earned " + points + " frequent renter points";
		return result;
	}
	
	

	public String getName(){
		return name;
	}
}
