import java.util.Scanner;

class ScannerDemo1 {
	public static void main(String[] args) {
		Scanner inputIntNumber = new Scanner(System.in);

		System.out.print("�������һ��ֵ:");
		int X1 = inputIntNumber.nextInt();
		System.out.print("������ڶ���ֵ:");
		int X2 = inputIntNumber.nextInt();
		System.out.print("X1+X2=" + (X1 + X2));
	}
}
