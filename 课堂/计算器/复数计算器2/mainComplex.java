import java.util.Scanner;
public class mainComplex {

	// 测试
	public static void  main(String[] args) {

		double a_re = input("请输入表达式A的实数部分");
		double a_im = input("请输入表达式A的虚数部分(不含i)");
		double b_re = input("请输入表达式B的实数部分");
		double b_im = input("请输入表达式B的虚数部分(不含i)");

		Complex a = new Complex(a_re, a_im);
		Complex b = new Complex(b_re, b_im);

		System.out.println("a            = " + a);
		System.out.println("b            = " + b);
		System.out.println("实数部分(a)	 = " + a.re());
		System.out.println("虚数部分(a)	 = " + a.im());
		System.out.println("b + a        = " + b.plus(a));
		System.out.println("a - b        = " + a.minus(b));
		System.out.println("a * b        = " + a.times(b));
		System.out.println("b * a        = " + b.times(a));
		System.out.println("a / b        = " + a.divides(b));
	}

	@SuppressWarnings("resource")
	public static double input(String tips) {

		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.print(tips + ":");

		return sc.nextDouble();
	}

}

