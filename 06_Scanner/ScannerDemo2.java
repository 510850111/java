import java.util.Scanner;

class ScannerDemo2 {
	public static void main(String[] args){
	int a,b,c;
	Scanner sc  = new Scanner(System.in);
	a = sc.nextInt();
	b = sc.nextInt();
	c = a % b;
	System.out.println("a = " + a + ",b = " + b +",a % b  =" + c);
	}
}
