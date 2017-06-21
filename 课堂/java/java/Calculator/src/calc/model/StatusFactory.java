package calc.model;

public class StatusFactory {
	private static Status[] cs;
	
	
	static{
		cs = new Status[4];
		int i = 0;
		cs[i++] = null;
		cs[i++] = new LeftInputedStatus();
	}
	
	public static Status create(StatusType t) {
		return cs[t.ordinal()];
	}
}
