import java.util.Scanner;

class IfDemo3{
	public static void main(String[] args){
		int x;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个数据:");
		 x = sc.nextInt() ;

		if(x%2 == 0){
			System.out.println(x + "是偶数");
		} else {
			System.out.println(x + "是奇数");
		}
	}
}

	