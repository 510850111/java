import java.util.Scanner;

class IfDemo2{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("请输入第一个数:");
	int X1 = sc.nextInt();

	System.out.println("请输入第二个数:");
	int X2 = sc.nextInt();

	int max;
	if(X1 > X2 ){
		max = X1;
	} else{
		max = X2;
	}
	
	System.out.println("max = " + max);
	}
}

		