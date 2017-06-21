import java.awt.Checkbox;


public class suduku {
	private static int step = 1;
	private static int[][] nums ={
		{-2,-1,0,-6,-3,0,-8,-9,0},
		{0,-4,0,0,0,-7,0,0,-5},
		{0,0,0,-9,0,0,0,0,-7},
		{0,0,-2,0,0,0,0,-4,0},
		{-4,0,0,-1,0,-2,0,0,-6},
		{0,-6,0,0,0,0,-1,0,0},
		{-7,0,0,0,0,-3,0,0,0},
		{-8,0,0,-7,0,0,0,-6,0},
		{0,-3,-5,0,-9,-4,0,-2,-1},
	};
	
	public static void main(String[] args) {
		solve();
		disp();
	}
	
	private static void solve() {
		int index = -1;
		while (true) {
			index = index + step;
			if(index < 0||index >= 81) break;
			int r = index / nums[0].length;
			int c = index % nums[0].length;
			if(nums[r][c] < 0)continue;
			
			int num = nums[r][c] + 1; 
			while(!check(num,r,c)) num++;
			if(num < 10) {
				nums[r][c] = num;
				step = 1;
			}else {
				nums[r][c] = 0;
				step = -1;
			}
		}
	}
	
	private static boolean check(int num, int r, int c) {
		return checkRow(num, r, c) && checkColumn(num, r, c) && checkGrids(num, r, c);
	}
	
	private static boolean checkGrids(int num, int row, int col) {
		boolean s = true;
		int r = (row / 3) * 3;
		int c = (col / 3) * 3;
		for(int i = r; i < r + 3;i++){
			for(int j = c; j< c + 3;j++){
				if(Math.abs(nums[i][j])==num){
					s = false;
					break;
				}
			}
		}
		return s;
	}
	
	private static boolean checkColumn(int num, int r, int c) {
		boolean s = true;
		for(int i = 0; i < nums[0].length;i++){
			if(Math.abs(nums[i][c])==num ){
				s = false;
				break;
			}
		}
		return s;
	}
	
	private static boolean checkRow(int num, int r, int c) {
		boolean s = true;
		for(int i = 0; i < nums[0].length;i++){
			if(Math.abs(nums[r][i])==num ){
				s = false;
				break;
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
