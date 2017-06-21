package years;

public class years {
	
	static String[] years = new String[100];
	private static int i;
	private static int j;
	public static void main(String[] args) {
		  convert();
		  disp();
	}

	private static String[] convert() {
	    for(int year=2001;year<2101;year++)
	    {
	      if ((year % 4 ==0 && year % 100 >0)||year %400==0){
	    	  years[i] = String.valueOf(year);
		      i++;  
	      }
	    }
	     j = i;
		 return years;
	}

	private static void disp() {
		System.out.println("21世纪有"+j+"个闰年分别是:");
		 for(i = 0; i < j; i++) {
	            System.out.print(years[i]);
	            System.out.print(" ");
	        }
		
	}
}
