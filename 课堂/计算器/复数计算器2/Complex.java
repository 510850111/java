public class Complex {
	private final double re;   //实数部分
	private final double im;   //虚数部分

	public Complex(double real, double imag) {
		re = real;
		im = imag;
	}

	// 返回一个调用复杂对象的字符串表示
	public String toString() {
		if (im == 0) return re + "";
		if (re == 0) return im + "i";
		if (im <  0) return re + " - " + (-im) + "i";
		return re + " + " + im + "i";
	}


	// 加法
	public Complex plus(Complex b) {
		Complex a = this;             //调用对象
		double real = a.re + b.re;
		double imag = a.im + b.im;
		return new Complex(real, imag);
	}

	/**
	 * 返回一个新的对象的值(this - b)
	 *          减法
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
	 *    乘以一个复数
	 * @param b  被乘的复数
	 * @return
	 */
	public Complex times(Complex b) {
		Complex a = this;
		double real = a.re * b.re - a.im * b.im;
		double imag = a.re * b.im + a.im * b.re;
		return new Complex(real, imag);
	}

	/**
	 *标量乘法
	 * 乘以一个实数
	 */
	public Complex times(double alpha) {
		return new Complex(alpha * re, alpha * im);
	}

	/**
	 *   共轭复数
	 * @return
	 */

	public Complex reciprocal() {
		double scale = re * re + im * im;
		return new Complex(re / scale, -im / scale);
	}

	/**
	 *  返回实数部分
	 * @return
	 */
	public double re() { return re; }

	/**
	 * 返回虚数部分
	 * @return
	 */
	public double im() { return im; }

	/**
	 *  返回 a / b
	 */
	public Complex divides(Complex b) {
		Complex a = this;
		return a.times(b.reciprocal());
	}

	// 加法
	public static Complex plus(Complex a, Complex b) {
		double real = a.re + b.re;
		double imag = a.im + b.im;
		Complex sum = new Complex(real, imag);
		return sum;
	}
}
