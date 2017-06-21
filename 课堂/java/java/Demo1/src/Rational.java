
public class Rational {
	private int numerator;
	private int denominator;
	
	public  Rational(int n) {
		this(n, 1); //��ʱ���ò�����Rational����Ϊ��ʱ�ж����ԣ���Ҳ������Ҳ�ǹ��췽���������Դ������������ε�����this
	}
	
	public Rational(int num,int den){  //���췽���������������ͬ��û�з���ֵ���Ͳ���
		setNumerator(num);
		setDenominator(den);
	}
	
	public boolean equals(Object obj) {  //�е�ǰ��������Ҫ�漰
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
		Rational y = new Rational(-x.numerator,x.denominator);  //���õ����֣�ʱʱ�̿�Ҫ֪�����ظ�����Ĵ���
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
//		Integer.parseInt("12.3")  //�ַ���ת��������
		simply();
		if(denominator == 1){
			return String.valueOf(numerator);  //��������ת�ַ���
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
	
	public  void setNumerator(/*Rational this,Ĭ�ϵ��ǵ���*/int numerator) {
		this.numerator = numerator;                 //this��ʾ��ǰ�����൱��һ��ռλ��������˭������˭���ǵ�ǰ����
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
