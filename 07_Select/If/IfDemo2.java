import java.util.Scanner;

class IfDemo2{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("�������һ����:");
	int X1 = sc.nextInt();

	System.out.println("������ڶ�����:");
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

		