import java.util.Scanner;
public class printPrimes {
	public static void main(String[] args) {
		int n = input();
		int [] leaps = get(n);
		disp(leaps);
	}

	private  static int input() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}

	private static int[] get(int n) {
		int[] array = new int[24];
		int point = 0;
		n = n +100;
		System.out.print("date is " + n);
		for (int i = 0; i < n ; i++) {
			if ((n % 400 == 0) || ((n % 4 == 0) && (n % 100 != 0))) {
				array[point] = n;
				System.out.println("date is " + n);
				point++;
			}
			// System.out.print("for end");
		}
		// System.out.print(" get end ");
		return array;
	}

	private  static void disp(int[] leaps) {
		for (int i = 0; i < leaps.length; i++ ) {
			System.out.print(leaps[i] + " ");
			if (i % 5 == 0) {
				System.out.println();
			}
		}
		return;
	}
}

