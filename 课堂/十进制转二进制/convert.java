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
		System.out.print("������һ��ʮ������Ҫת��Ϊ�����Ƶ�������:");
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
		System.out.println("ʮ����ת��Ϊ�������᣺");
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(array[j]);
		}
	}
}

