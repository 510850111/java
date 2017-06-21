
 import java.util.Scanner;
 

class Demo1_quart{
	Scanner sc = new Scanner(System.in);
	
	int width = sc.nextInt();
	int height = sc.nextInt();
	
	quarts1 q = new quarts1(width,height);
	int recieved = q.area();
	System.out.println(recieved);
	System.out.println(" ");
	
}