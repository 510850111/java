import java.util.Scanner;

public class 约瑟夫环 {
	static int num = input("总人数");
	int[] arr = new int[num];
	public static void main(String[] args) {
		int quitNum = input("退出人数");
		int finalArrPointer = clac(num, quitNum);
		void disp(finalArrPointer);
	}

	private int input(String tips){
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入" + tips + ":");
		return sc.nextInt();
	}


}

