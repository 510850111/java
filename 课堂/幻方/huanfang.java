import java.util.Scanner;
public  class huanfang {
	static int n = input();
	public static int[] array = new int[n * n + 1];

	public static void main(String[] args) {
		initArray();
		boolean isOddNumber  = isOddNumber();
		SelectProgram(isOddNumber);
		disp();
	}

	private static void initArray() {
		for (int i  = 1 ; i <= n * n; i++) {
			array[i - 1] = 0;
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
		boolean overTop = false;
		boolean overRight = false;
		array[i] = num ++;
		for (; i < n * n; num++) {
			System.out.println("i=" + i + "   array[" + i + "]=" + array[i]);
			if ( (i + 1 - n <= 0) || array[i + 1 - n] != 0) {
				//如果右上方被填写,就填写到正下方
				i = i + n;
				array[i] = num;
				// System.out.println(array[i] + "   i=  " + i);
				continue;
			}
			overTop = isOverTop(i);
			overRight = isOverRight(i);
			if (overTop == true && overRight == false) {
				i = i + (n * (n - 1));
				array[i++] = num;
			} else if (overTop == false && overRight == true) {
				i = i - n * 2 + 1;
				array[i] = num;
			} else if (overTop == true && overRight == true) {
				i += 5;
				array[i] = num;
			} else {
				i = i + 1 - n;
				array[i] = num;
			}
			overTop = false;
			overRight = false;
		}
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

