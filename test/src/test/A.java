package test;


public class a {

	public static void main(String[] args) {
		
		Computer computer = new Computer("A", "B", 30, 123);
		Computer computer2 = new Computer("Aa", "B", 30, 123);
		String aString  = computer.toString();
		System.out.println(aString);
		System.out.println(computer.equals(computer2));
	}

	public String band;
	public int price;
	public int memorySize;
	public Object type;


}

class Computer {
	String band = "";
	String type = "";
	int price = 0 ;
	int memorySize = 0 ;
	
	public  Computer() {
		
	}
	
	public  Computer(String band ,String type,int price,int memorySize) {
		this.band = band;
		this.type = type;
		this.price = price;
		this.memorySize = memorySize;
	}
	
	public String getBand() {
		return band;
	}
	
	public void setBand(String band) {
		this.band = band;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getMemorySize() {
		return memorySize;
	}
	
	public void setMemorySize(int memorySize) {
		this.memorySize = memorySize;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		a other = (a) obj;
		
		if (band != other.band)
			return false;
		
		if (price != other.price) 
			return false;
			
		if (memorySize != other.memorySize) 
			return false;
		
		if (type == null) {
			if (other.type != null)
				return false;
		} 
		
		return true;
	}
	
	public String toString() {
		
		return this.band+this.type+this.price+this.memorySize;
	}
	
}