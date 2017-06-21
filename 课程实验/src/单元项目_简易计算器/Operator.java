package 单元项目_简易计算器;

public class Operator {
	public double addDouble(double a ,double b) {
		return a + b;
	}
	
	public double subtractionDouble(double a ,double b) {
		return a - b;
	}
	
	public double multiplicationDouble(double a ,double b) {
		return a * b;
	}
	
	public double divisionDouble(double a,double b) {
		if (b == 0) {
			System.err.println("被除数不能为0!");
			return 0;
		}
		return a/b;
	}
	
}

class Add extends Operator{
	public int  addInt(int a,int b) {
		return a+b;
	}
}

class Sub extends Operator{
	public int subtractionInt(int a,int b){
		return a-b;
	}
}
	
class Mul extends Operator{
	public int  multiplicationInt(int a ,int b) {
		return a * b;
	}
}

class Div extends  Operator{
	 public int divisionInt(int  a , int b) {
		if (b== 0) {
			System.out.println("被除数不能为0!");
		}
		return a/b;
	}
}
