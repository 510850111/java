import java.util.Scanner;
public class convert {
	static int[] array = new int[20];
	static int i =0;
	public static void main(String[] args) {
		int num = input();
		array = convert(num);
		disp(array);
	}

	private static int input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个十进制需要转换为二进制的正整数:");
		int num = sc.nextInt();
		return num;
	}

	private static int[] convert(int num) {
		int r;
		do {
			if (num % 2 == 1)
				r = 1;
			else
				r = 0;
			array[i] = r;
			num /= 2;
			i++;
		} while (num > 0);

		return array;
	}

	private static void disp(int[] array) {
		System.out.println("十进制转换为二进制後：");
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(array[j]);
		}
	}
}

