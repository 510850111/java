import java.util.Scanner;

public class 质数判断 {
	public static void main(String[] args) {
		while (true) {
			int n = input();
			if(n == -1) break;
			boolean isPrime = isPrime(n);
			disp(n, isPrime);
		}
	}

	private static int input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个数:");
		int n = sc.nextInt();
		return n;
	}

	private static boolean isPrime(int n) {
		boolean isPrime = true;
		int i = 2;
		if (n == 1) {
			isPrime = false;
			return false;
		}
		while (i < n) {
			if (n % i == 0 ) {
				isPrime = false;
				break;
			}
			i++;
		}
		return isPrime;
	}

	private static void disp(int n, boolean isPrime) {
		if (isPrime == true) {
			System.out.println(n + "是质数" );
		} else {
			System.out.println(n + "不是质数");
		}

		return;
	}
}

