package calc.model;

public class CalcServer {
	private Operand left;
	private Operand right;
	private Operator op;
	private Status status;
	
	
	public void execute() {
		if (op == null) return;
		
		op.execute(left, right);
	}
	
	public void pressedNumber(String num){
		status.pressedNumber(num);
	}
	
	public void setStatus(String name){
		StatusType t = StatusType.valueOf(name);
		status = StatusFactory.create(t);
	}
	
	public void setOperator(String name){
		OperatorType t = OperatorType.valueOf(name);
		op = OperatorFactory.create(t);
	}
	
	public String getLeftNumber() {
		return left.getValue();
	}
	
	public void setLeftNumber(String num) {
		left.setValue(num);
	}
	
	public String getRightNumber() {
		return right.getValue();
	}
	
	public void setRightNumber(String num) {
		right.setValue(num);
	}
}
