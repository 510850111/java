import java.awt.Checkbox;
import java.beans.IntrospectionException;


public class FillNums {
	private static int[][] girds;
	private static int step = 1;
	
	public static void main(String[] args) {
		init();
		solve();
		disp();
	}

	private static void init() {
		girds = new int[][]{{11,11,11,11},{11,11,11,11},{11,11,11,11}};
	}

	private static void solve() {
	 int index = -1,num = 0,count = 0;
	 while(true){
		 index += step;
		 if(index == 0)break;
		 if(index ==girds.length*girds[0].length ){
			 disp();
			 step =-1;
			 continue;
		 }
		 int r = index / girds[0].length;
  		 int c = index % girds[0].length;
  		 num = step == 1 ? 0 : girds[r][c] + 1;
  		 while(num < 10 && !Check(num,r,c))
  			 num++;
  		 
  		 
  		 
  		 if(num == 10){
  			 step = -1;
  			 girds[r][c] = 11;
  		 }else {
			girds[r][c] = num;
			step = 1;
		}
  		 
	 }
		
	}

	private static boolean Check(int n, int r, int c) {
		return checkRange(n,r,c) && checkAround(n,r,c);
	}

	private static boolean checkAround(int n, int r, int c) {
		boolean s = true;
		for(int i = r-1;i<=r+1;i++){
			for(int j=c-1;j<=c+1;j++){
				if(!checkIndex(i,j))continue;
				
				if(Math.abs(girds[i][j] - n) ==1){
					s = false;
					break;
				}
			}
		}
		return s;
	}

	private static boolean checkIndex(int i, int j) {
		return (i >= 0 && j >= 0 && girds[i][j] >=0);
	}

	private static boolean checkRange(int n, int r, int c) {
		boolean s = true;
		int end = r * girds[0].length + c;
		for(int i = 1;i < end;i++){
			int row = i / girds[0].length;
	  		int col = i % girds[0].length;
	  		if(girds[row][col] ==n){
	  			s = false;
	  			break;
	  		}
		}
		return s;
	}

	private static void disp() {
		for(int i = 0;i < girds.length;i++){
			for (int j = 0; j < girds[0].length; j++) {
				if(i == 0 &&j == 0){
					System.out.printf("%3s","");
				    continue;
				}
				if(i == girds.length - 1 && j == girds[i].length - 1)break;
				System.out.printf("%3d",Math.abs(girds[i][j]));
			}
			System.out.println();
		}
	}

}
