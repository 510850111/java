import java.util.Scanner;

class IfDemo3{
	public static void main(String[] args){
		int x;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ������:");
		 x = sc.nextInt() ;

		if(x%2 == 0){
			System.out.println(x + "��ż��");
		} else {
			System.out.println(x + "������");
		}
	}
}

	