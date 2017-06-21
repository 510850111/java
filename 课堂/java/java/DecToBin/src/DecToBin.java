import java.util.Scanner;

public class DecToBin {
	private static int i=0;
	public static void main(String[] args) {
		while (true) {
			int n = input();
			String bin=convert(n);
			disp(n, bin);
		}
    }
	
    public static int  input() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}
    
//     private static int[] convert(int n) {
//    	  i=0;
//    	  int[] a=new int[100];
//    	  do{
//    	      a[i]=n%2;
//    	      n=n/2;
//    	      i++;
//    	     }while(n>0);	
//	  return a;
//     }
     
     private static String convert(int n) {
    	 StringBuilder bin = new StringBuilder();
//    	 do{
//    		 bin.insert(0, n % 2);
//    		 n /= 2;
//    	 }while(n != 0);
    	 
//    	 while (true) {             //半循环
//			bin.insert(0, n % 2);
//			n /= 2;
//			if(n == 0) break;
//		}
//		return bin.toString();
    	 
    	 while (true) {             //半循环
		    bin.append(n % 2);
 			n /= 2;
			if(n == 0) break;
 		}
		return bin.reverse().toString();
	}

     private static void disp(int n, String bin) {
    	 System.out.printf("%d转换为二进制为%s",n,bin );
//         for (int j = i-1; j >=0; j--) {
//			System.out.print(bin[j]);
//		}
         System.out.println();
	
     }
   
}
