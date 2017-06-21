import java.util.Scanner;
public class clacDays {
	static int year,month,day;	//定义全局变量,用static修饰,加载进内存
	public static void main(String[] args) {
		input();
		int days = clac(year,month,day);
		disp(days);
	}

	private static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入年份:");
		year = sc.nextInt();
		System.out.print("请输入月份:");
		month = sc.nextInt();
		System.out.print("请输入天数");
		day = sc.nextInt();
	}

	private static int clac(int year, int month, int day) {
		int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	//这是每个月的天数
		int temp = 0;
		for (int i = 0 ; i < month - 1 ; i++) {
			temp += monthDays[i];	//这是对每个月的天数进行累加
		}
		if ((year % 400 == 0  ||  (year % 4 == 0 && year % 100 != 0)) && month > 2){
			//判断是否是闰年
			return (temp + 1 + day);
		}else{
			return (temp + day);
		}
	}

	private static void disp(int days) {
		System.out.println(year+"年"+month+"月"+day+"日距离"+year+"年有"+days+"天");
	}
}

