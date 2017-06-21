import java.util.Scanner;
public  class huanfang {
	static int n = input();
	public static int[][] array = new int[n][n];
	public static void main(String[] args) {
		initArray();
		boolean isOddNumber  = isOddNumber();
		SelectProgram(isOddNumber);
		disp();
	}

	private static void initArray() {
		for (int i  = 0 ; i < n ; i++) {
			for (int j = 0; j < n ; j++ ) {
				array[i][j] = 0;
			}
		}

	}

	static int input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("This is  input");
		return sc.nextInt();
	}

	private static boolean isOddNumber() {
		//如果是奇数就返回true,是偶数就返回false
		if (n % 1 == 0)  return true;
		else return false;
	}

	private static void SelectProgram(boolean isOddNumber) {
		if (isOddNumber) OddOrderMagicSquare();
		return ;
	}

	private static void OddOrderMagicSquare() {
		//奇数阶幻方
		int num = 1;
		int i = n / 2;

		
		return ;
	}

	private static boolean isOverTop(int pointer) {
		if (pointer + 1 - n < 0 ) return true;
		else return false;
	}

	private static boolean isOverRight(int pointer) {
		if ((pointer + 1) % n == 0) return true;
		else return false;
	}


	private static void disp() {
		for (int i = 0; i < n * n; i++) {
			System.out.print(array[i] + "\t");
			if (i != 0 && i % n == 0 ) {
				System.out.println();
				System.out.println();
			}
		}
		return ;
	}
}

