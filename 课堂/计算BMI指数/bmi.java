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
		System.out.print("����������(kg):");
		weight = sc.nextDouble();
		System.out.print("���������(m):");
		height = sc.nextDouble();

		return ;
	}

	private static double cacl( double weight, double height) {

		return (weight / (height * height));
	}

	private static String judg(double caclResult) {
		String judgResult;
		if ( caclResult < 18.5 ) {
			judgResult = "���ع���";
		} else if ( caclResult > 18.5 && caclResult <= 23.9 ) {
			judgResult  = "������Χ";
		} else if (caclResult >= 24 && caclResult <= 27.9) {
			judgResult = "����,���ڷ���ǰ��";
		} else if (caclResult >= 28 && caclResult <= 29.9) {
			judgResult = "I�ȷ���";
		}else if (caclResult >= 30 && caclResult < 40) {
			judgResult = "II�ȷ���";
		}else{
			judgResult = "III�ȷ���";
		}

		return judgResult;
	}

	private static void disp(double weight, double height,double caclResult,String judgResult) {
		System.out.println("���������"+weight+"kg,�����"+height+"��,BMIָ����"+caclResult+"�����й��ο���׼,������:"+judgResult);
	}
}

