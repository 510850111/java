package test;

public class c {

	public static void main(String[] args) {
		int n = 50;
		double a = 0L;
		double b = 0L;
		for (int i = 2; i <= n; i+=2) {
			
			a+= (1/(2*n-1));
		}
		
		for(int i = 3; i <= n; i+=2) {
			
			a+= (1/(2*n-1));
		}
	}

}