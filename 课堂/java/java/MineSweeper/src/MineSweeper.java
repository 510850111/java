import java.util.Random;
import java.util.concurrent.CountDownLatch;

import javax.naming.InitialContext;
import javax.xml.ws.Dispatch;


public class MineSweeper {
	private static int[][] map;
	private static int max = 10;
	public static void main(String[] args) {
		init();
		arrange();
		calc();
		disp();
		
	}

	private static void init() {
		int n = 10;
		map = new int[n][n];
		
	}

	private static void arrange() {
//		Random r = new Random();
//		for(int i = 0;i <= 9;){
//			int x = r.nextInt(10);//得到0-9之间的整数
//			int y = r.nextInt(10);
//			if(map[x][y] == -1)continue;
//			map[x][y] = -1;
//			i++;
//			}
		
		int x = map.length, y = map[0].length;
		int [] idxs = new int[x * y];
		for (int i = 0; i < idxs.length;i++){
			idxs[i] = i; 
		}
		
		Random ran = new Random();
		int count = 0;
		while (count < max) {
			int index = ran.nextInt(idxs.length - count);
			int r = idxs[index] / y;
			int c = idxs[index] % y;
			map[r][c] = -1;
			idxs[index] = idxs[idxs.length - 1 - count];
			count++;
		}
	}

	private static void calc() {
		for (int j = 0; j < map.length; j++) {
		     for (int i = 0; i < map[j].length; i++) {
				if(map[i][j] == -1) continue;
			
				map[i][j] = getMines(i , j);
			 }    
		}
		
	}

	private static int getMines(int r, int c) {
		int count = 0;
		for (int  i = r - 1; i <=r + 1; i++) {
			for (int j = c - 1; j <=c + 1; j++) {
				
					if(!checkIndex(i,j))continue;
					if(map[i][j] == -1)
						count++;
				
			}
		}
		return count;
	}

	private static boolean checkIndex(int r, int c) {
		return (r >= 0 && r < map.length && c >= 0 && c < map[0].length);
	}

	private static void disp() {
		for (int j = 0; j < map.length ; j++) {
		     for (int i = 0; i < map[j].length; i++) {
				System.out.printf("%3d",map[j][i]);
			 }
		    System.out.println();
		    }
		}
		
	}

