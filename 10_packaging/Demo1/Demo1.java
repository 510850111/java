//封装

import java.util.Scanner;

class student {

	String name = "孙燕姿";
	private int age;

	public void setAge(int inputAge) {
		if (inputAge > 0 && inputAge < 250) {
			age = inputAge;
		} else {
			System.out.println("年龄输入不正确!");
		}
	}

	public  void show() {
		System.out.println(name);
		System.out.println(age);
	}

}

public class Demo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		student s = new student();
		s.setAge(sc.nextInt());
		s.show();
	}
}

