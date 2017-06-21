
public class TEXT3 {
	private static int step = 2;
	private static int a = 0;
	public static void main(String[] args) {
		solve();
	}

	private static void solve() {    //规律：偶数项n的平方除以2，奇数项n的平方减一的差除以2
		int count = 0;
		for(int i = 0;i < 50; i++){
			disp();
			a += step;
			count++;
			if(count % 2 == 0){
				step += 2;
			}
		}
		
	}

	private static void disp() {
		System.out.printf("%d ",a);
	}
	
}
