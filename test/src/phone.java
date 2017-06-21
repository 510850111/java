import java.util.Arrays;
import java.util.Scanner;

public class phone {
    public static void main(String[] args) throws Exception {
    	int num = new Scanner(System.in).nextInt();
        String []str=new String[num];
		char[] ch=new char[num];
		
		for (int i = 0; i < num; i++) {
			str [i]= new Scanner(System.in).next();
			for(int j=0;j<str.length;j++){
				ch=str[i].toCharArray();		
				Arrays.sort(ch);
			}
			for(int l=0;l< ch.length;l++){
				System.out.print(ch[l]+" ");
			}
			System.out.println();
		}	
    }
}

