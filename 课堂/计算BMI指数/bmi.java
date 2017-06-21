import java.util.Scanner;
public  class bmi {
	static double weight, height;
	public static void main(String[] args) {
		double caclResult;
		String judgResult;
		input();
		caclResult = cacl(weight, height);
		judgResult = judg(caclResult);
		disp(weight,height,caclResult, judgResult);
		main(null);
	}

	private static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入体重(kg):");
		weight = sc.nextDouble();
		System.out.print("请输入身高(m):");
		height = sc.nextDouble();

		return ;
	}

	private static double cacl( double weight, double height) {

		return (weight / (height * height));
	}

	private static String judg(double caclResult) {
		String judgResult;
		if ( caclResult < 18.5 ) {
			judgResult = "体重过低";
		} else if ( caclResult > 18.5 && caclResult <= 23.9 ) {
			judgResult  = "正常范围";
		} else if (caclResult >= 24 && caclResult <= 27.9) {
			judgResult = "超重,属于肥胖前期";
		} else if (caclResult >= 28 && caclResult <= 29.9) {
			judgResult = "I度肥胖";
		}else if (caclResult >= 30 && caclResult < 40) {
			judgResult = "II度肥胖";
		}else{
			judgResult = "III度肥胖";
		}

		return judgResult;
	}

	private static void disp(double weight, double height,double caclResult,String judgResult) {
		System.out.println("你的体重是"+weight+"kg,身高是"+height+"米,BMI指数是"+caclResult+"按照中国参考标准,你属于:"+judgResult);
	}
}

