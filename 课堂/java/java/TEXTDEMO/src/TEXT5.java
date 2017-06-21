import java.util.Scanner;



public class TEXT5 {
	private static int n ;
	private static int x;
	public static void main(String[] args) {
	    input();
		solve();
	}

	private static void solve() {
		for(int i = 1;i <= n ;i++){
			 x = Fib(i);
			disp();
		}
	}

	private static void input() {
		Scanner sc = new Scanner(System.in);
		 n = sc.nextInt();
		
	}

	private static int Fib(int i) {
		if (i == 0) return 0;
		if(i == 1 || i == 2)return 1;
		else return Fib(i - 1) + Fib(i - 2);
	}

	private static void disp() {
		System.out.printf("%d ",x);
		
	}
}
