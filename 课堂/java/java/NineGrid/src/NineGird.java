/*
  import java.util.Scanner;

import javax.naming.InitialContext;
import javax.xml.ws.Dispatch;


public class NineGird {
	
	private static int[][] grid;
	private static int n;
	public static void main(String[] args) {
	   while(true){ 
		   int n = input();
		   init();
		   solve();
		   disp();
	   }
	}
	
	private static int input() {
		Scanner sc = new Scanner(System.in);
		 n = sc.nextInt();
		return n;
	}

	private static int[][] init() {
		grid = new int[n][n];
		int row = 0,col = n / 2;    
		for(int i = 1;i <= n * n;i++){
			grid[row][col] = i;
			row--;
		    col++;
		    if(row < 0 && col >= n){
		    	row += 2;
		    	col--;
		    	}
		    else if(row < 0){
		    	row = n - 1;
		    	}
		    else if(col >= n){
		        col = 0;
		        }
		    else if(grid[row][col] != 0){
		    	row += 2;
		    	col--;
		    	}
		    }
		return grid;
	}
	
	private static void solve() {
		
		
	}
	
	private static void disp() {
		for (int j = 0; j < grid.length; j++) {
	     for (int i = 0; i < grid[0].length; i++) {
			System.out.print("%3d",grid[j][i]);
		 }
	    System.out.println();
	    }
	}
	
	
		
}
*/

 import java.util.Scanner;

import javax.naming.InitialContext;
import javax.xml.ws.Dispatch;


public class NineGird {
	
	private static final int n = 0;
	private static int[][] grid;
	public static void main(String[] args) {
	   while(true){ 
		   int n = input();
		   init();
		   solve();
		   disp();
	   }
	}
	
	private static int input() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}

	private static void init() {
//		int n = Primer.input();
		grid = new int[n][n];
		
	}
	
	private static void solve() {
		int n = grid.length;
		int row = n / 2;
		int col = n - 1;
		for (int i = n * n; i >= 1; i--) {
			grid[row][col] = i;
			row = (row + 1) % n;
			col = (col + 1) % n;
			if (grid[row][col] != 0){
				row = (row - 1 + n) % n;  //加周期 周期函数值不变
				col = (col - 1 + n - 1) % n;	
			
			}   
		}
		
	}
	
	private static void disp() {
		for (int j = 0; j < grid.length; j++) {
	     for (int i = 0; i < grid[i].length; i++) {
			System.out.printf("%-3d",grid[j][i]);
		 }
	    System.out.println();
	    }
	}
	
	
		
}
