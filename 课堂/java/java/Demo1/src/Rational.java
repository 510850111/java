
public class Rational {
	private int numerator;
	private int denominator;
	
	public  Rational(int n) {
		this(n, 1); //此时调用不能用Rational，因为此时有二义性，他也是类名也是构造方法名，所以处理方法就是屏蔽掉，用this
	}
	
	public Rational(int num,int den){  //构造方法名必须和类名相同，没有返回值类型部分
		setNumerator(num);
		setDenominator(den);
	}
	
	public boolean equals(Object obj) {  //判等前三步必须要涉及
		if(this == obj) return true;
		if(obj == null) return false;
//		if(!(obj instanceof Rational)) return false;
		if(this.getClass() != obj.getClass())  return false;
		
		Rational r = (Rational)obj;
		return this.subtract(r).numerator == 0;
	}
	
	public  Rational add(Rational x) {
		int num = 0;
		int den = 0;
		int b = this.getNumerator();
		int a = this.getDenominator();
		int d = x.getNumerator();
		int c = x.getDenominator();
		num = b * c + a * d;
		den = a * c;
		return new Rational(num, den);
	}
	
	public Rational subtract(Rational x) {
		Rational y = new Rational(-x.numerator,x.denominator);  //复用的体现，时时刻刻要知道对重复代码的处理
		return this.add(y);
	}
	
	public Rational multiply(Rational x) {
		int num = 0;
		int den = 0;
		int b = this.getNumerator();
		int a = this.getDenominator();
		int d = x.getNumerator();
		int c = x.getDenominator();
		num = b * d;
		den = a * c;
		return new Rational(num, den);
	}
	
	@Override
	public String toString(){
//		Integer.parseInt("12.3")  //字符串转基本类型
		simply();
		if(denominator == 1){
			return String.valueOf(numerator);  //基本类型转字符串
		}
		return String.format("%d/%d", numerator,denominator);
	}
	
	public  void simply() {
		int gcd = find(numerator,denominator);
		numerator /= gcd;
		denominator /= gcd;
		if(denominator < 0){
			numerator *= -1;
			denominator = -denominator;
		}
	}

	public static int find(int n, int m) {
		int r;
		while ((r = n % m) != 0) {
			n = m;
			m = r;
		}
		return Math.abs(m);
	}

	public Rational division(Rational x) {
		Rational y = new Rational(x.denominator,x.numerator);
		return this.multiply(y);
	}
	
	public int getNumerator(){
		return numerator;
	}
	
	public  void setNumerator(/*Rational this,默认的是调用*/int numerator) {
		this.numerator = numerator;                 //this表示当前对象，相当于一个占位符，，，谁调用它谁就是当前对象
	}
	
	public int  getDenominator() {
		return denominator;
	}
	
	public void setDenominator(int den) {
		if(den == 0) return;
		denominator = den;
	}
	
	public  int compareTo(Rational obj) {
		Rational res = this.subtract(obj);
		res.simply();
		return res.getNumerator();
	}
}
