class teacher {
	int a = 100;
	static int b = 200;

	void methed() {
		int b = this.b;
		funcation();
		funcation2();
		disp();
	}

	void disp() {
		System.out.println(a);
	}
	void funcation() {

	}

	static void funcation2() {

	}
}
	
public class frmo2 {
	public static void main(String[] args) {
		teacher t = new teacher();
		t.methed();
	}
}

