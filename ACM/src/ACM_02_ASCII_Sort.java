import java.util.Scanner;	
public class ACM_02_ASCII_Sort {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = null;	
		
		char temp;
		int num = sc.nextInt();
		
		
		
		for(int i = num;i>0;i--){
			str = sc.next();
			char [] stringArr = str.toCharArray();
			
			for(int j = 0; j < 3; j++){
				System.out.println("For j stringArr[k]:"+stringArr[j]);
				for(int k = 0;k < 2 -j;k++){
					if(stringArr[k]<stringArr[k+1]){
						temp = (char) stringArr[k];
						stringArr[k] = stringArr[k+1];
						stringArr[k+1] = temp;
						System.out.println("for k stringArr[k]:"+stringArr[k]);
					}
					System.out.println("for k end stringArr[k]:"+stringArr[k]);
				}
			
			}
		
			for (int m = 0; m <= num; m++) {
				System.out.println(stringArr[m]);
		}
		

		}
	}
}


