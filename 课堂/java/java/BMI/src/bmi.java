import java.util.Scanner;
import java.text.DecimalFormat;

public class bmi {
	public static void main(String[] args) {
		while (true) {
		   double bmi = input();
		   String str = convert(bmi);
		   disp(bmi, str);
		}
		}
	
		public static double input(){
			Scanner sc = new Scanner(System.in);
			System.out.printf("��������(kg)��");
	        double  weight = sc.nextDouble();
	        System.out.printf("�������(m)��");
			double  height = sc.nextDouble();
		    double bmi = weight / (height*height);
		    return  bmi; 
		}
		
		public static String convert(double bmi) {
			String str="���ط���";
			if(bmi<18.6){str="���ع���";}
			else if(bmi>=18.6&&bmi<25){str="��������";}
			else if(bmi>=25.6&&bmi<30){str="���ع���";}
			return str;
			
		}
		
		public static void disp(Double bmi,String str) {
			DecimalFormat df = new DecimalFormat("00.00");
			System.out.print("����ָ���ǣ�" + df.format(bmi)+"��"+str);
			System.out.print("\n");
		}
}

