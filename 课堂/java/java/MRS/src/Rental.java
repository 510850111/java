
public class Rental {
	private Movie movie;
	private int rentedDays;
	
	public Rental(Movie movie, int rentedDays) {
		this.movie = movie;
		this.rentedDays = rentedDays;
	}
	
	public int getPoints(){
		int Points = 1;
		if(getMovie().getPriceCode()==Movie.NEW_RELEASE && getRentedDays() > 1)
			Points = 2;
		return Points ;
	}
	
	public double amountFor() {
		double amount = 0;
		switch (getMovie().getPriceCode()) {
			case Movie.REGULAR:
				amount += 2;
				if (getRentedDays() > 2)
					amount += (getRentedDays() - 2) * 1.5;
				break;
			case Movie.CHILDRENS:
				amount += 1.5;
				if (getRentedDays() > 3)
					amount += (getRentedDays() - 3) * 1.5;
				break;
			case Movie.NEW_RELEASE:
				amount += getRentedDays() * 3;
				break;
		}
		return amount;
	}

	public Movie getMovie() {
		return movie;
	}

	public int getRentedDays() {
		return rentedDays;
	}
}
