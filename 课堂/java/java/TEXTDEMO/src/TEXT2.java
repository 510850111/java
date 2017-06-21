
public class TEXT2 {
	private static int i;
	public static void main(String[] args) {
		solve();
	}

	private static void solve() {
		for(i = 1000;i < 10000;i++){
			int a = i % 10;
			int b = (i / 10) % 10;
			int c = (i / 100) % 10;
			int d = i / 1000;
			if(a == 0 && b == 0)break;
			if(i == (10*a+b)*(10*c+d) || i == (10*a+c)*(10*b+d)|| i == (10*a+d)*(10*b+c)|| i == (10*b+a)*(10*d+c)|| i == (10*c+a)*(10*d+b)|| i == (10*d+a)*(10*c+b)){
				disp();
			}
		}
	}

	private static void disp() {
		System.out.printf("%d ",i);
	}
}
