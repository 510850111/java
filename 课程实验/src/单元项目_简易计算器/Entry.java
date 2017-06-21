package 单元项目_简易计算器;

import java.util.Scanner;

public class Entry {

	public static void main(String[] args) {
		int a = inputInt("请输入a 的值:");
		int b = inputInt("请输入b的值:");
		int res = 0;
		
		Add add = new Add();
		res = add.addInt(a, b);
		
		show(res);
	}

	private static int inputInt(String string) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println(string);
		return scanner.nextInt();
	}
	
	@SuppressWarnings("unused")
	private static double inputDouble(String string) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println(string);
		return scanner.nextDouble();
	}
	
	private static void show(int res) {
		System.out.println(res);
		
	}
}
