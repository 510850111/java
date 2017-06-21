import javax.naming.InitialContext;


public class JoseCircle {
	private static int[] kids;
	private static int m = 3;
	public static void main(String[] args) {
		init();
		int winner = f2(100000000);
//		int winner = solve();
		disp(winner);
	}
	
	private static int f2(int n) {
		int[] a = new int [n];
		for(int i = 1; i < n; i++){
			a[i] = (a[i - 1] + m) % (i + 1);
		}
		return a[n - 1] + 1;
	}
	
	private static int f(int n) {
		if(n == 1) return 0;
		
		return (f(n - 1) + m) % n;
	}
	
	private static void init() {
		int n = 100000;
		kids = new int[n];
		
	}
	private static int solve() {
//		int count = 0;        //����һ�δ�����룬�㷨����,���Ѿ���ǵ�ֵ֮��û�н�����������
//		int winner = 0;
//		for(int i = 2;count == 16 ;i+=m ){
//			if(kids[i % 17] == -1){
//				i++;
//				continue;
//			}
//			kids[i % 17] = -1;
//			count++;
//		}
		int r = kids.length;
		int index = -1,count = 0;//index�ĸ�ֵ�����ڻ��Ĵ������Ȼ�Ȧ������ɷ�������ǣ���
		while(r > 1){
			index = (index + 1) % kids.length;
			if(kids[index] == 1)continue;
			count++;
//			if(count % m == 0){
//				kids[index] = 1;
//				r--;
//			}
			if(count  == m){
				kids[index] = 1;
				r--;
				count = 0;
			}
//			index = (index + 1) % kids.length; //�ȱ�������λ��
		}
		
	    
		return getWinner();
	}
	private static int getWinner() {
		int winner = 0;
		for (int i = 0; i < kids.length; i++) {
			if(kids[i] == 0){
				winner = i + 1;
				break;//���ʵ�break��ֻ��һ��ֵ���ҵ�һ�����ǽ����Ϊ��������Ḻ����
				}
		}
		return winner;
	}
	private static void disp(int winner) {
		System.out.print(winner);
	}

}
