public class Complex {
	private final double re;   //ʵ������
	private final double im;   //��������

	// ����ʵ�����鲿,����һ������
	public Complex(double real, double imag) {
		re = real;
		im = imag;
	}

	// ����һ�����ø��Ӷ�����ַ�����ʾ
	public String toString() {
		if (im == 0) return re + "";
		if (re == 0) return im + "i";
		if (im <  0) return re + " - " + (-im) + "i";
		return re + " + " + im + "i";
	}

	public double abs()   { return Math.hypot(re, im); }  // Math.sqrt(re*re + im*im)
	public double phase() { return Math.atan2(im, re); }  // ���� -pi �� pi֮��

	// ����һ���µĶ����ֵ(+ b)
	public Complex plus(Complex b) {
		Complex a = this;             //���ö���
		double real = a.re + b.re;
		double imag = a.im + b.im;
		return new Complex(real, imag);
	}

	/**
	 * ����һ���µĶ����ֵ(this - b)
	 *          ����
	 * @param b
	 * @return
	 */
	public Complex minus(Complex b) {
		Complex a = this;
		double real = a.re - b.re;
		double imag = a.im - b.im;
		return new Complex(real, imag);
	}

	/**
	 *    ����һ������
	 * @param b  ���˵ĸ���
	 * @return
	 */
	public Complex times(Complex b) {
		Complex a = this;
		double real = a.re * b.re - a.im * b.im;
		double imag = a.re * b.im + a.im * b.re;
		return new Complex(real, imag);
	}

	/**
	 *�����˷�
	 * ����һ��ʵ��
	 */
	public Complex times(double alpha) {
		return new Complex(alpha * re, alpha * im);
	}

	/**
	 *   �����
	 * @return
	 */
	public Complex conjugate() {  return new Complex(re, -im); }

	/**
	 *     ���� a +bi �ĵ���  
	 *   a -bi
	 * ��������������������������
	 *   a^2  + b ^2
	 */
	public Complex reciprocal() {
		double scale = re * re + im * im;
		return new Complex(re / scale, -im / scale);
	}

	/**
	 *  ����ʵ������
	 * @return
	 */
	public double re() { return re; }

	/**
	 * ������������
	 * @return
	 */
	public double im() { return im; }

	/**
	 *  ���� a / b
	 */
	public Complex divides(Complex b) {
		Complex a = this;
		return a.times(b.reciprocal());
	}

	// �ӵ�һ����̬�汾
	public static Complex plus(Complex a, Complex b) {
		double real = a.re + b.re;
		double imag = a.im + b.im;
		Complex sum = new Complex(real, imag);
		return sum;
	}

	// ����
	public static void main(String[] args) {
		Complex a = new Complex(5.0, 6.0);
		Complex b = new Complex(-3.0, 4.0);

		System.out.println("a            = " + a);
		System.out.println("b            = " + b);
		System.out.println("Re(a)        = " + a.re());
		System.out.println("Im(a)        = " + a.im());
		System.out.println("b + a        = " + b.plus(a));
		System.out.println("a - b        = " + a.minus(b));
		System.out.println("a * b        = " + a.times(b));
		System.out.println("b * a        = " + b.times(a));
		System.out.println("a / b        = " + a.divides(b));
		System.out.println("(a / b) * b  = " + a.divides(b).times(b));
		System.out.println("conj(a)      = " + a.conjugate());
		System.out.println("|a|          = " + a.abs());
	}

}