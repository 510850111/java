package calc.model;

public class OperatorFactory {
	private  static Operator[] ops;
	static{
		ops = new Operator[4];
		int i = 0;
		ops[i++] = new AddOperator();
	}
	
	public static Operator create(OperatorType t) {
		return  ops[t.ordinal()];
	}
}
