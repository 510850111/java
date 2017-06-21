
public class fullNumber {
	private static int step = 1;
	private static int[][] nums ;
	public static void main(String[] args) {
//		init();
		solve();
		disp();
	}
	
//	private static void init() {
//		for(int i = 0;i < nums.length;i++){
//			for(int j = 0; j< nums[0].length;j++){
//				nums[i][j] = -2; 
//			}
//		}
//	}

	private static void solve() {
		int index = -1;
		while(true){
			index = index + step;
			if(index < 0 || index > 9) break;
			int r = index / nums[0].length;
			int c = index % nums[0].length;
			int num = nums[r][c] + 1;
			while(!chack(num,r,c)) num++;
			if(num < 10){
				nums[r][c] = num;
				step = 1;
			}else {
				nums[r][c] = 0;
				step = -1;
			}
		}
	}
	
	private static boolean chack(int num, int row, int col) {
		boolean s = true;
		int r = (row / 3) * 3;
		int c = (col / 3) * 3;
		for(int i = r; i < r + 3;i++){
			for(int j = c; j< c + 3;j++){
				if(nums[r][c] + 1 == num){
					s = false;
					break;
				}else if (nums[r][c] - 1 == num ) {
					s = false;
					break;
				}
			}
		}
		return s;
	}

	private static void disp() {
		for(int i = 0;i < nums.length;i++){
			for (int j = 0; j < nums[0].length; j++) {
				System.out.printf("%3d",Math.abs(nums[i][j]));
			}
			System.out.println();
		}
	}
}
