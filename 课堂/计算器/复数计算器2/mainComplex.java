import java.util.Scanner;
public class mainComplex {

	// ����
	public static void  main(String[] args) {

		double a_re = input("��������ʽA��ʵ������");
		double a_im = input("��������ʽA����������(����i)");
		double b_re = input("��������ʽB��ʵ������");
		double b_im = input("��������ʽB����������(����i)");

		Complex a = new Complex(a_re, a_im);
		Complex b = new Complex(b_re, b_im);

		System.out.println("a            = " + a);
		System.out.println("b            = " + b);
		System.out.println("ʵ������(a)	 = " + a.re());
		System.out.println("��������(a)	 = " + a.im());
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

