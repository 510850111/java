package dateSwitch;

import java.util.Scanner;

public class dateSwitch {
	private static int year;
	private static int month;
	private static int day;
public static void main(String[] args) {
	input();
	int days = convert();
	disp(days);
}

private static void input() {
	Scanner sc = new Scanner(System.in);
	System.out.print("��������ݣ�");
    year = sc.nextInt();
	System.out.print("�������·ݣ�");
    month = sc.nextInt();
	System.out.print("���������ڣ�");
    day = sc.nextInt();
}

private static int convert() {
	int[] daysOf365 = {0,31,59,90,120,151,181,212,243,273,304,334,365};
	int days = daysOf365[month - 1] + day;
	if(month > 2 && isLeap(year))
		days++;
	return days;
}

public static boolean isLeap(int y) {
//	if((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)    ////���������Ż���ʶ���ܼ򵥵ľͼ�
//		return true;
//	else {
//		return false;
//	}
	return((y % 4 == 0 && y % 100 != 0) || y % 400 == 0); 
}

private static void disp(int days) {
	System.out.printf("%d��%d��%d����%d��ĵ�%d��", year,month,day,year,days);
  }
}

