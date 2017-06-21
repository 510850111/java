import java.util.zip.ZipEntry;


public class Complex {
	private int real;
	private int imaginary;
	public  Complex(int rea,int ima){
		setReal(rea);
		setImaginary(ima);
	}
	
	public String toString(){
		if(Math.abs(imaginary) == 1){
			return String.valueOf(real) + "i";  //基本类型转字符串
		}
		else if (imaginary < 0) {
		    return String.format("%d %di", real,imaginary);
		}
		return String.format("%d +%di", real,imaginary);
	}
	
	public  boolean equals(Object obj) {  //判等前三步必须要涉及
		if(this == obj) return true;
		if(obj == null) return false;
		if(this.getClass() != obj.getClass())  return false;
		Complex r = (Complex)obj;
		return this.subtract(r).real == 0;
	}
	
	public Complex add(Complex x){
		int rea = 0;
		int ima = 0;
		int a = this.getReal();
		int b = this.getImaginary();
		int c = x.getReal();
		int d = x.getImaginary();
		rea = a + c;
		ima = b + d;
		return new Complex(rea, ima);
	}
	
	public Complex subtract(Complex x) {
		Complex y = new Complex(-x.real,x.imaginary);
		return this.add(y);
	}
	
	public Complex multuply(Complex x){
		int rea = 0;
		int ima = 0;
		int a = this.getReal();
		int b = this.getImaginary();
		int c = x.getReal();
		int d = x.getImaginary();
		rea = a * c - b * d;
		ima = b * c + a * d;
		return new Complex(rea, ima);
	}
	
	public Complex division(Complex x){
		int rea = 0;
		int ima = 0;
		int a = this.getReal();
		int b = this.getImaginary();
		int c = x.getReal();
		int d = x.getImaginary();
		rea = (a * c + b * d)/(c * c + d * d);
		ima = (b * c - a * d)/(c * c + d * d);
		return new Complex(rea, ima);
	}
	
	public void setImaginary(int ima) {
		this.imaginary = ima;
	}
	
	public void setReal(int rea) {
		this.real = rea;
	}
	
	public int getReal() {
		return real;
	}
	
	public int getImaginary() {
		return imaginary;
	}

}
