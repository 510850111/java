import java.util.Scanner;
public class clacDays {
	static int year,month,day;	//����ȫ�ֱ���,��static����,���ؽ��ڴ�
	public static void main(String[] args) {
		input();
		int days = clac(year,month,day);
		disp(days);
	}

	private static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���������:");
		year = sc.nextInt();
		System.out.print("�������·�:");
		month = sc.nextInt();
		System.out.print("����������");
		day = sc.nextInt();
	}

	private static int clac(int year, int month, int day) {
		int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	//����ÿ���µ�����
		int temp = 0;
		for (int i = 0 ; i < month - 1 ; i++) {
			temp += monthDays[i];	//���Ƕ�ÿ���µ����������ۼ�
		}
		if ((year % 400 == 0  ||  (year % 4 == 0 && year % 100 != 0)) && month > 2){
			//�ж��Ƿ�������
			return (temp + 1 + day);
		}else{
			return (temp + day);
		}
	}

	private static void disp(int days) {
		System.out.println(year+"��"+month+"��"+day+"�վ���"+year+"����"+days+"��");
	}
}

