
public class TEXT1 {
	private static int[][] nums = {{11,23,67},{41,45,9},{17,33,8}};
	private static int sum;
	public static void main(String[] args) {
		solve();
		disp();
	}
	
	private static void solve() {
		int sum1 = nums[0][0] + nums[1][1] + nums[2][2];
		int sum2 = nums[2][0] + nums[1][1] + nums[0][2];
		sum = sum1 + sum2;
	}
	
	private static void disp() {
		for(int i = 0;i<nums.length;i++){
			for(int j = 0;j<nums[0].length;j++){
				System.out.printf("%3d",nums[i][j]);
			}
			System.out.println();
		}
		System.out.println(sum);
	}

}
