import java.util.Scanner;

class IfDemo4{
	public static void main(String[] args){
		int x,y;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("�������һ������:");
		x = sc.nextInt();
		System.out.println("������ڶ�������:");
		y = sc.nextInt();

		if(x>y){
			System.out.println(x+" > "+y);
		}else if(x == y){
			System.out.println(x+" = "+y);
		} else {
			System.out.println(x+" < "+y);
		}
	}
}
