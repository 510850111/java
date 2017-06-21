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
			System.out.printf("输入体重(kg)：");
	        double  weight = sc.nextDouble();
	        System.out.printf("输入身高(m)：");
			double  height = sc.nextDouble();
		    double bmi = weight / (height*height);
		    return  bmi; 
		}
		
		public static String convert(double bmi) {
			String str="体重肥胖";
			if(bmi<18.6){str="体重过轻";}
			else if(bmi>=18.6&&bmi<25){str="体重正常";}
			else if(bmi>=25.6&&bmi<30){str="体重过重";}
			return str;
			
		}
		
		public static void disp(Double bmi,String str) {
			DecimalFormat df = new DecimalFormat("00.00");
			System.out.print("体重指数是：" + df.format(bmi)+"，"+str);
			System.out.print("\n");
		}
}

