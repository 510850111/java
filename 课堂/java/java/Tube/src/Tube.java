import java.util.Scanner;


public class Tube {
	private static char[][] tube;
	private static int[]  m;
	public static void main(String[] args) {
		while (true) {
			 int n = input();
				init();
				solve(n);
				disp();
		}
	}

	private static int input() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
		
	}

	private static void init() {
		 tube = new char[5][3];
		 m = new int[10];
		 tube[0][1] = '_';
		 tube[1][0] = '|';
		 tube[2][1] = '_';
		 tube[1][2] = '|';
		 tube[4][1] = '_';
		 tube[3][0] = '|';
		 tube[3][2] = '|';
		 int[] w = new int[3];
		 int[] h = new int[5];
		 for (int i = 0; i < m.length; i++) {
			m[i] = i;
		}
	}

	private static void solve(int n) {
		switch (n) {	
//		case 0:
//			tube[0][1] = '_';
//			tube[4][1] = '_';
//			tube[1][0] = '|'; 
//			tube[1][2] = '|'; 
//			tube[3][0] = '|';
//			tube[3][2] = '|'; 
//			break;
//		case 1:
//			tube[1][2] = '|';
//			tube[3][2] = '|'; 
//			break;
//		case 2:
//			tube[0][1] = '_';
//			tube[1][2] = '|';
//			tube[2][1] = '_';
//			tube[3][0] = '|';
//			tube[4][1] = '_';
//			break;
//		case 3:
//			tube[0][1] = '_';
//			tube[1][2] = '|';
//			tube[2][1] = '_';
//			tube[3][2] = '|';
//			tube[4][1] = '_';
//			break;
//		case 4:
//			tube[1][0] = '|';
//			tube[2][1] = '_';
//			tube[1][2] = '|';
//			tube[3][2] = '|';
//			break;
//		case 5:
//			tube[0][1] = '_';
//			tube[1][0] = '|';
//			tube[2][1] = '_';
//			tube[4][1] = '_';
//			tube[3][2] = '|';
//			tube[4][1] = '_';
//			break;
//		case 6:
//			tube[0][1] = '_';
//			tube[1][0] = '|';
//			tube[2][1] = '_';
//			tube[4][1] = '_';
//			tube[3][0] = '|';
//			tube[3][2] = '|';
//			tube[4][1] = '_';
//			break;
//		case 7:
//			tube[0][1] = '_';
//			tube[1][2] = '|';
//			tube[3][2] = '|';
//			break;
//		case 8:
//			tube[0][1] = '_';
//			tube[1][0] = '|';
//			tube[2][1] = '_';
//			tube[1][2] = '|';
//			tube[4][1] = '_';
//			tube[3][0] = '|';
//			tube[3][2] = '|';
//			break;
//		case 9:
//			tube[0][1] = '_';
//			tube[1][0] = '|';
//			tube[2][1] = '_';
//			tube[1][2] = '|';
//			tube[4][1] = '_';
//			tube[3][2] = '|';
//			tube[4][1] = '_';
//			break;

		default:
			break;
		}	
	}

	private static void disp() {
		for (int i = 0; i < tube.length; i++) {
			for (int j = 0; j < tube[i].length; j++) {
				System.out.printf("%c ",tube[i][j]);
			}
			System.out.println();
		}
	}
}
