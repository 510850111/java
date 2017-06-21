package taxCalc;

import java.util.Scanner;

public class taxClac {
	public static void main(String[] args) {
		while(true){
			int n = input();
			double tex = convert(n);
			disp(n, tex);
		}
	}

	private static int input() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}

	private static double convert(int n) {
		 double base = n - 3500; 
		 double tax = 0;  
        if(base <= 0) {  
            tax = 0;  
        }  
        else if(base <= 1500) {  
            tax = base * 0.03;  
        }  
        else if(base <= 4500) {  
            tax = base * 0.1 - 105;  
        }  
        else if(base <= 9000) {  
            tax = base * 0.2 - 555;  
        }  
        else if(base <= 35000) {  
            tax = base * 0.25 - 1005;  
        }  
        else if(base <= 55000) {  
            tax = base * 0.3 - 2755;  
        }  
        else if(base <= 80000) {  
            tax = base * 0.35 - 5505;  
        }  
        else {  
            tax = base * 0.45 - 13505;  
        }
		return tax;
	}

	private static void disp(int n, double tex) {
		System.out.printf("您需要缴纳的税额为：%.2f\n",tex);	
	}
}
