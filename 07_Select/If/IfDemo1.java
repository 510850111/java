import java.util.Scanner;

class IfDemo1{
	public static void main(String[] args){
	int x,y;
	Scanner sc = new Scanner(System.in);
	System.out.println("����������1:");
	x = sc.nextInt();
	System.out.println("����������2:");
	y = sc.nextInt();
	if(x > y){
		System.out.println("X>Y");
	}
	else{
		System.out.println("X<=Y");
	}
	}
}

