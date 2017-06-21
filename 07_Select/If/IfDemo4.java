import java.util.Scanner;

class IfDemo4{
	public static void main(String[] args){
		int x,y;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("请输入第一个数据:");
		x = sc.nextInt();
		System.out.println("请输入第二个数据:");
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
