import java.beans.IntrospectionException;



public class Combination {
	private static int[] nums = new int[3];
	private static int n = 5;
	private static int m = 3;
	public static void main(String[] args) {
		solve();
	}
	
	private static void solve() {
		int i = 0;
		nums[i] = 1;
		while(true){
			if(nums[i] <= n){
				if(i == m - 1){
					disp();
					nums[i]++;
					continue;
				}
				i++;
				nums[i] = nums[i - 1] + 1;
			}else{
				i--;
				if(i < 0) break;
				nums[i]++;
			}
			
		}
	}

	private static void disp() {
		for(int i = 0; i < nums.length;i++){
			System.out.printf("%3d",nums[i]);
		}
		System.out.println();
	}

}
