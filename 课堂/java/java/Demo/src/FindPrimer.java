
public class FindPrimer {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		find(100);
		System.out.println(System.currentTimeMillis() - start);
		
	}

	private static void find(int n) {
//		for (int i = 2; i < n; i++) {
////			if(isPrimer(i))
////				System.out.printf("%d ", i);
//			isPrimer(n);
//			
//		}
//		System.out.println();
		int [] a = new int [n - 2];       //�������½ⷨ 
		for(int i = 0; i < a.length;i++)a[i] = i + 2;
		
		for(int i = 0; i * i <= n;i++){
			if (a[i] == 0)continue;
			
			for(int j = i + a[i];j < a.length; j+=a[i]){//����˳�����У����ΰ�ͷ������ֵ��С��Ծ��ֵ��ʣ�µľ�������
				a[j] = 0;
			}
			for(int i1 = 0; i1 < a.length ;i1++){
				if(a[i1] != 0){
					System.out.printf("%d ",a[i1]);
				}
			}
		}
	}

	private static boolean isPrimer(int n) {
		boolean s= true;
		// int end = (int)Math.sqrt(n);
		for(int i = 2;i * i <= n;i++){
			if(n % i == 0){
				s = false;
				break;
			}
		}
		return s;
	}

}
