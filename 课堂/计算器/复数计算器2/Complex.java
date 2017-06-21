public class Complex {
	private final double re;   //ʵ������
	private final double im;   //��������

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


	// �ӷ�
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

	// �ӷ�
	public static Complex plus(Complex a, Complex b) {
		double real = a.re + b.re;
		double imag = a.im + b.im;
		Complex sum = new Complex(real, imag);
		return sum;
	}
}
